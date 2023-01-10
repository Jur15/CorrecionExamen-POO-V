package poo.correcionexamen;

import java.util.Date;

/**
 *
 * @author Jurgenn Morales Jimenez
 */
public class Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empresa e = new Empresa();

        // Crea la primera sucursal
        Sucursal s1 = new Sucursal("La Lima", new Url("www.transportelima.com", "Pagina web"));
        s1.agregarTransportista(new Transportista("Alberto", "Guzman", "Torres", "88881111", new Date(), TipoTransporte.Moto, TipoHorario.Manana));
        s1.agregarTransportista(new Transportista("Julio", "Blanco", "Castillo", "88882222", new Date(), TipoTransporte.Ambos, TipoHorario.Tarde));
        s1.agregarTransportista(new Transportista("Maria", "Jimenez", "Loaiza", "88883333", new Date(), TipoTransporte.Ambos, TipoHorario.Tarde));
        s1.agregarTransportista(new Transportista("Esteban", "Hernandez", "Zuñiga", "88884444", new Date(), TipoTransporte.Camioneta, TipoHorario.Manana));
        s1.agregarTransportista(new Transportista("Carlos", "Morales", "Gonzalez", "88885555", new Date(), TipoTransporte.Moto, TipoHorario.Manana));
        e.agregarSucursal(s1);

        // Crea la segunda sucursal
        Sucursal s2 = new Sucursal("Escazu", new Url("www.transporteescazu.com", "Pagina web"));
        s2.agregarRed("www.twitter.com/TransporteEscazu", "Twitter");
        s1.agregarTransportista(new Transportista("Mario", "Rodriguez", "Chavez", "88881111", new Date(), TipoTransporte.Moto, TipoHorario.Manana));
        s1.agregarTransportista(new Transportista("David", "Diaz", "Castillo", "88882222", new Date(), TipoTransporte.Ambos, TipoHorario.Tarde));
        s1.agregarTransportista(new Transportista("Carla", "Fernandez", "Zuñiga", "88883333", new Date(), TipoTransporte.Ambos, TipoHorario.Tarde));
        s1.agregarTransportista(new Transportista("Alejandro", "Hernandez", "Zuñiga", "88884444", new Date(), TipoTransporte.Camioneta, TipoHorario.Manana));
        s1.agregarTransportista(new Transportista("Sebastian", "Gomez", "Gonzalez", "88885555", new Date(), TipoTransporte.Moto, TipoHorario.Manana));
        e.agregarSucursal(s2);

        // Muestra las cantidades
        e.getCantSucursales();
        e.getCantTransportistas();
    }
}
