package se.lexicon.prac.exercise;

public class Exe20PrimeNumbers {
    static void main(){
        for(int j = 2;j<=50;j++){
            if(isPrime(j)){
                IO.println(j + " ");
            }
        }
    }
    static boolean isPrime(int number){
        if(number<=1) {
            return false;
        }
        for(int i=2; i*i<=number;i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }
}
