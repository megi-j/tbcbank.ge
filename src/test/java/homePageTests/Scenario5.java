package homePageTests;

import baseTests.BaseTest;
import ge.tbc.data.steps.LoansPageSteps;
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
    public void showApplyButton(){
        loansPageSteps.applyButtonCheck();

    }
    @Test(priority = 2)
    public void redirectToTbccredit(){
        loansPageSteps.validateRedirectToTbccredit();
    }
}
