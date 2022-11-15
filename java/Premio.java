import java.util.ArrayList;

public class Premio {
    private ArrayList combinacionGanadora;
    private int premio;


    public ArrayList getCombinacionGanadora() {
        return combinacionGanadora;
    }


    public int getPremio() {
        return premio;
    }

    // CONSTRUCTORES
    public Premio(ArrayList combinacion, int p) {
      this.combinacionGanadora =combinacion;
      this.premio=p;

    }
}