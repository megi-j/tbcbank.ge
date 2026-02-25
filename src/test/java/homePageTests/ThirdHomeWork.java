package homePageTests;

import baseTests.BaseTest;
import ge.tbc.data.steps.OffersPageSteps;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ThirdHomeWork extends BaseTest {
    private OffersPageSteps offersPageSteps;


    @BeforeClass
    public void setUpTests(){
        offersPageSteps = new OffersPageSteps(getPage());

    }
    @Test
    public void checkFilterPanelVisibility(){
        offersPageSteps.filterPanelCheck()
                .offersListContainerCheck();

    }
    @Test
    public void cardTypeCheck(){
        offersPageSteps.mastercardCheck()
                .shoppingCheck();

    }
}
