package Employe;

public class Address {
    private final String country;
    private final String city;
    private final String street;
    private final int postcode;
    private final int houseNumber;

    public Address(String country, String city, String street, int postcode, int houseNumber) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.postcode = postcode;
        this.houseNumber = houseNumber;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public int getPostcode() {
        return postcode;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    @Override
    public String toString() {
        return "country='" + country + '\'' +
                ", postcode=" + postcode +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", houseNumber=" + houseNumber;
    }
}
