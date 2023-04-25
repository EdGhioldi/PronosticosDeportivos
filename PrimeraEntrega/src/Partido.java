public class Partido {

    // Atributos Clase Partido:
    private Equipo equipo1;
    private Equipo equipo2;
    private int golesEquipo1;
    private int golesEquipo2;
    private String resultado;


    // Constructor de Clase Partido:
    public Partido(Equipo equipo1, Equipo equipo2, int golesEquipo1, int golesEquipo2){
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.golesEquipo1 = golesEquipo1;
        this.golesEquipo2 = golesEquipo2;
    }

    // Métodos de Clase Partido:
    public String getResultado() {
        if (golesEquipo1 > golesEquipo2) {
            resultado = "GANA EQUIPO 1";
        } else if (golesEquipo1 == golesEquipo2) {
            resultado = "EMPATE";
        } else {
            resultado = "GANA EQUIPO 2";
        }
        return resultado;
    }

}