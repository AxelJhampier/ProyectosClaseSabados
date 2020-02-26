package AlgoritmoWhile;
/*Escriba un origrma de verificacion de credito instantanea que apreube cualquier personas
* que gan emas de 25 000 y tenga un core dcrediticio de 700 o mejor ..Rechazo a los demas */

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class VerificacionCrediticio {

    static int salarioRequerido= 25000;
    static int scoreCrediticio= 700;
    static Scanner scanner = new Scanner(System.in); //acceder demas metodos

    public static void main(String[] args) {

        double salario =getSalario();
        int score = getScoreCrediticio();
        scanner.close();
        //VERIFICAR SI CALIFICA O NO CALIFICA
        boolean califica =estaUsuarioCalificado(scoreCrediticio,salario);
        NotificarUsuario(califica);
    }

    private static double getSalario() {
        System.out.println("Ingresar Salario: ");
        double salario =scanner.nextDouble();
        return  salario;

    }
    private static int getScoreCrediticio() {
        System.out.println("Ingresar Score: ");
        int score = scanner.nextInt();
        return  score;
    }
    private static boolean estaUsuarioCalificado(int score,double salario) {

        if (score >=scoreCrediticio && salario >=salarioRequerido){

                 return true;
        }else return  false;

    }
    private static void NotificarUsuario(boolean califica) {
        if (califica){
            System.out.println("Calificado");
        }else  System.out.println("No Califica");

    }
    }


    //TAREA DE CREAR CLASE DE UN RECTANGULO