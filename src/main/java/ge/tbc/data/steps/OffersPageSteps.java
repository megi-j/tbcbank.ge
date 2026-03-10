package ge.tbc.data.steps;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import ge.tbc.data.pages.OffersPage;


import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class OffersPageSteps extends OffersPage {
    private final Page page;

    public OffersPageSteps (Page page){
        super(page);
        this.page = page;
    }
    public OffersPageSteps moveToOffersPage(){
        forMeButton.hover();
        offers.click();
        readMore.click();
        return this;
    }
    public OffersPageSteps filterPanelCheck(){
        filterPanel.waitFor();
        assertThat(filterPanel).isVisible();
        return this;
    }
    public OffersPageSteps offersListContainerCheck(){
        assertThat(offersListContainer).isVisible();
        return this;
    }
    public OffersPageSteps mastercardCheck(){
        mastercard.check();
        return this;
    }
    public OffersPageSteps shoppingCheck(){
        shopping.check();
        return this;
    }
    public OffersPageSteps emptyOffersPageCheck(){
        assertThat(emptyOffersPage).isVisible();
        return this;
    }
    public OffersPageSteps cardsVisibilityCheck(){
        assertThat(offerCards).hasCount(0);
        return this;
    }

    public boolean isAnySelected(Locator list){
        for(int i = 0; i < list.count(); i++){
            if(list.nth(i).isChecked()){
               return true;
            }
        }
         return false;
    }
    public OffersPageSteps categoryClearButtonVisibility(){
        boolean anyChecked = isAnySelected(categoryList);
        if(anyChecked){
            assertThat(categoryClearButton).isVisible();
        } else {
            assertThat(categoryClearButton).not().isVisible();
        }
        return this;
    }
    public OffersPageSteps productTypeClearButtonVisibility(){
        boolean anyChecked = isAnySelected(productTypeList);
        if(anyChecked){
            assertThat(productTypeClearButton).isVisible();
        }else{
            assertThat(productTypeClearButton).not().isVisible();
        }
        return this;
    }

    public OffersPageSteps offerTypeClearButtonVisibility(){
        boolean anyChecked = isAnySelected(offerTypeList);
        if(anyChecked){
            assertThat(offerTypeClearButton).isVisible();
        }else{
            assertThat(offerTypeClearButton).not().isVisible();
        }
        return this;
    }

    public OffersPageSteps cardTypeClearButtonVisibility(){
        boolean anyChecked = isAnySelected(cardTypeList);
        if(anyChecked){
            assertThat(cardTypeClearButton).isVisible();
        }else{
            assertThat(cardTypeClearButton).not().isVisible();
        }
        return this;
    }
    public OffersPageSteps resetFilter(Locator list, Locator clearButton){
        boolean anyChecked = isAnySelected(list);

        if(anyChecked){
            clearButton.click();
        }
        return this;
    }
    public OffersPageSteps resetCategoryFilter(){
        return resetFilter(categoryList, categoryClearButton);
    }

    public OffersPageSteps resetProductTypeFilter(){
        return resetFilter(productTypeList, productTypeClearButton);
    }

    public OffersPageSteps resetOfferTypeFilter(){
        return resetFilter(offerTypeList, offerTypeClearButton);
    }

    public OffersPageSteps resetCardTypeFilter(){
        return resetFilter(cardTypeList, cardTypeClearButton);
    }
    public OffersPageSteps offerCardsVisibilityCheckAfterReset(){
        assertThat(offerCards).isVisible();
        return this;
    }
}
