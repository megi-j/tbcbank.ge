package homePageTests;

import baseTests.MobileBaseTest;
import ge.tbc.data.steps.LocationsPageSteps;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Scenario6 extends MobileBaseTest {
    private LocationsPageSteps locationsPageSteps;

    @BeforeClass
    public void setUpTests(){
        locationsPageSteps = new LocationsPageSteps(getPage());

    }
    @Test(priority = 1)
    public void viewportCheck(){
        locationsPageSteps.mobileViewportCheck();
    }
    @Test(priority = 2)
    public void locationCheck(){
        locationsPageSteps.locationButtonCheck()
                .locationButtonClick()
                .changeUrl()
                .headerVisibilityCheck();
    }
    @Test(priority = 3)
    public void atmAndBranchesCheck(){
        locationsPageSteps.atmTabCheck()
                .atmCardCheck()
                  .branchTabCheck()
                  .branchCardCheck();
    }
}
