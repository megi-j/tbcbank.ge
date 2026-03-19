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
    public void showEmptyOffersPage(){
        offersPageSteps.mastercardCheck()
                .transportCheck()
                .emptyOffersPageCheck()
                .cardsVisibilityCheck();
    }
    @Test(priority = 3)
    public void showClearButton(){
        offersPageSteps.categoryClearButtonVisibility()
                .productTypeClearButtonVisibility()
                .offerTypeClearButtonVisibility()
                .cardTypeClearButtonVisibility();
    }
    @Test(priority = 4)
    public void resetAllFilters(){
        offersPageSteps.resetCategoryFilter()
                .resetProductTypeFilter()
                .resetOfferTypeFilter()
                .resetCardTypeFilter()
                .offerCardsVisibilityCheckAfterReset();
    }
}
