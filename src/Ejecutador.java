

import java.util.Scanner;

public class Ejecutador {
    public static void main(String[] args) {

        // 1. Creamos un Array de tipo String, donde se colocan las combinaciones
        String[] combinacion1 = new String[]{"FRUTILLA", "FRUTILLA", "FRUTILLA"};
        //1.1 Se instancia la clase Premio y se le pasa por parámetro la combinación
        //y el premio
        Premio premio1 = new Premio(combinacion1, 20);
        String[] combinacion2 = new String[]{"FRUTILLA", "FRUTILLA", "NARANJA"};
        Premio premio2 = new Premio(combinacion2, 15);
        String[] combinacion3 = new String[]{"FRUTILLA", "FRUTILLA", "SANDIA"};
        Premio premio3 = new Premio(combinacion3, 15);
        String[] combinacion4 = new String[]{"FRUTILLA", "FRUTILLA", "BANANA"};
        Premio premio4 = new Premio(combinacion4, 15);
        String[] combinacion5 = new String[]{"FRUTILLA", "FRUTILLA", "PERA"};
        Premio premio5 = new Premio(combinacion5, 15);
        String[] combinacion6 = new String[]{"SANDIA", "FRUTILLA", "SANDIA"};
        Premio premio6 = new Premio(combinacion6, 15);
        String[] combinacion7 = new String[]{"SANDIA", "SANDIA", "SANDIA"};
        Premio premio7 = new Premio(combinacion7, 20);
        String[] combinacion8 = new String[]{"BANANA", "BANANA", "BANANA"};
        Premio premio8 = new Premio(combinacion8, 20);
        String[] combinacion9 = new String[]{"NARANJA", "NARANJA", "NARANJA"};
        Premio premio9 = new Premio(combinacion9, 20);
        String[] combinacion10 = new String[]{"PERA", "PERA", "PERA"};
        Premio premio10 = new Premio(combinacion10, 20);



        /* 2. Crea una máquina con un tamaño de combinación de 3 frutas,
         * un precio por partida de 0,5 créditos
         * y los premios declarados previamente
         */
        Maquina maquina = new Maquina(3, 0.5, premio1, premio2, premio3, premio4, premio5, premio6, premio7,
                premio8, premio9, premio10);

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

        maquina.setCreditoDisp(credito);
        while (maquina.getCredito() > 0){

            //4.1 Realiza la jugada
            maquina.jugar();


            System.out.println("CRÉDITO DISPONIBLE:  --- "+maquina.getCredito());

            //4.3 Pide al usuario que pulse intro para continuar o c para cobrar
            System.out.println("Pulse intro para volver a jugar o C para cobrar");
            String respuesta = teclado.nextLine().toUpperCase();
            if (respuesta.equals("C")){
                maquina.cobrar();
                break;
            }
        }

        // 5. Al quedarse sin crédito, larga el siguiente msj
        System.out.println("Fin del juego. No dispone de credito suficiente");
    }

}