package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class SearchSteps extends BaseSteps {



    @Step
    public void executeSearch(String keyword){
        homePage.setSearchField(keyword);
        homePage.clickSearchIcon();
    }

    @Step
    public void findAndOpenProduct(String productName){
        Assert.assertTrue(searchresultsPage.openProduct(productName));
    }

    @Step
    public void searchAndSelectProduct(String productName){
        executeSearch(productName);
        findAndOpenProduct(productName);
    }

    @Step
    public void sortListOfProductsByPrice(String productName){
        searchresultsPage.sortListOfProductsByPrice();
    }

    @Step
    public void pricesForProductsInList(){
        searchresultsPage.productPrice();

    }

   // @Step
  //  public void isSortByPriceCorrect (){
    //   Assert.assertTrue();
   // }

}
