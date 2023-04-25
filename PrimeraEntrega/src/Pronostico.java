public class Pronostico {

    //Atributos de la Clase Pronóstico:
    private Partido partido;
    private Equipo equipo1;
    private Equipo equipo2;
    private String resultado;

    //Constructores de la Clase Pronóstico:
    public Pronostico(Partido partido, String resultado, Equipo equipo1, Equipo equipo2){
        this.partido= partido;
        this.resultado = resultado;
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
    }

    //Metodos de la Clase Pronostico:
    public Partido getPartido() {
        return partido;
    }
    public Equipo getEquipo1() {
        return equipo1;
    }
    public Equipo getEquipo2() {
        return equipo2;
    }
    public String getResultado() {
        return resultado;
    }

}
