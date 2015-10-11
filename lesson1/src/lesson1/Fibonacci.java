package lesson1;

import java.util.Scanner;

/**
 * Method printFibonacciSequence is used to print a sequence of fibonacci numbers
 *
 * Zero(0) is excluded. Please, refer to: https://ru.wikipedia.org/wiki/Числа_Фибоначчи for additional info
 */

public class Fibonacci {
    public void printFibonacciSequence() {
        int n;
        int F0 = 0;
        int F1 = 1;
        int Fn;
        Scanner input = new Scanner(System.in);

        System.out.println("Please, enter \"n\" (number of elements in fibonacci sequence)");
        n = input.nextInt();
        System.out.println(".......................");

        if(n < 1){
            System.out.println("Sorry, but You should enter n >= 1 ");
        }
        else if(n == 1){
            System.out.print(F1);
        }
        else{
            System.out.print(F1 + " ");
            for(int i = 0; i < n-1; i++){
                Fn =  F0 + F1;
                System.out.print(Fn + " ");
                F0 = F1;
                F1 = Fn;
            }
        }
    }
}
