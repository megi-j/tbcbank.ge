package ge.tbc.data.steps;

import com.microsoft.playwright.Page;
import ge.tbc.data.pages.OffersPage;
import org.testng.Assert;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class OffersPageSteps extends OffersPage {
    private final Page page;

    public OffersPageSteps (Page page){
        super(page);
        this.page = page;
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
    public boolean isAnyCategorySelected(){
        for(int i = 0; i < categoryList.count(); i++){
            if(categoryList.nth(i).isChecked()){
                return true;
            }
        }
        return false;
    }
    public OffersPageSteps categoryClearButtonVisibility(){
        boolean anyChecked = isAnyCategorySelected();
        if(anyChecked){
            assertThat(categoryClearButton).isVisible();
        } else {
            assertThat(categoryClearButton).not().isVisible();
        }
        return this;
    }
    public boolean isAnyProductTypeSelected(){
        for(int i = 0; i < productTypeList.count(); i++){
            if(productTypeList.nth(i).isChecked()){
                return true;
            }
        }
        return false;
    }
    public OffersPageSteps productTypeClearButtonVisibility(){
        boolean anyChecked = isAnyProductTypeSelected();
        if(anyChecked){
            assertThat(productTypeClearButton).isVisible();
        }else{
            assertThat(productTypeClearButton).not().isVisible();
        }
        return this;
    }
    public boolean isAnyOfferTypeSelected(){
        for(int i = 0; i < offerTypeList.count(); i++){
            if(offerTypeList.nth(i).isChecked()){
                return true;
            }
        }
        return false;
    }
    public OffersPageSteps offerTypeClearButtonVisibility(){
        boolean anyChecked = isAnyOfferTypeSelected();
        if(anyChecked){
            assertThat(offerTypeClearButton).isVisible();
        }else{
            assertThat(offerTypeClearButton).not().isVisible();
        }
        return this;
    }
    public boolean isAnyCardTypeSelected(){
        for(int i = 0; i < cardTypeList.count(); i++){
            if(cardTypeList.nth(i).isChecked()){
                return true;
            }
        }
        return false;
    }
    public OffersPageSteps cardTypeClearButtonVisibility(){
        boolean anyChecked = isAnyCardTypeSelected();
        if(anyChecked){
            assertThat(cardTypeClearButton).isVisible();
        }else{
            assertThat(categoryClearButton).not().isVisible();
        }
        return this;
    }
    public OffersPageSteps resetCategoryFilter(){
        boolean anyChecked = isAnyCategorySelected();
        if(anyChecked){
            categoryClearButton.click();
        }
        return this;
    }
    public OffersPageSteps resetProductFilter(){
        boolean anyChecked = isAnyProductTypeSelected();
        if(anyChecked){
            productTypeClearButton.click();
        }
        return this;
    }
    public OffersPageSteps resetOfferFilter(){
        boolean anyChecked = isAnyOfferTypeSelected();
        if(anyChecked){
            offerTypeClearButton.click();
        }
        return this;
    }
    public OffersPageSteps resetCardFilter(){
        boolean anyChecked = isAnyCardTypeSelected();
        if(anyChecked){
            cardTypeClearButton.click();
        }
        return this;
    }
    public OffersPageSteps offerCardsVisibilityCheckAfterReset(){
        assertThat(offerCards).isVisible();
        return this;
    }
}
