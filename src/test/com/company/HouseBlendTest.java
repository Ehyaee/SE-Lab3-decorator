package test.com.company;

import com.company.Beverage;
import com.company.HouseBlend;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HouseBlendTest {
    @Test
    void testHouseBlend() {
        // Pure HouseBlend
        Beverage beverage = new HouseBlend();
        assertEquals("Delicious HouseBlend", beverage.getDescription());
        assertEquals(0.89, beverage.cost());
    }

}