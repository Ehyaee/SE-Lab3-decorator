package test.com.company;

import com.company.Beverage;
import com.company.Decaf;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DecafTest {
    @Test
    void testDecaf() {
        // Pure HouseBlend
        Beverage beverage = new Decaf();
        assertEquals("Delicious Decaf", beverage.getDescription());
        assertEquals(0.8, beverage.cost());
    }
}