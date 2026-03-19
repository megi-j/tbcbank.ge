package ge.tbc.data.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;


public class LoansPage {
    public Locator forMeButton, consumerLoan, loanTerms, applyButton;

    public LoansPage(Page page){
        this.forMeButton = page.locator("tbcx-pw-navigation tbcx-pw-navigation-item:has-text('ჩემთვის')");
        this.consumerLoan = page.locator("xpath=/html/body/app-base/app-root/div[1]/app-header/tbcx-pw-header/header/div[2]/tbcx-pw-mega-menu/div/tbcx-pw-container/div/div/div/div/div[1]/tbcx-pw-mega-menu-sub-navigation/div/tbcx-pw-mega-menu-sub-group[1]/div[1]/tbcx-pw-mega-menu-sub-item[2]/tbcx-pw-link/a");
        this.loanTerms = page.locator("xpath=/html/body/app-base/app-root/div[2]/app-page/app-components-group/div/app-cta-section[1]/tbcx-pw-cta-section/div/tbcx-pw-container/div/div/tbcx-pw-cta/div/div[2]/div[2]/tbcx-pw-button/tbcx-pw-link/a");
        this.applyButton = page.locator("tbcx-pw-link button:has-text('სესხის მოთხოვნა')");
    }
}
