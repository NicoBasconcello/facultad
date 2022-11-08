import java.util.Scanner;

public class Copia {
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
        for (int i = 0; i < vectorizado.length ; i++) {
            for (int j = 0; j < vectorizado.length; j++) {
                if (vectorizado [i] < vectorizado[j]){
                        aux = vectorizado[i];
                        vectorizado[i] = vectorizado[j];
                        vectorizado[j] = aux;
                }
            }
        }
        for (int i = 0; i < vectorizado.length; i++) {
            orden = orden + vectorizado[i];
        }
        return orden;
    }
}
