package poo.correcionexamen;

import java.util.Date;

/**
 *
 * @author Jurgenn Morales Jimenez
 */
public class Transportista {

    private String nombre, apellido1, apellido2, telefono;
    private Date fechaNac;
    private TipoTransporte transporte;
    private TipoHorario horario;

    public Transportista(String pNombre, String pApellido1, String pApellido2, String pTelefono, Date pFechaNac, TipoTransporte pTransporte, TipoHorario pHorario) {
        this.nombre = pNombre;
        this.apellido1 = pApellido1;
        this.apellido2 = pApellido2;
        this.telefono = pTelefono;
        this.fechaNac = pFechaNac;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public TipoTransporte getTransporte() {
        return transporte;
    }

    public void setTransporte(TipoTransporte transporte) {
        this.transporte = transporte;
    }

    public TipoHorario getHorario() {
        return horario;
    }

    public void setHorario(TipoHorario horario) {
        this.horario = horario;
    }
}
