package AlgoritmoWhile;

public class Foreach {
    public static void main(String[] args) {
        /* //Primera Forma
        String[] nombres =new String []{"Phierina","Reyes","Wong"};

        //Segunda Forma
       String[] nombres =new String[3];
        nombres[0] = "Alex";
        nombres[1] = "Rojas";
        nombres[2] = "Herrera";
        for (String nombre: nombres){
            System.out.println(nombre+",");


        }*/
        /*
        int [] valo =new int [3];
        valo[0] = 10;
        valo[1] = new Integer(5);
        valo[2] = 15;
        for (int i=1;i < valo.length;i++){
            System.out.print(valo[i] - valo[i-1] + "");
            */
        //FOR ANIDADOS
        for (int i=1;i <=5;i++){
            for (int j=2;j <=4;j++)
                for (int k=3;k<=6;k++) System.out.println("Hola Mundo");

        }
        //FOR INFINITO
        for (;;){
            System.out.println("Hola World");

        }

    }


    }
