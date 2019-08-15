/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.nickchin.lab;

import java.util.Arrays;

/**
 *
 * @author Nick Chin
 */
public class Main {

    /**
     * @param args any String array, but won't be used
     */
    public static void main(String[] args) {
        // 0 arguments test (extra)
        System.out.println("Here is an example of 0 arguments minMaxAvg.");
        minMaxAvg(new double[0]);
        
        // 3 arguments test (required)
        System.out.println("Here is an example of 3 arguments in minMaxAvg.");
        double[] nums = new double[3];
        int floor = -10; // smallest value in random number generation
        int ceiling = 10; // largest value in random number generation 
        int range = ceiling - floor + 1; // range of numbers
        for (int i = 0; i < nums.length; i++) {
            // generating 3 numbers in range and assigning it to nums array
            nums[i] = (Math.random() * range) + floor;
        }
        System.out.println("3 arguments are: " + Arrays.toString(nums));
        minMaxAvg(nums);
        
        // any number of arguments (extra)
        System.out.println("Here is an example of random number of arguments.");
        double[] longNums = new double[(int)(Math.random() * 20) + 1];
        for (int j = 0; j < longNums.length; j++) {
            // generating longNums.length amount of random numbers and
            // assigning them to longNums
            longNums[j] = (Math.random() * range) + floor;
        }
        System.out.println(longNums.length + " arguments are: " + 
                Arrays.toString(longNums));
        minMaxAvg(longNums);
    }
    
    /**
     * 
     * @param nums an array of double precision numbers, can be empty
     */
    private static void minMaxAvg(double... nums) {
        if (nums.length == 0) {
//            if there are no arguments, print saying there were 0 inputted
            System.out.println("There are 0 numeric elements in input.\n");
        } else {
//            otherwise do calculation for any amount of arguments
            double min = nums[0];
            double max = nums[0];
            double avg = 0;
            for (double i : nums) {
                min = Math.min(min, i);
                max = Math.max(max, i);
                avg += i;
            }
            avg = avg / nums.length;
            System.out.println("Minimum: " + min);
            System.out.println("Maximum: " + max);
            System.out.println("Average: " + avg + "\n");
        }
    }
}
