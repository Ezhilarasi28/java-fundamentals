package se.lexicon.prac2.exercise;
import java.util.Random;
import java.util.Scanner;

public class Exe11DiceStatistics {
    void main(){
        Scanner userInput = new Scanner(System.in);
        Random random =new Random();

        IO.println("How many rolls?");
        int rolls =userInput.nextInt();
        int doubleCount =0;
        for(int i=0; i<rolls; i++){
           int dice1 =random.nextInt(6)+1;
           int dice2 =random.nextInt(6)+1;
           int sum =dice1 + dice2;
           IO.println("Roll" + i +":" +dice1 +"+" +dice2 +"=" +sum);
           if(dice1==dice2){
               doubleCount++;
               IO.println("You have double");
           }
           IO.println();
        }
        System.out.println("Doubles rolled:"+doubleCount+ "out of"+rolls);
    }
}
