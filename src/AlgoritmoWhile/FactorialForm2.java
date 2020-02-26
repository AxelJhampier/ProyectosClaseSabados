package AlgoritmoWhile;

import java.util.Scanner;

public class FactorialForm2 {

    public static void main(String[] args){

        System.out.println("Ingresar el numero factorial");
        Scanner scanner = new Scanner(System.in);
        int factorial = scanner.nextInt();
        scanner.close();

        int a=factorial;
       int ResultFact=1;
       /* if (factorial==1 || factorial==0){
            ResultFact=1;

        }*/


            while (a>=2) {

             ResultFact=a*ResultFact;
                a = a - 1;

                        }




        System.out.println("El valor del factorial: "+ ResultFact);

    }
}
