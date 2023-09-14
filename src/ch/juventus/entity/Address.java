package ch.juventus.entity;

public class Address {
    private String street;
    private int number;
    private String city;
    private String zipCode;

    public Address(String street, int number, String city, String zipCode)
    {
        this.street = street;
        this.number = number;
        this.city = city;
        this.zipCode = zipCode;
    }

    public String toString()
    {
        return "Address: " + this.street + " " + this.number +" " + this.city + " " + this.zipCode;
    }
}
