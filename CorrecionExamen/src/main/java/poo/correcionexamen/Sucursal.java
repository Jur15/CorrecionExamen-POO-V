package poo.correcionexamen;

import java.util.ArrayList;
import java.util.Iterator;

public class Sucursal {

    private String nombre;
    private ArrayList<Url> urlArrayList = new ArrayList<>();
    private ArrayList<Transportista> transportistaArrayList = new ArrayList<>();

    public Sucursal() {
    }

    public Sucursal(String nombre, Url pagina) {
        this.nombre = nombre;
        agregarRed(pagina.getEnlace(), pagina.getTipo());
    }

    //Métodos de clase
    public void agregarTransportista(Transportista pTransportista) {
        this.transportistaArrayList.add(pTransportista);
    }

    public void mostrarTransportistas() {
        Iterator<Transportista> transportistaIterator = this.transportistaArrayList.iterator();
        while (transportistaIterator.hasNext()) {
            Transportista transportistaActual = transportistaIterator.next();
            System.out.println(transportistaActual.toString());
        }
    }

    public void agregarRed(String pEnlace, String pSitio) {
        //Si no se han registro las 4 url permite agregar
        if (this.urlArrayList.size() < 4) {
            this.urlArrayList.add(new Url(pEnlace, pSitio));
        }
    }

    public void mostrarRedes() {
        Iterator<Url> urlIterator = this.urlArrayList.iterator();
        while (urlIterator.hasNext()) {
            Url urlActual = urlIterator.next();
            System.out.println(urlActual.toString());
        }
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Url> getUrlArrayList() {
        return urlArrayList;
    }

    public ArrayList<Transportista> getTransportistaArrayList() {
        return transportistaArrayList;
    }
    
}
