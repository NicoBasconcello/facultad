import java.util.Random;
import java.util.Arrays;

public class Maquina {
    private int casillas;
    private double precJug;
    private double credDisp;
    private Premio[] coleccion;

    public Maquina(int nCasillas, double precio, Premio... premio) {
        precJug=precio;
        casillas=nCasillas;
        coleccion=premio;
    }

    public double getPrecJug() {
        return precJug;
    }
    public void setPrecJug(double precio) {
        precJug = precio;
    }
    public double getCredito() {
        return credDisp;
    }
    public void setCredDisp(double credito) {
        credDisp = credito;
    }
    public int getnCasillas() {
        return casillas;
    }
    public Premio[] getColeccion() {
        return coleccion;
    }

    public double incrementarCredito(double incremento) {
        return credDisp + incremento;
    }

    public double cobrar() {
        System.out.println("Retirando "+credDisp+" euros de la maquina");
        credDisp = 0;
        return credDisp;
    }

    public void jugar() {
        setPrecJug(precJug);
        if (getCredito() >= precJug) {
            credDisp = credDisp - precJug;

            Random generador = new Random();
            Fruta[] frutas;
            frutas = new Fruta[casillas];
            Fruta[] frutas_aleatorias=Fruta.values();



            for (int i = 0;i<casillas; i++){
                int index = generador.nextInt(5);
                frutas[i]=frutas_aleatorias[index];
                System.out.print("[" + frutas[i] + "]");

            }
            System.out.println("\n---------------------------------------------------------------------------");
            int n = 1; // n = numero de premios
            for (int i = 0; i <= n; i++) {
                //comprueba si combinación esta en premios registrados
                if (Arrays.equals(frutas, coleccion[i].getCombinacionGanadora()) == true){
                    credDisp = credDisp + coleccion[i].getPremio();
                    System.out.println(credDisp);
                }

            }


        }


    }
}