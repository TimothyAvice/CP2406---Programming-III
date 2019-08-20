package week4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestSandwich {

    @Test
    void setIngredient() {
        Sandwich sandwich = new Sandwich();
        sandwich.setIngredient("Ham");
        assertNotNull(sandwich.ingredient);
    }

    @Test
    void setBread() {
        Sandwich sandwich = new Sandwich();
        sandwich.setBread("White");
        assertNotNull(sandwich.bread);
    }

    @Test
    void setPrice() {
        Sandwich sandwich = new Sandwich();
        double price = 12.99;
        sandwich.setPrice(price);
        assertEquals(price, sandwich.price);
    }

    @Test
    void getIngredient() {
        Sandwich sandwich = new Sandwich();
        sandwich.setIngredient("Ham");
        String ingredient = sandwich.getIngredient();
        assertEquals(ingredient, "Ham");
    }

    @Test
    void getBread() {
        Sandwich sandwich = new Sandwich();
        sandwich.setBread("White");
        String bread = sandwich.getBread();
        assertEquals(bread, "White");
    }

    @Test
    void getPrice() {
        Sandwich sandwich = new Sandwich();
        sandwich.setPrice(12.99);
        double price = sandwich.getPrice();
        assertEquals(price, 12.99);
    }
}