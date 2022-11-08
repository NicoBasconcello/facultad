import java.util.Scanner;

public class Rec {
    static char vectorizado[];
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String apellido, ordenado;
        System.out.println("apellido:");
        apellido = leer.next();
        vectorizado = new char[apellido.length()];
        ordenado = alfabetizado(apellido);
        System.out.println(apellido + "ordenado es: " + ordenado);
    }
    static String alfabetizado(String apellido){
        String orden = "";
        char aux;

        for (int i = 0; i < apellido.length(); i++) {
            vectorizado[i] = apellido.toLowerCase().charAt(i);
        }
        boolean band = false;
        for (int i = 0; i < vectorizado.length; i++) {
            if (vectorizado[i] > vectorizado[i+1]){
                aux= vectorizado[i];
                vectorizado[i] = vectorizado[i+1];
                vectorizado[i+1]= aux;
                band= true;
            }

        }
        for (int i = 0; i < vectorizado.length; i++) {
            orden = orden + vectorizado[i];
        }
        return orden;
    }
}
