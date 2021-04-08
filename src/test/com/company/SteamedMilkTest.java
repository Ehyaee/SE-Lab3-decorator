package test.com.company;

import com.company.Beverage;
import com.company.HouseBlend;
import com.company.SteamedMilk;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SteamedMilkTest {
    @Test
    void testHouseBlendWithSteamedMilk() {
        // HouseBlend + SteamedMilk
        Beverage beverage = new SteamedMilk(new HouseBlend());
        assertEquals("Delicious HouseBlend with milk", beverage.getDescription());
        assertEquals(0.89 + 0.1, beverage.cost());
    }
}