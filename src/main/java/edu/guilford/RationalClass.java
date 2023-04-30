package edu.guilford;

import java.util.Random;

public class RationalClass {

    private int numerator;
    private int denominator;
            
            public RationalClass(int numerator, int denominator) {
                if (denominator == 0) {
                    System.out.println("Warning: denominator is 0");
                this.numerator = numerator;
                this.denominator = denominator;
            } else {
                this.numerator = numerator;
                this.denominator = denominator;
            }
            }
            public String toString() {
                return numerator + "/" + denominator;
            }

            public RationalClass(int numerator) {
                this.numerator = 0;
                this.denominator = 1;
            }

            // create a method negate which reverses the sign of rational numbers
            // since this method modifies the result, it doesnt have to return anything
        
            public RationalClass negate() {
                return new RationalClass(-numerator, denominator);
            }
 
            // create a method invert which swaps the numerator and denominator
            // since this method modifies the result, it doesnt have to return anything
            public RationalClass invert() {
                return new RationalClass(denominator, numerator);
            }

            // create a method toDouble which returns the rational number as a double
            public double toDouble() {
                return (double) numerator / denominator;
            }

            // create a method reduce which reduces the rational number to its lowest terms
            
            private int gcd(int a, int b) {
                if (b == 0) {
                    return a;
                }
                return gcd(b, a % b);
            }
            public void reduce() {
                int gcd = gcd(numerator, denominator);
                numerator /= gcd;
                denominator /= gcd;
            }

            // create a method add which adds two rational numbers
            public RationalClass add(RationalClass other) {
                int newNumerator = numerator * other.denominator + other.numerator * denominator;
                int newDenominator = denominator * other.denominator;
                return new RationalClass(newNumerator, newDenominator);
            }


            public RationalClass() {
                Random rand = new Random();
                int numerator = rand.nextInt(201) - 100; // Generates a random numerator in the range [-100, 100]
                int denominator = rand.nextInt(201) - 100; // Generates a random denominator in the range [-100, 100]
                while (denominator == 0) { // To avoid division by zero, generate a new random denominator if denominator equals 0
                    denominator = rand.nextInt(201) - 100;
                }
                this.numerator = numerator;
                this.denominator = denominator;
            
            






    


}
}
