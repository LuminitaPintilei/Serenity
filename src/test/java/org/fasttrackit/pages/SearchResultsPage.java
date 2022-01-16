package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

import java.util.List;

public class SearchResultsPage extends BasePage {

    @FindBy(css = ".products-grid .item")
    private List<WebElementFacade> listOfProducts;

    public boolean openProduct(String name) {
        waitFor(listOfProducts.get(0));
        for (WebElementFacade element : listOfProducts) {
            if (element.findElement(By.cssSelector(".product-name a")).getText().equalsIgnoreCase(name)) {
                element.findElement(By.cssSelector("a")).click();
                return true;
            }
        }
        return false;
    }


    @FindBy(css = "products-grid products-grid--max-3-col first last odd")
    private List<WebElementFacade> listOfProducts2;

    @FindBy(css = ".category-products > .toolbar select[title^=Sort]")
    private WebElementFacade sortButton;

    @FindBy(css = ".category-products > .toolbar select[title^=Sort] :nth-child(3)")
    private WebElementFacade sortByPrice;


    public void sortListOfProductsByPrice() {
       // waitFor(listOfProducts2.get(0));
        clickOn(sortButton);
        clickOn(sortByPrice);
    }

    @FindBy(id ="product-price-417 .price")
    private WebElementFacade firstProductInList;

    @FindBy(id = "span#product-price-431 .price")
    private WebElementFacade lastProductInList;

    public int productPrice () {

        for (WebElementFacade element : listOfProducts2) {
             getIntFromPrice(element.getText());
        }
        return productPrice ();
    }



}

