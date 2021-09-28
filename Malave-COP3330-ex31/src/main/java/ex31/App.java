package ex31;
import java.util.*;

/*
 *  UCF COP3330 Fall 2021 Assignment 31 Solution
 *  Copyright 2021 Jose Malave
 */
public class App 
{

    public static void main( String[] args )
    {
        Scanner in  = new Scanner(System.in);
        System.out.println( "Resting Pulse:" );
        int restingHR = in.nextInt();
        System.out.println( "Age:" );
        int age = in.nextInt();

        System.out.println( "Intensity    | Rate\n" +
                "-------------|--------" );
        for(int i = 55; i < 96; i++)
        {
            double TargetHeartRate = 0;
            double intensity  = (i * 0.01);
            TargetHeartRate = Math.round((((220 - age) - restingHR) * intensity) + restingHR);
            System.out.println(i + "%          | " +  TargetHeartRate + " bpm");
        }

    }
}
