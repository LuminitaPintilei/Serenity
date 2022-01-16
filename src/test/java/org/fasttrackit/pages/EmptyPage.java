package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class EmptyPage extends BasePage{

    @FindBy(id = "product-collection-image-382")
    private WebElementFacade addSelectedProductToCart;

    @FindBy(id = "empty_cart_button")
    private WebElementFacade emptyCart;

    public void clickAddToCartButton(){
        clickOn(addSelectedProductToCart);
    }

    public void doEmptyCart(){
        clickOn(emptyCart);
    }
}
