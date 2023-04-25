public class Equipo {

    //Atributos de la Clase Equipo
    private final String nombre;
    private final String descripcion;

    //Constructor de la Clase Equipo
    public Equipo (String nombre, String descripcion){
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    //Métodos de la Clse Equipo
    public String getNombre() {
        return nombre;
    }
}
