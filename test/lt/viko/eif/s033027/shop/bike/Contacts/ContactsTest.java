package lt.viko.eif.s033027.shop.bike.Contacts;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ContactsTest {

    private Contacts contacts;

    @Before
    public void setUp() throws Exception {
        contacts = new Contacts();
    }

    @After
    public void tearDown() throws Exception {
        contacts = null;
    }

    @Test
    public void setEmail() {
        contacts.setEmail("test@testing.com");
        assertEquals("test@testing.com", contacts.getEmail());
    }

    @Test
    public void setStreetName() {
        contacts.setStreetName("J. Jasinskio");
        assertEquals("J. Jasinskio", contacts.getStreetName());
    }

    @Test
    public void setPhoneNumber() {
        contacts.setPhoneNumber("+37061234567");
        assert
    }

    @Test
    public void setFax() {
    }

    @Test
    public void setHouseNumber() {
    }

    @Test
    public void setCity() {
    }

    @Test
    public void setCountry() {
    }

    @Test
    public void toString1() {
    }
}