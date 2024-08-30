package ex_Conditions;

import java.util.Scanner;

public class TriangleClassifier {
    public static void main(String[] args) {
        // Write a program that classifies a triangle based on its side lengths.
// Given three input values representing the lengths of the sides, determine
// if the triangle is equilateral (all sides are equal),
// isosceles (exactly two sides are equal), or
// scalene (no sides are equal).
// Use an if-else statement to classify the triangle.
// side1, side2, side3 ->
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for side1: ");
        float side1 = sc.nextFloat();
        System.out.println("Enter the value for side2: ");
        float side2 = sc.nextFloat();
        System.out.println("Enter the value for side3:");
        float side3 = sc.nextFloat();

          if(side1==side2 && side2==side3 && side1==side3) {
              System.out.println("It is an  equilateral triangle");
          }
          else if(side1==side2 || side2==side3 || side3== side1){
              System.out.println("It is an Isocesales");
          }

          else {
              System.out.println("It is a Scalene");
          }

    }
}
