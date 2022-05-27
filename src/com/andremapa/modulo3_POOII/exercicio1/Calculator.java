package com.andremapa.modulo3_POOII.exercicio1;

import java.util.Scanner;
import static com.andremapa.modulo3_POOII.exercicio1.UI.*;

public class Calculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean control = true;
        do {
            switch (chooseTheOptionOnMenu(sc)) {
                case 1 -> System.out.println("The total is: " + new Sum().calculate(popArrayNumbers(sc)));
                case 2 -> System.out.println("The total is: " + new Subtraction().calculate(popArrayNumbers(sc)));
                case 3 -> System.out.println("The total is: " + new Multiplication().calculate(popArrayNumbers(sc)));
                case 4 -> System.out.println("The total is: " + new Division().calculate(popArrayNumbers(sc)));
                case 5 -> control = false;
            }
        } while(control);
    }
}
