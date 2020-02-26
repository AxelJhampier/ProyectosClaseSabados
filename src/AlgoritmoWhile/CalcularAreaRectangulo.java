
package AlgoritmoWhile;

//Calcular area de un Rectangulo
import java.util.Scanner;


public class CalcularAreaRectangulo{

    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in); //acceder demas metodos
         System.out.println("Ingrese base del rectangulo");
         double base = scanner.nextDouble();
         System.out.println("Ingrese base del altura");
         double altura = scanner.nextDouble();

        double area = base * altura;

            System.out.println("El area del rectangulo es : "+ area);
        
       
    }

}
