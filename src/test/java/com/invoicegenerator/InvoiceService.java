package com.invoicegenerator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @description create Class for Defining the InVoice Generation for Cab Testing
 *
 */
public class InvoiceService {
    /**
     * @description create Method for Calculating the Total Fare Using the Distance and Time
     * Param: Distance and Time
     */
    @Test
    public void givenDistanceAndTime_ShouldReturnTotalFare() {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        double distance = 2.0;
        int time = 5;
        double fare = invoiceGenerator.calculateFare(distance,time);
        Assertions.assertEquals(25,fare);        //Testing the TotalFare
    }

    /**
     * @description create Method for Calculating the Minimum Fare
     * Param : Distance = 0.1 and time = 1
     */
    @Test
    public void givenLessDistanceOrTime_ShouldReturnMinFare() {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        double distance = 0.1;
        int time = 1;
        double fare = invoiceGenerator.calculateFare(distance,time);
        Assertions.assertEquals(5,fare,0.0);     //Testing the Minimum Fare
    }

    /**
     * @description create Method for Generating Invoice Summary for the Customer
     * Param: Distance and Time
     * Result to find: No of Rides, TotalFare, Average Fare
     */
    @Test
    public void givenMultipleRides_ShouldReturnInvoiceSummary() {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        Ride[] rides = {new Ride(2.0, 5),
                        new Ride(0.1,1)
                        };
        InvoiceSummary summary =  invoiceGenerator.calculateFare(rides);
        InvoiceSummary expectedSummary = new InvoiceSummary(2,30.0);
        Assertions.assertEquals(expectedSummary,summary);      //Testing Invoice summary
    }
}
