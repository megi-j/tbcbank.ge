package ge.tbc.data.steps;

import com.microsoft.playwright.Page;
import ge.tbc.data.pages.LocationsPage;
import org.testng.Assert;

import java.security.PublicKey;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static ge.tbc.data.Constants.LOCATIONS_URL;

public class LocationsPageSteps extends LocationsPage {
    private final Page page;

    public LocationsPageSteps(Page page){
        super(page);
        this.page = page;
    }
    public LocationsPageSteps mobileViewportCheck(){
        Assert.assertTrue(page.viewportSize().width < 768);
        assertThat(hamburgerMenu).isVisible();
        return this;
    }
    public LocationsPageSteps locationButtonCheck(){
        locationsButton.scrollIntoViewIfNeeded();
        assertThat(locationsButton).isVisible();
        assertThat(locationsButton).isEnabled();
        return this;
    }
    public LocationsPageSteps locationButtonClick(){
        locationsButton.click();
        return this;
    }
    public LocationsPageSteps changeUrl(){
        page.waitForURL(LOCATIONS_URL);
        return this;
    }
    public LocationsPageSteps headerVisibilityCheck(){
        assertThat(header).isVisible();
        return this;
    }
    public LocationsPageSteps atmTabCheck(){
        atmTab.scrollIntoViewIfNeeded();
        assertThat(atmTab).isVisible();
        assertThat(atmTab).isEnabled();
        atmTab.click();
        atmCard.waitFor();
        return this;
    }
    public LocationsPageSteps atmCardCheck(){
        atmCard.waitFor();
        assertThat(atmCard.first()).isVisible();
        return this;
    }
    public LocationsPageSteps branchTabCheck(){
        assertThat(branchTab).isVisible();
        assertThat(branchTab).isEnabled();
        branchTab.click();
        branchCard.waitFor();
        return this;
    }
    public LocationsPageSteps branchCardCheck(){
        branchCard.waitFor();
        assertThat(branchCard.first()).isVisible();
        return this;
    }
}
