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

    public String getStreet()
    {
        return this.street;
    }

    public int getNumber()
    {
        return this.number;
    }

    public String getCity()
    {
        return this.city;
    }

    public String getZipCode()
    {
        return this.zipCode;
    }
    
    public String toString()
    {
        return "Address: " + this.street + " " + this.number +" " + this.city + " " + this.zipCode;
    }
}
