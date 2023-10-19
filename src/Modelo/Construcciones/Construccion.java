package Modelo.Construcciones;

import Modelo.Inmueble;

public class Construccion extends Inmueble {

    boolean estado;
    public Construccion(String ubicacion, int metrosCuadrados, boolean estado) {
        super(ubicacion, metrosCuadrados);
        this.estado = estado;

    }


}
