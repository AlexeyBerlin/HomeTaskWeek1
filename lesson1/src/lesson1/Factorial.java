package lesson1;

import java.util.Scanner;

/**
 * Method findFactorial is used to find a factorial of a given number
 */

public class Factorial {
    public void findFactorial(){
        int n;
        int factorial = 1;
        Scanner input = new Scanner(System.in);

        System.out.println("Please, enter \"n\" ");
        n = input.nextInt();
        System.out.println(".......................");

        if(n < 0){
            System.out.println("Sorry, but You should enter n >= 0");
        }
        else if(n == 0) {
            System.out.println("Factorial of "+ n + " is: 1");
        }
        else {
            for(int i = 1; i <= n; i++){
                factorial = factorial * i;
            }
            System.out.println("Factorial of "+ n + " is: " + factorial);
        }
    }
}

