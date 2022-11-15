
import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejecutador {
    public static void main(String[] args) {

        // 1. Declara dos variables locales de tipo Premio
        ArrayList combinacion1 = new ArrayList();
        combinacion1.add(Fruta.FRUTILLA);
        combinacion1.add(Fruta.FRUTILLA);
        combinacion1.add(Fruta.FRUTILLA);

        Premio premio1 = new Premio(combinacion1, 20);
       // Fruta[] combinacion2 = {Fruta.SANDIA, Fruta.FRUTILLA, Fruta.SANDIA};
        //Premio premio2 = new Premio(combinacion2, 10);
        //Fruta[] combinacion3 = {Fruta.BANANA, Fruta.BANANA, Fruta.SANDIA};
        //Premio premio3 = new Premio(combinacion2, 5);

        /* 2. Crea una máquina con un tamaño de combinación de 3 frutas,
         * un precio por partida de 0,5 euros
         * y los dos premios declarados previamente
         */
        Maquina maquina = new Maquina(3, 0.5, premio1); //premio2, premio3);

        /* 3. Solicita al usuario que introduzca por teclado la cantidad
         * de crédito para jugar.
         */
        System.out.println("Introduzca el crédito: ");
        Scanner teclado = new Scanner(System.in);
        double credito = teclado.nextDouble();
        teclado.nextLine();
        maquina.incrementarCredito(credito);
        System.out.println(credito);


        // 4. Jugamos mientras haya crédito disponible
        Enum<Fruta>[] combinacion;
        maquina.setCredDisp(credito);
        while (maquina.getCredito() > 0){

            //4.1 Realiza la jugada
            maquina.jugar();


            System.out.println("CRÉDITO DISPONIBLE:  --- "+maquina.getCredito());

            //4.3 Pide al usuario que pulse intro para continuar
            System.out.println("Pulse intro para volver a jugar o C para cobrar");
            String respuesta = teclado.nextLine().toUpperCase();
           if (respuesta.equals("C")){
               maquina.cobrar();
            break;
           }
        }


        System.out.println("Fin del juego: no dispone de credito suficiente");
    }
    public enum Fruta {
        FRUTILLA, SANDIA, BANANA, NARANJA, PERA
    }
}