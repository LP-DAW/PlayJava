package es.ceed.modelo;

/**
 * Created by carlos on 5/4/16.
 */
public class Persona {
    private String id;
    private String usuario;
    private String password;
    private Departamento departamento;

    public Persona(String idpersona, String usuario, String password, Departamento departamento) {
        //implementar constructor
        throw new RuntimeException("Constructor Persona no implementado");

    }


    @Override
    public String toString() {
        return "Persona{" +
                "id='" + id + '\'' +
                ", usuario='" + usuario + '\'' +
                ", password='" + password + '\'' +
                ", departamento=" + departamento +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        throw new RuntimeException("Método equals de persona no implementado");
        //Impl1ementar metodo equals
        // 1. si el objeto es el mismo que el pasado por parámetro => true
        // 2.0 Es necesario realizar un casting de clase Object a Persona.
        // 2. Si los atributos específicos de ambos objetos son iguales (equals)  => true
        // 3. sino False
    }



    public String getIdpersona() {
        return id;

    }

    public void setIdpersona(String idpersona) {
        this.id = idpersona;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
}
