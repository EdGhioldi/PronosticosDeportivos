public class Pronostico {

    //Atributos de la Clase Pronóstico:
    private Partido partido;
    private Equipo[] equipos;
    private ResultadoEnum resultado;

    //Constructores de la Clase Pronóstico:
    public Pronostico(Partido partido, Equipo[] equipos, ResultadoEnum resultado){
        this.partido = partido;
        this.resultado = resultado;
        this.equipos = equipos;
    }

    //Atributos de la Clase Pronostico:
    public Partido getPartido() {
        return partido;
    }
    public Equipo[] getEquipos() {
        return equipos;
    }
    public ResultadoEnum getResultado() {
        return resultado;
    }
    public String toString() {
        return equipos[0].getNombre() + " vs " + equipos[1].getNombre() + " - Pronóstico: " + resultado.toString();
    }
}
