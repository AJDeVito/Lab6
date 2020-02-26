package edu.cscc;

public class PersonAddress extends Address{
    private String personName;

    public PersonAddress(String streetAddress, String city, String state, String zip) {
        super(streetAddress, city, state, zip);
    }

    public void printLabel(){
        System.out.println(personName);
    }

    public String getPersonName() { return personName;}

    public void setPersonName(String personName) {
        this.personName = personName;
    }


}
