package homePageTests;

import baseTests.BaseTest;
import ge.tbc.data.steps.LoansPageSteps;
import ge.tbc.data.steps.OffersPageSteps;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Scenario5 extends BaseTest {
    private LoansPageSteps loansPageSteps;

    @BeforeClass
    public void setUpTests(){
        loansPageSteps = new LoansPageSteps(getPage());
        loansPageSteps.moveToLoansPage();
    }
    @Test(priority = 1)
    public void applyCheck(){
        loansPageSteps.applyButtonCheck()
                .validateRedirectToTbccredit();
    }
}
