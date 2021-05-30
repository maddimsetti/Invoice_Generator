package com.invoicegenerator;

/**
 * @description create Class for Defining the Invoice Summary
 *
 */
public class InvoiceSummary {
    //Variables
    private final int noOfRides;
    private final double totalFare;
    private final double averageFare;

    /**
     * @description create constructor for Initializing the Variables
     *
     */
    public InvoiceSummary(int noOfRides, double totalFare) {
        this.noOfRides = noOfRides;
        this.totalFare = totalFare;
        this.averageFare = this.totalFare / this.noOfRides;
    }

    //Equals Method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvoiceSummary that = (InvoiceSummary) o;
        return noOfRides == that.noOfRides && Double.compare(that.totalFare, totalFare) == 0
                                           && Double.compare(that.averageFare, averageFare) == 0;
    }

}
