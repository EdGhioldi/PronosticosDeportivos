public class Partido {

    // Atributos Clase Partido:
    private Equipo equipo1;
    private Equipo equipo2;
    private int golesEquipo1;
    private int golesEquipo2;


    // Constructor de Clase Partido:
    public Partido(Equipo equipo1, Equipo equipo2, int golesEq1, int golesEq2){
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.golesEquipo1 = golesEquipo1;
        this.golesEquipo2 = golesEquipo2;
    }

    // Métodos de Clase Partido:
    public Equipo getEquipo1() {
        return equipo1;
    }
    public Equipo getEquipo2() {
        return equipo2;
    }
    public int getGolesEquipo1() {
        return golesEquipo1;
    }
    public int getGolesEquipo2() {
        return golesEquipo2;
    }

}