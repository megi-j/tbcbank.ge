package ge.tbc.data.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class OffersPage {
     public Locator filterPanel, offersListContainer, mastercard, shopping, emptyOffersPage;

     public OffersPage(Page page){
         this.filterPanel = page.locator("h3:has-text('კატეგორია')");
         this.offersListContainer = page.locator("xpath=/html/body/app-base/app-root/div[2]/app-page/app-offers/app-marketing-main/div/div/tbcx-pw-container/div/div/div/app-marketing-list");
         this.mastercard = page.locator("xpath=/html/body/app-base/app-root/div[2]/app-page/app-offers/app-marketing-main/div/div/tbcx-pw-container/div/div/div/app-marketing-filters/div/app-marketing-filter-group[4]/div/ul/app-marketing-filter-item[2]/div/div/input");
         this.shopping = page.locator("xpath=/html/body/app-base/app-root/div[2]/app-page/app-offers/app-marketing-main/div/div/tbcx-pw-container/div/div/div/app-marketing-filters/div/app-marketing-filter-group[1]/div/ul/app-marketing-filter-item[1]/div/div/input");
         this.emptyOffersPage = page.locator("xpath=/html/body/app-base/app-root/div[2]/app-page/app-offers/app-marketing-main/div/div/tbcx-pw-container/div/div/div/app-marketing-list/app-marketing-items-empty-state/div/h3");
     }


}
