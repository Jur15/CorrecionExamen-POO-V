package poo.correcionexamen;

/**
 *
 * @author Hillary
 */
public class Direccion {

    private String provincia, canton, distrito, sennas;

    public Direccion(String pProvincia, String pCanton, String pDistrito, String pSennas) {
        this.provincia = pProvincia;
        this.canton = pCanton;
        this.distrito = pDistrito;
        this.sennas = pSennas;
    }

    public String getProvincia() {
        return provincia;
    }

    public String getCanton() {
        return canton;
    }

    public String getDistrito() {
        return distrito;
    }

    public String getSennas() {
        return sennas;
    }
}
