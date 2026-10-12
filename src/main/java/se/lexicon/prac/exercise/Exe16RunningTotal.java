package se.lexicon.prac.exercise;

import java.util.Scanner;

public class Exe16RunningTotal {
    static void main(){
        Scanner input = new Scanner(System.in);
        int total =0;
        int count =0;
        while (true)
        {
            IO.println("Enter a number(0 to stop):");
            int number = input.nextInt();
            if(number==0){
                break;
            }
            total =total + number;
            count++;
            IO.println("The total is " +total + "|count:"+count);
        }
        IO.println("=====Summary=====");
        IO.println("count:"+count);
        IO.println("TOTAL:"+total);
        if(count>0){
            double average =(double)total/count;
            IO.println("average is "+average);
        }else{
            IO.println("No numbers entered");
        }
    }
}
