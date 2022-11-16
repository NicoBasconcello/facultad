

import java.util.Arrays;
import java.util.Random;


public class Maquina {
    //atributos de la clase Maquina (características)
    private int casillas;
    private double precioJugada;
    private double creditoDisp;
    private Premio[] coleccionPremios;

   //constructor: sirve para pasar por parámetro al instanciarla
    public Maquina(int nCasillas, double precio, Premio... premio) {
        precioJugada = precio;
        casillas = nCasillas;
        coleccionPremios = premio;
    }

    public double getPrecioJugada() {
           return precioJugada;
    }

    public void setPrecioJugada(double precio) {
        precioJugada = precio;
    }

    public double getCredito() {
        return creditoDisp;
    }

    public void setCreditoDisp(double credito) {
        creditoDisp = credito;
    }

    public int getnCasillas() {
          return casillas;
    }

    public Premio[] getColeccionPremios() {
          return coleccionPremios;
    }

    //se crea una función para incrementar el crédito que dispone el usuario al iniciar
    public double incrementarCredito(double incremento) {
        incremento = creditoDisp + incremento;
        return incremento;
    }

    //cobrar al retirar el premio
    public double cobrar() {
        System.out.println("Retirando " + creditoDisp + " créditos de la maquina");
        creditoDisp = 0;
        return creditoDisp;
    }

    public void jugar() {
        //se le pasa el precio por cada jugada creado en la instancia de la clase Maquina
        //en el main
        setPrecioJugada(precioJugada);
        //juega si el crédito disponible es mayor al precio de jugada
        if (getCredito() >= precioJugada) {
            creditoDisp = creditoDisp - precioJugada;

            //genera frutas al azar dentro de las casillas
            Random generador = new Random();
            String[] frutas;
            frutas = new String[casillas];
            Fruta[] frutasAleatorias = Fruta.values();

            //llena las casillas con frutas aleatorias
            for (int i = 0; i < casillas; i++) {
                int index = generador.nextInt(5);
                frutas[i] = frutasAleatorias[index].toString();
                System.out.print("[" + frutas[i] + "]");
            }
            System.out.println("\n---------------------------------------------------------------------------");


            //comprueba si combinación esta en premios registrados
            int n = 1;
            for (Premio premio : coleccionPremios) {
                if (Arrays.equals(frutas, premio.getCombinacionGanadora()) == true){
                    creditoDisp = creditoDisp + premio.getPremio();
                    System.out.println("¡FELICITACIONES! ha ganado" + " " + premio.getPremio() + " " + "créditos");
                }
            }
        }
    }
}

