package test.com.company;

import com.company.Beverage;
import com.company.DarkRoast;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DarkRoastTest {
    @Test
    void testDarkRoast() {
        // Pure HouseBlend
        Beverage beverage = new DarkRoast();
        assertEquals("Delicious DarkRoast", beverage.getDescription());
        assertEquals(0.7, beverage.cost());
    }
}