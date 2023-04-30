package edu.guilford;

import java.util.Random;

/**
 * Hello world!
 *
 */
public class RationalDriver 
{
    public static void main( String[] args )

    {

        // test the constructor with random values

        Random rand = new Random();
        System.out.println("Testing addition of rational numbers: ");
        RationalClass r1 = new RationalClass(rand.nextInt(100), - rand.nextInt(100)); // Generates a random numerator in the range [-100, 100]
        RationalClass r2 = new RationalClass(rand.nextInt(100), - rand.nextInt(100)); // Generates a random numerator in the range [-100, 100]

        // print the objects
        System.out.println("Input: " + r1 + " and " + r2 + "; " + "Expected output: " + r1.add(r2));

        // test the negate method
        System.out.println("Negate method: " + r1.negate() + " and " + r2.negate());

        // test the invert method
        System.out.println("Invert method: " + r1.invert() + " and " + r2.invert());
    
        // test the toDouble method
        System.out.println("toDouble method: " + r1.toDouble() + " and " + r2.toDouble());
        

        // test the reduce method
        r1.reduce();
        r2.reduce();
        System.out.println("Reduce method: " + r1 + " and " + r2);

        // test the add method
        System.out.println("Add method: " + r1.add(r2));

        




    }
}
