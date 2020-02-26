package AlgoritmoWhile;

import java.util.Scanner;

public class IngresaNombre {
    public static void main(String[] args) {
        System.out.println("Ingresar tu Nombre");
        Scanner scanner = new Scanner(System.in);
        String name =scanner.next();
        scanner.close();
        IngresaNombre(name);
        String mensaje = getMensaje(name);
        System.out.println(mensaje);

    }
        public static void IngresaNombre(String name){
            System.out.println("QUE HACES: "+ name);
    }

    public static String getMensaje (String name){
        String mensaje ="Bienvenido "+name;
        return mensaje;

    }

}
