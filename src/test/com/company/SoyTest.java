package test.com.company;

import com.company.Beverage;
import com.company.HouseBlend;
import com.company.Soy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SoyTest {
    @Test
    void testHouseBlendWithSoy() {
        // HouseBlend + soy
        Beverage beverage = new Soy(new HouseBlend());
        assertEquals("Delicious HouseBlend with soy", beverage.getDescription());
        assertEquals(0.89 + 0.25, beverage.cost());
    }
}