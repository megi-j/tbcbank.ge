package ge.tbc.data.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class LocationsPage {
    public Locator hamburgerMenu, locationsButton, header, atmTab, atmCard, branchTab, branchCard;

    public LocationsPage(Page page){
        this.hamburgerMenu = page.locator(".tbcx-pw-hamburger-menu");
        this.locationsButton = page.locator("xpath=/html/body/app-base/app-root/div[3]/app-footer/tbcx-pw-footer/div/tbcx-pw-footer-top/div/tbcx-pw-container/div/div/div/div[1]/div[2]/div[1]/tbcx-pw-quick-action/tbcx-pw-contacts/div[3]/tbcx-pw-link/a");
        this.header = page.locator("h2:has-text('ფილიალი, ბანკომატი და თანხის მიმღები')");
//        this.atmTab = page.locator("tbcx-pw-tab-menu button").nth(1);
        this.atmCard = page.locator("app-atm-branches-section-list-item");
//        this.branchTab = page.locator("tbcx-pw-tab-menu button").nth(2);
        this.branchCard = page.locator("app-atm-branches-section-list-item");
        this.atmTab = page.locator("button:has-text('ბანკომატები')");
        this.branchTab = page.locator("button:has-text('ფილიალები')");
    }


}
