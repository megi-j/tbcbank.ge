package ge.tbc.data.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class OffersPage {
     public Locator filterPanel, offersListContainer, mastercard, shopping, emptyOffersPage, offerCards;

     public OffersPage(Page page){
         this.filterPanel = page.locator("h3:has-text('კატეგორია')");
         this.offersListContainer = page.locator("div.marketing__cards-list.ng-star-inserted");
         this.mastercard = page.locator("app-marketing-filter-item:has-text('მასტერქარდი') input[type='checkbox']");
         this.shopping = page.locator("app-marketing-filter-item:has-text('შოპინგი') input[type='checkbox']");
         this.emptyOffersPage = page.locator("div.offers__empty-state h3:has-text('შეთავაზებები არ მოიძებნა')");
         this.offerCards = page.locator(".marketing__cards-list ng-star-inserted");
     }


}
