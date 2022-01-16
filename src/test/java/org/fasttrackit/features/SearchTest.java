package org.fasttrackit.features;

import org.junit.Test;

public class SearchTest extends BaseTest{

    @Test
    public void searchTest() {
        searchSteps.executeSearch("NECKLACE");
        searchSteps.findAndOpenProduct("Silver Desert Necklace");
        searchSteps.searchAndSelectProduct("Silver Desert Necklace");
    }

    @Test
    public void sortListTest(){
        searchSteps.executeSearch("Jeans");
        searchSteps.sortListOfProductsByPrice("Jeans");

    }
}
