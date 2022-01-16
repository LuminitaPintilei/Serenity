package org.fasttrackit.features;

import org.fasttrackit.utils.EnvConstants;
import org.junit.Test;

public class EmptyTest extends BaseTest {

    @Test
    public void emptyCartTest(){
        loginSteps.doLogin(EnvConstants.USER_EMAIL, EnvConstants.USER_PASS);
        searchSteps.searchAndSelectProduct("SHAY PRINTED PILLOW");
        cartSteps.clickAddProductToCart();
        cartSteps.navigateToCart();



    }

}
