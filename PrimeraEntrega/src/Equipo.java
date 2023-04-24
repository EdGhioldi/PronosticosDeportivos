public class Equipo {

    //Atributos de la Clase Equipo
    private String nombre;
    private String descripcion;

    //Constructor de la Clase Equipo
    public Equipo (String nombre, String descripcion){
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    //Métodos de la Clase Equipo
    public String getNombre() {
        return nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
