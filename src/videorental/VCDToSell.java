


/*
 * File:- VCDToSell.java
 * Further Programming(CC1007N)
 * CourseWork 1(Spring Sem)\
 * version:- 1
 * @Author:- Pradip Shahi
 * Student Id:- 11069881 (SITY0E11008)
 * Group:- L1C2 (BSc. Hons in Computing)
 * Date:- 2013-03-05
 * Islington College(London Metropolitan University)
 */

/**
 * This class VCDToSell is a subclass of class VideoCD. This class inherites from VideoCD class.
 */
 
package videorental;

public class VCDToSell extends VideoCD {
    private int price;
    private int movieYear;
    private String movieType;
    private boolean sold;
    
    public VCDToSell(String theDescription,
                    int thePrice,
                    int theYearOfRegistration,
                    String theMovieType) {
                        super(theDescription);
                        price = thePrice;
                        setMovieYear(theYearOfRegistration);
                        setMovieType(theMovieType);
                        sold = false;
                    }
                    
    public void setPrice(int thePrice) {
        if (sold != true) {
            price = thePrice;
        }
        else {
            System.out.println("\nSorry the Video CD has already been sold, so price cannot be changed.");
        }
    }
    
    public int getPrice() {
        return price;
    }
    
    public void setMovieType(String theMovieType) {
        movieType = theMovieType;
    }
    
    public String getMovieType() {
        return movieType;
    }
    
    public void setMovieYear(int theYearOfRegistration) {
        movieYear = theYearOfRegistration;
    }
    
    public int getMovieYear() {
        return this.movieYear;
    }
    
    public void sellVideoCD(String new_CustomerName) {
        if (sold != true) {
            super.setName(new_CustomerName);
            sold = true;
        }
        else {
            System.out.println("\nThe Video CD has already been sold.");
        }
    }
    
    public void displayDescription() {
        super.displayDescription();
        System.out.println("\nThe customer of the Video CD is Mr./Ms. " + super.getName());
        
        if (sold != true) {
            System.out.println("\nThe Video CD is available.");
            System.out.println("The price of the Video CD is Rs. " + this.getPrice() + ".");
            System.out.println("The type of the Video CD is " + this.getMovieType() + ".");
        }
    }
    
                    
                    
}