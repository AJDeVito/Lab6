package edu.cscc;

public class Main {

    public static void main(String[] args) {
	    Address[] addressList = new Address[6];

	    // TODO Add 3 person addresses to list

        addressList[0] = new PersonAddress("1200 N. Fourth St.", "Worthington", "OH", "43217");

        // TODO Add 3 business address to list
        addressList[0] = new BusinessAddress("550 East Spring St.", "Columbus", "OH", "43215");
        addressList[1] = new BusinessAddress("null", "Columbus", "OH", "43201");
        addressList[2] = new BusinessAddress("2079 N. Main St.", "Columbus", "OH", "43227");

	    for (Address address : addressList) {
	        address.printLabel();
            System.out.println("====================");
        }
    }
}
