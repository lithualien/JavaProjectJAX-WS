package lt.viko.eif.s033027.shop.bike.Contacts;

/**
 * Class to get and set the contacts.
 *
 * @author Tomas Dominauskas
 */

public class Contacts {

    private String email, streetName, phoneNumber, fax, city, country;
    private int houseNumber;

    /**
     * Constructor to create object.
     */
    public Contacts() {

    }

    /**
     * Constructor to create object and set all components of Contacts class.
     *
     * @param email set the company's email.
     * @param streetName set the company's street name, where it is located.
     * @param phoneNumber set the company's phone number.
     * @param fax set the company's fax number.
     * @param houseNumber set the company's house number.
     * @param city set the city, where the company is located.
     * @param country set the country, where the company is located.
     */

    public Contacts(String email, String streetName, String phoneNumber, String fax, int houseNumber, String city, String country) {
        this.email = email;
        this.streetName = streetName;
        this.phoneNumber = phoneNumber;
        this.fax = fax;
        this.houseNumber = houseNumber;
        this.city = city;
        this.country = country;
    }

    /**
     * Set the email of which can be contacted with the company.
     * @param email company's email.
     */

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Set the street name of company's address.
     * @param streetName the name of the street.
     */

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    /**
     * Set the phone number of which can be contacted with the company.
     * @param phoneNumber the phone number.
     */

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Set the fax number of which can be contacted with the company.
     * @param fax the fax number.
     */

    public void setFax(String fax) {
        this.fax = fax;
    }

    /**
     * The number of the house of the company's address.
     * @param houseNumber the number of the house.
     */

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    /**
     * The city where the company is located.
     * @param city the city of company's location.
     */

    public void setCity(String city) {
        this.city = city;
    }

    /**
     * The country where the company is located.
     * @param country the country of company's location.
     */

    public void setCountry(String country) {
        this.country = country;
    }

    /**
     *
     * @return the email of company.
     */

    public String getEmail() {
        return email;
    }

    /**
     *
     * @return the name of the street of company.
     */

    public String getStreetName() {
        return streetName;
    }

    /**
     *
     * @return the phone number of the company.
     */

    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     *
     * @return the number of the house of the company's location.
     */

    public int getHouseNumber() {
        return houseNumber;
    }

    /**
     *
     * @return the fax number of the company.
     */

    public String getFax() {
        return fax;
    }

    /**
     *
     * @return the city of the company's location.
     */

    public String getCity() {
        return city;
    }

    /**
     *
     * @return the country of the company's location.
     */

    public String getCountry() {
        return country;
    }

    /**
     * 
     * @return full information about the company.
     */
    @Override
    public String toString() {
        return streetName + " g., " + houseNumber + " " + city + ", " + country +
                "\nTelefonas: " + phoneNumber +
                "\nFaksas: " + fax +
                "\nElektroninis pastas: " + email;
    }
}
