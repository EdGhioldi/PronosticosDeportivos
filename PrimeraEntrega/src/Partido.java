public class Partido {

    // Atributos Clase Partido:
    private Equipo eq1;
    private Equipo eq2;
    private int golesEq1;
    private int golesEq2;


    // Constructor de Clase Partidos:
    public Partido(Equipo eq1, int golesEq1, int golesEq2, Equipo eq2){
        this.eq1 = eq1;
        this.eq2 = eq2;
    }

    // Métodos de Clase Partidos:


    public int getGolesEq1() {
        return golesEq1;
    }
    public void setGolesEq1(int golesEq1) {
        this.golesEq1 = golesEq1;
    }
    public int getGolesEq2() {
        return golesEq2;
    }
    public void setGolesEq2(int golesEq2) {
        this.golesEq2 = golesEq2;
    }
}
