package CorrecionExamen.src.main.java.poo.correcionexamen;

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
}
