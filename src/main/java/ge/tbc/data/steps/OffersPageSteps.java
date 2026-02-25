package ge.tbc.data.steps;

import com.microsoft.playwright.Page;
import ge.tbc.data.pages.OffersPage;
import org.testng.Assert;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class OffersPageSteps extends OffersPage {
    private final Page page;

    public OffersPageSteps (Page page){
        super(page);
        this.page = page;
    }
    public OffersPageSteps filterPanelCheck(){
        filterPanel.waitFor();
        Assert.assertTrue(filterPanel.isVisible());
        return this;
    }
    public OffersPageSteps offersListContainerCheck(){
        Assert.assertTrue(offersListContainer.isVisible());
        return this;
    }
    public OffersPageSteps mastercardCheck(){
        mastercard.check();
        return this;
    }
    public OffersPageSteps shoppingCheck(){
        shopping.check();
        return this;
    }
    public OffersPageSteps emptyOffersPageCheck(){
        assertThat(emptyOffersPage).isVisible();
        return this;
    }
}
