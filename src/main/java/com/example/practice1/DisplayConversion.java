package com.example.practice1;

public class DisplayConversion {
     // A      //R     N            Argument
    public void displayMiles(double miles){

        final double CM_PER_MILE = 160934.4;
        final double INCHES_PER_MILE = 63360;
        final double METERS_PER_MILE = 1609.344;
        final double KM_PER_MILE = 1.609344;

        System.out.println(miles + " miles is:");
        System.out.println((miles * CM_PER_MILE) + " centimeters");
        System.out.println((miles * INCHES_PER_MILE) + " inches");
        System.out.println((miles * METERS_PER_MILE) + " meters");
        System.out.println((miles * KM_PER_MILE) + " kilometers");
    }
}

