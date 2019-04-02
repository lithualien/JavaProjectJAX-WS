package lt.viko.eif.s033027.shop.bike;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BikesTest {
    private Bikes bikes;

    @Before
    public void setUp() {
        bikes = new Bikes();
        bikes.setBike("Baltik vairas", "Balta", (float)1209.99, "Kalnų dviratis", 12.9, 21, 8);
    }

    /**
     * Test of setBike method, of Bikes class
     */

    @Test
    public void setBike() {
        assertEquals("Baltik vairas", bikes.getBike().get(0).getBrand());
        assertEquals("Balta", bikes.getBike().get(0).getColour());
        assertEquals(1209.99, bikes.getBike().get(0).getPrice(), 0.001);
        assertEquals("Kalnų dviratis", bikes.getBike().get(0).getType());
        assertEquals(12.9, bikes.getBike().get(0).getWeight(), 0.01);
        assertEquals(21, bikes.getBike().get(0).getGears());
        assertEquals(8, bikes.getBike().get(0).getWheelSize());
    }

    @After
    public void tearDown() {
        bikes = null;
    }

}