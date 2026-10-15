/*xercise 12 – Password Generator

### Question
Ask the user for a desired password length. Generate a random password of exactly that length using characters from the set: lowercase letters (`a`–`z`), uppercase letters (`A`–`Z`), and digits (`0`–`9`). Use `Math.random()` and `StringBuilder` to build the result.

**Example interaction:**
```text
Enter password length: 10
Generated password: gR4kXp1QzA
```*/


package se.lexicon.prac2.exercise;

import java.util.Scanner;

public class Exe12PasswordGenerator {
    void main(){
Scanner UserInput =new Scanner(System.in);
IO.println("Check the password length");
int length=UserInput.nextInt();
String characters="abcdefghijklmanopqrstuvwxyz" +"ABCDEFGHIJKLMNOPQRSTUVWXYZ"+
        "0123456789";
StringBuilder password =new StringBuilder();
for(int i=0;i<length;i++){
    int randomIndex=(int)(Math.random()*characters.length());
    char randomChar = characters.charAt(randomIndex);
    password.append(randomChar);
}
IO.println("Generated password:" +password);
    }
}
