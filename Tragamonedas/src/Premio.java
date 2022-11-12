public class Premio {
    private Fruta[] CombinacionGanadora;
    private int premio;

    public Premio(Ejecutador.Fruta[] combinacion1, int p) {
    }

    public Fruta[] getCombinacionGanadora() {
        return CombinacionGanadora;
    }

    public int getPremio() {
        return premio;
    }

    // CONSTRUCTORES
    public Premio(Fruta[] combinacion, int p) {
        CombinacionGanadora =combinacion;
        premio=p;
    }
}