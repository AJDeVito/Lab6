package edu.cscc;

public class BusinessAddress extends Address {
    private String businessName;
    private String address2;


    public BusinessAddress(String streetAddress, String city, String state, String zip) {
        super(streetAddress, city, state, zip);

    }

    public void printLabel() {
        System.out.println(businessName);
        if (address2 != null && ! "".equals(address2)) {
            System.out.println(address2);
        }
        if (this.getStreetAddress() != null && !"".equals(this.getStreetAddress())) {
            System.out.println(this.getStreetAddress());
        }
        System.out.println(this.getCity() + ", " + this.getState() + "  " + this.getZip());


    }

    public String getBusinessName() { return businessName;}

    public void setBusinessName(String businessName) { this.businessName = businessName;}

    public String getAddress2() { return address2; }

    public void setAddress2(String address2) { this.address2 = address2; }

    public String toString() {
        return businessName + "\n" +
                address2 + ", ";
    }
}
