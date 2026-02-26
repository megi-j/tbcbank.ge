package ge.tbc.data.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class OffersPage {
     public Locator forMeButton, offers, readMore, filterPanel, offersListContainer, mastercard, shopping, emptyOffersPage, offerCards,
                    categoryClearButton, categoryList, productTypeClearButton, productTypeList, offerTypeClearButton,
                    offerTypeList, cardTypeClearButton, cardTypeList;

     public OffersPage(Page page){
         this.forMeButton = page.locator("tbcx-pw-navigation tbcx-pw-navigation-item:has-text('ჩემთვის')");
         this.offers = page.locator("xpath=/html/body/app-base/app-root/div[1]/app-header/tbcx-pw-header/header/div[2]/tbcx-pw-mega-menu/div/tbcx-pw-container/div/div/div/div/div[4]/tbcx-pw-mega-menu-additional/div/div[2]/tbcx-pw-mega-menu-quick-actions/div/tbcx-pw-mega-menu-quick-acitons-item[3]/tbcx-pw-link/a");
         this.readMore = page.locator("xpath=/html/body/app-base/app-root/div[2]/app-page/app-components-group/div/app-slider-section/tbcx-pw-hero-slider-section/tbcx-pw-container/div/div/tbcx-pw-hero-slider/div/div/tbcx-pw-slider/div/div/div/tbcx-pw-button");
         this.filterPanel = page.locator("h3:has-text('კატეგორია')");
         this.offersListContainer = page.locator("div.marketing__cards-list.ng-star-inserted");
         this.mastercard = page.locator("app-marketing-filter-item:has-text('მასტერქარდი') input[type='checkbox']");
         this.shopping = page.locator("app-marketing-filter-item:has-text('შოპინგი') input[type='checkbox']");
         this.emptyOffersPage = page.locator("div.offers__empty-state h3:has-text('შეთავაზებები არ მოიძებნა')");
         this.offerCards = page.locator(".marketing__cards-list.ng-star-inserted");
         this.categoryClearButton = page.locator("app-marketing-filter-group:has-text('კატეგორია') button.filter__button");
         this.categoryList = page.locator("app-marketing-filter-group:has-text('კატეგორია') ul input");
         this.productTypeClearButton = page.locator("app-marketing-filter-group:has-text('პროდუქტის ტიპი') button.filter__button");
         this.productTypeList = page.locator("app-marketing-filter-group:has-text('პროდუქტის ტიპი') ul input");
         this.offerTypeClearButton = page.locator("app-marketing-filter-group:has-text('შეთავაზების ტიპი') button.filter__button");
         this.offerTypeList = page.locator("app-marketing-filter-group:has-text('შეთავაზების ტიპი') ul input");
         this.cardTypeClearButton = page.locator("app-marketing-filter-group:has-text('ბარათის ტიპი') button.filter__button");
         this.cardTypeList = page.locator("app-marketing-filter-group:has-text('ბარათის ტიპი') ul input");
     }


}
