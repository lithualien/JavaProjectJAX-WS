package lt.viko.eif.s033027.shop.bike.Contacts;

/**
 * Class to get and set the contacts
 *
 * @author Tomas Dominauskas
 */

public class Contacts {

    private String email, streetName, phoneNumber, fax, city, country;
    private int houseNumber;

    public Contacts() {

    }

    public Contacts(String email, String streetName, String phoneNumber, String fax, int streetNumber, String city, String country) {
        this.email = email;
        this.streetName = streetName;
        this.phoneNumber = phoneNumber;
        this.fax = fax;
        this.houseNumber = streetNumber;
        this.city = city;
        this.country = country;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEmail() {
        return email;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public String getFax() {
        return fax;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return streetName + " " + houseNumber + "g., " + city + ", " + country +
                "\nTelefonas: " + phoneNumber +
                "\nFaksas: " + fax +
                "\nElektroninis pastas " + email;
    }
}
