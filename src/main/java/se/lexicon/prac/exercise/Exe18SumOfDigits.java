package se.lexicon.prac.exercise;

public class Exe18SumOfDigits {
    static void main(){


        IO.println(sumofDigits(1234));
        IO.println(sumofDigits(9));
        IO.println(sumofDigits(305));
    }
    static int sumofDigits(int n){
        int sum = 0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
}
