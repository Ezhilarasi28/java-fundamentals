/*## Exercise 10 – Number Cruncher

### Question
Write three `static` methods: `findMax(int a, int b, int c)`, `findMin(int a, int b, int c)`, and `average(int a, int b, int c)`. Ask the user to enter three integers, then print the maximum, minimum, and average using those methods.
*/



package se.lexicon.prac2.exercise;

import java.util.Scanner;

public class Exe10NumberCruncher {

    void main(){
        Scanner scanner = new Scanner(System.in);
        IO.println("Enter first number: ");
        int a =scanner.nextInt();
        IO.println(" Enter second number: ");
        int b =scanner.nextInt();
        IO.println(" Enter third number: ");
        int c =scanner.nextInt();
        IO.println(" Maximum:" + findMax(a,b,c));
        IO.println(" Minimum:" + findMin(a,b,c));
        IO.println("Average:" + average(a,b,c));
    }
    //call method
    static int findMax(int a,int b,int c){
        return Math.max(a,Math.max(b,c));
    }
    static int findMin(int a,int b,int c){
        return Math.min(a,Math.min(b,c));
    }
    static double average(int a,int b,int c){
        return (a+b+c)/3.0;
    }
}
