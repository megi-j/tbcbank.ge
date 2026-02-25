package ge.tbc.data.steps;

import com.microsoft.playwright.Page;
import ge.tbc.data.pages.OffersPage;
import org.testng.Assert;

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
}
