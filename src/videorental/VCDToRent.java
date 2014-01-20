

/*
 * File: VCDToRent.java
 * Further Programming(CC1007N)
 * Coursework 1 (Spring Sem) 2013
 * version:- 1
 * @Author:- Pradip Shahi
 * Student Id:-  11069881
 * Group:- L1C2 (BSc. Hons in Computing)
 * Date:- 2013-03-05
 * Islington College(London Metropolitan university)
 * 
 */

/**
 * This class VCDToRent is the subclass of the class VideoCD
 * It has attributes of VideoCD class and its own other too.
 */
 
package videorental;
public class VCDToRent extends VideoCD {
    private String dateOfHire;
    private String dateOfReturn;
    private int downPayment;
    private int numberOfDays;
    private int dailyRate;
    private int totalRent;
    private boolean onLoan;
    
    //constructor for class VCDToRent.
    public VCDToRent(String theDescription,
                    int theDownPayment,
                    int theDailyRate) 
                    {
        super(theDescription); 
        setDownPayment(theDownPayment);
        setDailyRate(theDailyRate);
        numberOfDays = 0;
        totalRent = 0;
        dateOfHire = "";
        dateOfReturn = "";
        onLoan = false;
    }
    
    //method to access the date of hire.
    public String getDateOfHire()
    {
        return dateOfHire;
    }
    
    //method to access the date of Return.
    public String getDateOfReturn()
    {
        return dateOfReturn;
    }
    
    //method to access the down payment.
    public int getDownPayment()
    {
        return downPayment;
    }
    
    //method to access the number of days.
    public int getNumberOfDays()
    {
        return numberOfDays;
    }
    
    //meethod to access the daily rate.
    public int getDailyRate()
    {
        return dailyRate;
    }
    
    //method to access the total rent of the videoCD.
    public int getTotalRent()
    {
        return totalRent;
    }
    
    //method to set the daily rate of the VCD taking the new daily rate as param.
    public void setDailyRate(int theDailyRate) {
        this.dailyRate = theDailyRate;
    }
    
    //method to set the down payment of the VCD taking the new downpayment as param.    
    public void setDownPayment(int theDownPayment) {
        this.downPayment = theDownPayment;
    }
    
    
    //method to rent the VideoCD to a new customer.
    public void rentVideoCD(String new_CustomerName,
                            String dateOfRequired,
                            String dateToReturn,
                            int daysOfRequired)
    {
        if (onLoan == true) {
            System.out.println("\nSorry this VideoCD " + super.getDescription() + " is already on loan.");
            System.out.println("\nThe VideoCD will be returned by " + dateOfReturn + ".");
        }
        else {
            super.setName(new_CustomerName);
            dateOfHire = dateOfRequired;
            dateOfReturn = dateToReturn;
            numberOfDays = daysOfRequired;
            onLoan = true;
            totalRent = (downPayment + dailyRate * numberOfDays) + totalRent;
        }
    }
    
    
    //method to return the videoCD back.
    public void returnVideoCD() {
        if (onLoan != true) {
            System.out.println("\nSorry! There is no Video CD to be returned.");
            System.out.println("\nThe Video CD is currently not on Loan.");
        }
        else {
            super.setName("");
            numberOfDays = 0;
            dateOfHire = "";
            dateOfReturn = "";
            onLoan = false;
        }
    }
    
    //method to print the description and the total rent collected.
    public void printDescription() {
        super.getDescription();
        System.out.println("The total rent collected by the video CD is $" + totalRent);
    }
    
    
    //method to display the description which call the displaydescription method of superclass.
    public void displayDescription() {
        super.displayDescription();
        super.getName();
        System.out.println("The downpayment is Rs. " + this.getDownPayment());
        System.out.println("The daily rate for the Video CD is Rs. " + this.getDailyRate());
        
        if (onLoan == true ) {
            System.out.println("\nThe date of hire for the Video CD is " + this.getDateOfHire() + ".");
            System.out.println("The date of return for the Video CD is " + this.getDateOfReturn() + ".");
            System.out.println("The the number of days hired for the Video CD is " + this.getNumberOfDays() + ".");
        }
    }
}