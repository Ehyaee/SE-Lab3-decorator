package test.com.company;

import com.company.Beverage;
import com.company.Espresso;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EspressoTest {
    @Test
    void testEspresso() {
        // Pure Espresso
        Beverage beverage = new Espresso();
        assertEquals("Delicious Espresso", beverage.getDescription());
        assertEquals(1.99, beverage.cost());
    }
}