package CorrecionExamen.src.main.java.poo.correcionexamen;

public class Direccion {
    private String provincia;
    private String canton;
    private String distrito;
    private String sennas;

    public Direccion() {
    }

    public Direccion(String provincia, String canton, String distrito, String sennas) {
        this.provincia = provincia;
        this.canton = canton;
        this.distrito = distrito;
        this.sennas = sennas;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCanton() {
        return canton;
    }

    public void setCanton(String canton) {
        this.canton = canton;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getSennas() {
        return sennas;
    }

    public void setSennas(String sennas) {
        this.sennas = sennas;
    }

    @Override
    public String toString() {
        return "Direccion de la sucursal:" + '\n' +
                "provincia: " + provincia + '\n' +
                ", canton: " + canton + '\n' +
                ", distrito: " + distrito + '\n' +
                ", señas: " + sennas + '\n';
    }
}
