package test.com.company;

import com.company.Beverage;
import com.company.HouseBlend;
import com.company.Mocha;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MochaTest {
    @Test
    void testHouseBlendWithMocha() {
        // HouseBlend + Mocha
        Beverage beverage = new Mocha(new HouseBlend());
        assertEquals("Delicious HouseBlend with mocha", beverage.getDescription());
        assertEquals(0.89 + 0.2, beverage.cost());
    }
}