package test.com.company;

import com.company.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testAll {
    @Test
    void testDarkRoast() {
        // Pure DarkRoast
        Beverage beverage = new DarkRoast();
        assertEquals("Delicious DarkRoast", beverage.getDescription());
        assertEquals(0.7, beverage.cost());
    }

    @Test
    void testDecaf() {
        // Pure Decaf
        Beverage beverage = new Decaf();
        assertEquals("Delicious Decaf", beverage.getDescription());
        assertEquals(0.8, beverage.cost());
    }

    @Test
    void testEspresso() {
        // Pure Espresso
        Beverage beverage = new Espresso();
        assertEquals("Delicious Espresso", beverage.getDescription());
        assertEquals(1.99, beverage.cost());
    }
    @Test
    void testHouseBlend() {
        // Pure HouseBlend
        Beverage beverage = new HouseBlend();
        assertEquals("Delicious HouseBlend", beverage.getDescription());
        assertEquals(0.89, beverage.cost());
    }
    @Test
    void testHouseBlendWithMocha() {
        // HouseBlend + Mocha
        Beverage beverage = new Mocha(new HouseBlend());
        assertEquals("Delicious HouseBlend with mocha", beverage.getDescription());
        assertEquals(0.89 + 0.2, beverage.cost());
    }
    @Test
    void testHouseBlendWithSoy() {
        // HouseBlend + soy
        Beverage beverage = new Soy(new HouseBlend());
        assertEquals("Delicious HouseBlend with soy", beverage.getDescription());
        assertEquals(0.89 + 0.25, beverage.cost());
    }
    @Test
    void testHouseBlendWithSteamedMilk() {
        // HouseBlend + SteamedMilk
        Beverage beverage = new SteamedMilk(new HouseBlend());
        assertEquals("Delicious HouseBlend with milk", beverage.getDescription());
        assertEquals(0.89 + 0.1, beverage.cost());
    }

    @Test
    void testEspressoWithMochaAndWhip() {
        // Espresso + Mocha + Whip
        Beverage beverage = new Whip(new Mocha(new Espresso()));
        assertEquals("Delicious Espresso with mocha with whip", beverage.getDescription());
        assertEquals(1.99 + 0.2 + 0.10, beverage.cost());
    }
}
