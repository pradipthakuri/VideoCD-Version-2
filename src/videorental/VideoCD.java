/*

/*
 * File: VideoCD.java
 * Further Programming(CC1007N)
 * Coursework 1 (Spring Sem) 2013
 * version:- 1
 * @Author:- Pradip Shahi
 * Student Id:- 11069881 (SITY0E11008)
 * Group:- L1C2 (BSc. Hons in Computing)
 * Date:- 2013-03-05
 * Islington College(London Metropolitan University)
 * 
 */


/**
 * The VideoCD class represents a CD object.
 * This is the superclass of VCDToSell and VCDToRent.
 */
 
package videorental;

public class VideoCD {
    private String description;
    private String customerName;
    
    //class VideoCd with onee constructor
    public VideoCD(String theDescription) {
        description = theDescription;
        customerName = "";
    }
    
    //method to set the customer's name
    public void setName(String new_CustomerName) {
        customerName = new_CustomerName;    
    }
    
    //method to get the customer's name
    public String getName() {
        return customerName;
    }
    
    //public method that return private attribute.
    //Calling this method in sub class can also access private attribute description.
    public String getDescription() {
        return description;
    }
    
    //This method display the description of the VideoCD.
    //This method is over rided in the subclass.
    public void displayDescription() {
        System.out.println("\nThe VideoCD is about " + description + " " + ".");
        
        if (customerName != "") {
            System.out.println("\nThe VideoCD is rented by " + "Mr./Ms " + getName() + ".");
        }
    }
}