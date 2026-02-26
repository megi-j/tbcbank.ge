package homePageTests;

import baseTests.BaseTest;
import ge.tbc.data.steps.OffersPageSteps;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Scenario4 extends BaseTest {
    private OffersPageSteps offersPageSteps;


    @BeforeClass
    public void setUpTests(){
        offersPageSteps = new OffersPageSteps(getPage());
        offersPageSteps.moveToOffersPage();
    }
    @Test(priority = 1)
    public void checkFilterPanelVisibility(){
        offersPageSteps.filterPanelCheck()
                .offersListContainerCheck();

    }
    @Test(priority = 2)
    public void cardTypeCheck(){
        offersPageSteps.mastercardCheck()
                .shoppingCheck()
                .emptyOffersPageCheck()
                .cardsVisibilityCheck()
                .categoryClearButtonVisibility()
                .productTypeClearButtonVisibility()
                .offerTypeClearButtonVisibility()
                .cardTypeClearButtonVisibility()
                .resetCategoryFilter()
                .resetProductFilter()
                .resetOfferFilter()
                .resetCardFilter()
                .offerCardsVisibilityCheckAfterReset();
    }
}
