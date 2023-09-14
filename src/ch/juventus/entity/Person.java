package ch.juventus.entity;

public class Person
{
    private String firstName;
    private String lastName;
    private int age;
    private boolean hasPet;

    public Person(String firstName, String lastName, int age, boolean hasPet)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.hasPet = hasPet;
    }

    public String getFirstName()
    {
        return this.firstName;
    }

    public String getLastName()
    {
        return this.lastName;
    }

    public int getAge()
    {
        return this.age;
    }

    public boolean hasPet()
    {
        return this.hasPet;
    }

    public String toString()
    {
        return "Person: " + this.firstName + " " + this.lastName + ", age " + this.age + " " + (this.hasPet ? "has a pet" : "has no pet");
    }

    public boolean equals(Object obj)
    {
        if (obj == null)
        {
            return false;
        }

        if (obj instanceof Person)
        {
            Person otherPerson = (Person) obj;
            return this.firstName.equals(otherPerson.firstName) && this.lastName.equals(otherPerson.lastName) && this.age == otherPerson.age && this.hasPet == otherPerson.hasPet;
        }

        return false;
    }

    public int hashCode()
    {
        return this.firstName.hashCode() + this.lastName.hashCode() + this.age + (this.hasPet ? 1 : 0);
    }
}