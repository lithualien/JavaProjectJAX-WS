package lt.viko.eif.s033027.shop.bike;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BikeTest {
    // variables
    private Bike bike, bike2;

    /**
     * Create objects to use for testing.
     */

    @Before
    public void setUp(){
        bike = new Bike();
        bike2 = new Bike("Baltik Vairas", "Kalnų dviratis", "Balta", 15.2, 21, 8, 19.99f);
    }

    /**
     * Test of setBrand method, of Bike class.
     */

    @Test
    public void setBrand() {
        bike.setBrand("Baltik Vairas");
        assertNotNull(bike.getBrand());
        assertEquals("Baltik Vairas", bike.getBrand());
    }

    /**
     * Test of setType method, of Bike class.
     */

    @Test
    public void setType() {
        bike.setType("Kalnų dviratis");
        assertNotNull(bike.getType());
        assertEquals("Kalnų dviratis", bike.getType());
    }

    /**
     * Test of setWeight method, of Bike class.
     */

    @Test
    public void setWeight() {
        bike.setWeight(15.2);
        assertEquals(15.2, bike.getWeight(), 0.01);
    }

    /**
     * Test of setColour method, of Bike class.
     */

    @Test
    public void setColour() {
        bike.setColour("Balta");
        assertNotNull(bike.getColour());
        assertEquals("Balta", bike.getColour());
    }

    /**
     * Test of setPrice method, of Bike class.
     */

    @Test
    public void setPrice() {
        bike.setPrice((float)19.99);
        assertEquals((float)19.99, bike.getPrice(), 0.001);
    }

    /**
     * Test the setGears method, of Bike class.
     */

    @Test
    public void setGears() {
        bike.setGears(21);
        assertEquals(21, bike.getGears());
    }

    /**
     * Test the setWheelSize method, of Bike class.
     */

    @Test
    public void setWheelSize() {
        bike.setWheelSize(8);
        assertEquals(8, bike.getWheelSize());
    }

    /**
     * Test the toString method, of Bike class.
     */

    @Test
    public void testToString() {
        assertNotNull(bike2.toString());
        assertEquals("Gamintojas: Baltik Vairas | Rūšis: Kalnų dviratis | Svoris: 15.2kg | Spalva: Balta | Pavarų kiekis: 21 | Rato dydis: 8 inch. | Kaina: 19,99 €\n", bike2.toString());
    }

    /**
     * Destroy the object, which were created.
     */

    @After
    public void tearDown() {
        bike = null;
        bike2 = null;
    }

}