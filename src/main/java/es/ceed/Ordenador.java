package es.ceed;


public class Ordenador {
    private String ref;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        Ordenador ordenador = (Ordenador) o;

        return ref.equals(ordenador.ref);
    }

    public Ordenador(String ref) {

        this.ref = ref;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    @Override
    public String toString() {
        return "Ordenador{" +
                "ref='" + ref + '\'' +
                '}';
    }
}
