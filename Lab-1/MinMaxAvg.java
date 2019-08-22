/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Arrays;

/**
 *
 * @author Nick Chin
 */
public class MinMaxAvg {
    
    /**
     * 
     * @param nums an array of double precision numbers, can be empty
     */
    private static void calc(double... nums) {
        if (nums.length == 0) {
//            if there are no arguments, print saying there were 0 inputted
            System.out.println("There are 0 numeric elements in input.");
        } else {
//            otherwise do calculation for any amount of arguments
            double min = nums[0]; // set initial min as first element
            double max = nums[0]; // set initial max as first element
            double avg = 0; // set initial avg as 0.0
            for (double i : nums) {
                min = Math.min(min, i); // take min of current min and i
                max = Math.max(max, i); // take max of current max and i
                avg += i; // aggregate all values of nums
            }
            avg = avg / nums.length; // calc average
            System.out.println("Minimum: " + min);
            System.out.println("Maximum: " + max);
            System.out.println("Average: " + avg);
        }
    }
    
    /**
     * @param args a String array, if values can be parsed as double, it will
     * calculate the min, max, and avg of the numbers. If not, it will throw an
     * error and print accordingly.
     */
    public static void main(double[] args) {
        // try catch block to ensure errors are caught for incorrect input
        try {
            // call calc to calculate the min max avg
            calc(args);
        } catch (Exception e) {
            System.err.println("Not all inputs could be parsed as doubles.");
            System.err.println("Please input an array of only doubles.");
        }
    }
}
