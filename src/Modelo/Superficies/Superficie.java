package Modelo.Superficies;

import Modelo.Inmueble;

public class Superficie extends Inmueble {

    double precioPorMetroCuadrado;

    public Superficie(String ubicacion, int metrosCuadrados, double precioPorMetroCuadrado) {
        super(ubicacion, metrosCuadrados);
        this.precioPorMetroCuadrado = precioPorMetroCuadrado;
    }
}
