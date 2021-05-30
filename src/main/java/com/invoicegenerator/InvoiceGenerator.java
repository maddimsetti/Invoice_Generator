package com.invoicegenerator;

/**
 * @description create Class for Defining the Invoice Generation
 *
 */
public class InvoiceGenerator {
    //variables
    private static final int COST_PER_TIME = 1;
    private double MINIMUM_COST_PER_KILOMETER = 10;
    private double MINIMUM_Fare = 5;

    /**
     * @description create Method for Calculating the Total fare for each Ride
     *
     */
    public double calculateFare(double distance, int time) {
        double totalFare = distance * MINIMUM_COST_PER_KILOMETER + time * COST_PER_TIME;
        return Math.max(totalFare, MINIMUM_Fare);
    }

    /**
     * @description create Method for Generating the Invoice Summary Based on Rides of the Month
     *
     */
    public InvoiceSummary calculateFare(Ride[] rides) {
        double totalFare = 0;
        for(Ride ride : rides) totalFare += this.calculateFare(ride.distance, ride.time);
        return new InvoiceSummary(rides.length, totalFare);
    }
}
