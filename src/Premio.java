

public class Premio {
    private String[] combinacionGanadora;
    private int premio;


    // CONSTRUCTORES
    public Premio(String[] combinacion, int p) {
        this.combinacionGanadora = combinacion;
        this.premio=p;

    }
    public int getPremio() {
        return premio;
    }

    public String[] getCombinacionGanadora() {
        return combinacionGanadora;
    }

    public void setCombinacionGanadora(String[] combinacionGanadora) {
        this.combinacionGanadora = combinacionGanadora;
    }

    public void setPremio(int premio) {
        this.premio = premio;
    }
}