package Employe;

import java.util.HashMap;

public class Employe {
    private HashMap<AddressType, Address> addresses;
    public Employe(){

    }
    public void addAddress(AddressType type, String country, String city, String street, int postcode, int houseNumber){
        addresses.put(type, new Address(country,city,street,postcode,houseNumber));
    }

    public HashMap<AddressType, Address> getAddresses() {
        return addresses;
    }
}
