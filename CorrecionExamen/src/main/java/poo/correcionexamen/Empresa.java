package poo.correcionexamen;

import java.util.ArrayList;

/**
 *
 * @author Jurgenn Morales Jimenez
 */
public class Empresa {

    private ArrayList<Sucursal> listaSucursales;

    public Empresa() {
        listaSucursales = new ArrayList<>();
    }

    public void agregarSucursal(Sucursal pSucursal) {
        listaSucursales.add(pSucursal);
    }

    public void getCantSucursales() {
        System.out.println("Cantidad total de sucursales:" + listaSucursales.size());
    }

    public void getCantTransportistas() {
        int cant = 0;
        for (Sucursal s : listaSucursales) {
            cant += s.getTransportistaArrayList().size();
        }
        System.out.println("Cantidad total de transportistas: " + cant);
    }
}
