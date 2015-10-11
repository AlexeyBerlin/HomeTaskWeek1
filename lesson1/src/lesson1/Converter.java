package lesson1;

import java.util.Scanner;

/**
 * Method convertDigitToWord is used to convert a number to it's word representation
 */

public class Converter {
    public void convertDigitToWord() {
        int digit;
        String arrayOfWords[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        Scanner input = new Scanner(System.in);

        System.out.println("Please, enter digit to convert");
        digit = input.nextInt();

        if(digit < 0 | digit > 9){
            System.out.print("Sorry, but You should enter digit >= 0 and <= 9");
        }else{
            System.out.print(digit + " -> " + arrayOfWords[digit]);
        }
    }
}
