package lt.viko.eif.s033027.shop.bike.Contacts;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Class to test the Contacts class.
 *
 * @author Tomas Dominauskas
 */

public class ContactsTest {

    private Contacts contacts, contacts1;

    /**
     * Setting up object for testing.
     * @throws Exception
     */
    @Before
    public void setUp() throws Exception {
        contacts = new Contacts();
        contacts1 = new Contacts("test@testing.com", "J. Jasinskio", "+37061234567", "+37051234567", 43, "Vilnius", "Lietuva");
    }

    /**
     * Destroying object after finished using.
     * @throws Exception
     */

    @After
    public void tearDown() throws Exception {
        contacts = null;
        contacts1 = null;
    }

    /**
     * Testing the setEmail() and getEmail() methods of Contacts class.
     */

    @Test
    public void setEmail() {
        contacts.setEmail("test@testing.com");
        assertEquals("test@testing.com", contacts.getEmail());
    }

    /**
     * Testing setStreetName and getStreetName methods of Contacts class.
     */

    @Test
    public void setStreetName() {
        contacts.setStreetName("J. Jasinskio");
        assertEquals("J. Jasinskio", contacts.getStreetName());
    }

    /**
     * Testing setPhoneNumber and getPhoneNumber methods of Contacts class.
     */

    @Test
    public void setPhoneNumber() {
        contacts.setPhoneNumber("+37061234567");
        assertEquals("+37061234567", contacts.getPhoneNumber());
    }

    /**
     * Testing setFax and getFax methods of Contacts class.
     */

    @Test
    public void setFax() {
        contacts.setFax("+37051234567");
        assertEquals("+37051234567", contacts.getFax());
    }

    /**
     * Testing setHouseNumber and getHouseNumber methods of Contacts class.
     */

    @Test
    public void setHouseNumber() {
        contacts.setHouseNumber(43);
        assertEquals(43, contacts.getHouseNumber());
    }

    /**
     * Testing setCity and getCity methods of Contacts class.
     */

    @Test
    public void setCity() {
        contacts.setCity("Vilnius");
        assertEquals("Vilnius", contacts.getCity());
    }

    /**
     * Testing setCountry and getCountry methods of Contacts class.
     */

    @Test
    public void setCountry() {
        contacts.setCountry("Lietuva");
        assertEquals("Lietuva", contacts.getCountry());
    }

    /**
     * Testing if toString gives the correct value with all the data combined.
     */

    @Test
    public void toString1() {
        assertEquals("J. Jasinskio g., 43 Vilnius, Lietuva\nTelefonas: +37061234567\nFaksas: +37051234567\nElektroninis pastas: test@testing.com", contacts1.toString());
    }
}