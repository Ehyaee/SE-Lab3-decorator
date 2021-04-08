package test.com.company;

import com.company.Beverage;
import com.company.Espresso;
import com.company.Mocha;
import com.company.Whip;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WhipTest {
    @Test
    void testEspressoWithMochaAndWhip() {
        // Espresso + Mocha + Whip
        Beverage beverage = new Whip(new Mocha(new Espresso()));
        assertEquals("Delicious Espresso with mocha with whip", beverage.getDescription());
        assertEquals(1.99 + 0.2 + 0.10, beverage.cost());
    }

}