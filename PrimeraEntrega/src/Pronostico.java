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

    //Atributos de la Clase Pronostico:
    public Partido getPartido() {
        return partido;
    }

    public String getResultado() {
        return resultado;
    }
    public String Conclusion() {
        return equipo1.getNombre() + " vs " + equipo2.getNombre() + " - Pronóstico: " + resultado;
    }
}
