package ge.tbc.data.steps;

import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Page;
import ge.tbc.data.Constants;
import ge.tbc.data.pages.LoansPage;
import org.testng.Assert;

import java.net.URI;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class LoansPageSteps extends LoansPage {
    private final Page page;

    public LoansPageSteps (Page page){
        super(page);
        this.page = page;
    }
    public LoansPageSteps moveToLoansPage(){
        forMeButton.hover();
        consumerLoan.click();
        loanTerms.click();
        return this;
    }
    public LoansPageSteps applyButtonCheck(){
        assertThat(applyButton).isVisible();
        assertThat(applyButton).isEnabled();
        return this;
    }

    public LoansPageSteps validateRedirectToTbccredit() {
        //BrowserContext არის ბრაუზერის სესია — ყველა ტაბი ამ კონტექსტში ცხოვრობს.
        //რადგან ახალი ტაბი იხსნება, ის იმავე context-ში ჩნდება.
        //ამიტომ context გვჭირდება, რომ დავიჭიროთ ახალი page.
        BrowserContext context = page.context();

        Page newPage = context.waitForPage(() -> {     //ელოდება ახალი ტაბის გახსნას
            applyButton.click();   //ვაკეთებთ იმ ქმედებას, რომელიც ახალ ტაბს ხსნის
        });

        newPage.waitForLoadState();  //ველოდებით რომ ახალი გვერდი სრულად ჩაიტვირთოს

        String currentUrl = newPage.url();  //ვიღებთ ახალი ტაბის სრულ URL-ს
        String host = URI.create(currentUrl).getHost();//URL-ს ვაქცევთ URI ობიექტად, .getHost() გვაძლევს მხოლოდ დომეინს

        Assert.assertTrue(host.contains(Constants.TBC_CREDIT_DOMAIN), //ვამოწმებთ რომ host შეიცავს `"tbccredit.ge"`
                "Expected domain to contain: " + Constants.TBC_CREDIT_DOMAIN +
                        " but was: " + host);

        // დამატებითი ვალიდაცია – გვერდი რეალურად ჩაიტვირთა
        Assert.assertTrue(newPage.title().length() > 0,
                "Destination page did not load properly");

        return this;
    }

}
