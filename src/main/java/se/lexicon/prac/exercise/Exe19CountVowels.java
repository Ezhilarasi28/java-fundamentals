package se.lexicon.prac.exercise;

public class Exe19CountVowels {
    static void main(){
        IO.println(countVowels("Hello World"));
        IO.println(countVowels("java"));
        IO.println(countVowels("rhythm"));

    }
    static int countVowels(String word){
        int count = 0;
        word = word.toLowerCase();
        for(int i = 0;i<word.length();i++){
            char ch = word.charAt(i);
            if("aeiou".indexOf(ch) !=-1){
                count++;
            }
        }
        return count;
    }

}
