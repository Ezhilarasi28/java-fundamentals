package se.lexicon.prac.exercise;

import java.util.Scanner;

public class Exe7ConvertSeconds {
    static void main() {
        Scanner input = new Scanner(System.in);
        IO.print("enter the number of seconds  want to convert:");
        int totalSeconds = input.nextInt();

        int hours = totalSeconds / 3600;  //23  //1 hours =60*60 =3600 seconds
        int remain = totalSeconds % 3600; //3599
        int minutes = remain / 60; //59
        int seconds = remain % 60;   //59

        IO.print(String.format("%02d:%02d:%02d",
                hours, minutes, seconds));

    }
}
