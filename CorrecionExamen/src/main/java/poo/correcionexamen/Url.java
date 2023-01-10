package CorrecionExamen.src.main.java.poo.correcionexamen;

public class Url {
    private String enlace;
    private String tipo;

    public Url() {
    }

    public Url(String enlace, String tipo) {
        this.enlace = enlace;
        this.tipo = tipo;
    }

    public String getEnlace() {
        return enlace;
    }

    public void setEnlace(String enlace) {
        this.enlace = enlace;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Url" +
                "enlace: " + enlace + '\n' +
                ", tipo: " + tipo + '\n';
    }
}
