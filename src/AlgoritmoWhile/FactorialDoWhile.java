package AlgoritmoWhile;

import java.util.Scanner;

public class FactorialDoWhile {

    public static void main(String[] args) {

        System.out.println("Ingresar el numero factorial");
        Scanner scanner = new Scanner(System.in);
        int factorial = scanner.nextInt();
        scanner.close();
        int a = 1;

        long ResultFact = 1;


        do {

            ResultFact = a * ResultFact;
            a = a + 1;

        } while (a <=factorial);


        System.out.println("El valor del factorial: " + ResultFact);


                 }
    }


