package ge.tbc.data.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class OffersPage {
     public Locator filterPanel, offersListContainer;

     public OffersPage(Page page){
         this.filterPanel = page.locator("h3:has-text('კატეგორია')");
         this.offersListContainer = page.locator("xpath=/html/body/app-base/app-root/div[2]/app-page/app-offers/app-marketing-main/div/div/tbcx-pw-container/div/div/div/app-marketing-list");

     }


}
