package oop;

public class Address {
    private String street;
    private String city;
    private Integer zipcode;

    public Address(String street, String city, Integer zipcode) {
        this.street = street;
        this.city = city;
        this.zipcode = zipcode;
    }
public void showAddress(){
        System.out.println("Street: " + street);
        System.out.println("City: " + city);
        System.out.println("Zipcode: " + zipcode);
}
}
