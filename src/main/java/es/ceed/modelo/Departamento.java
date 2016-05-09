package es.ceed.modelo;

/**
 * Created by carlos on 5/4/16.
 */
public class Departamento {
    private String id;
    private String nombre;

    public Departamento(String id, String nombre) {
        //Implementar constructor
        throw new RuntimeException("Constructor Departamento no implementado");
    }

    @Override
    public String toString() {
        return String.format("{'%s'}", nombre);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
