package com.invoicegenerator;
/**
 * @description create Class for Defining Rides Based on Distance and Time
 *
 */
public class Ride {
    //Variables
    public final double distance;
    public final int time;

    /**
     * @description create Constructor for Initializing the Variables
     *
     */
    public Ride(double distance, int time) {
        this.distance = distance;
        this.time = time;
    }
}
