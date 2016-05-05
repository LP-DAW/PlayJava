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
        this.id = idpersona;
        this.usuario = usuario;
        this.password = password;
        this.departamento = departamento;
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
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Persona persona = (Persona) o;

        if (usuario != null ? !usuario.equals(persona.usuario) : persona.usuario != null) return false;
        return password != null ? password.equals(persona.password) : persona.password == null;

    }

    @Override
    public int hashCode() {
        int result = usuario != null ? usuario.hashCode() : 0;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
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
