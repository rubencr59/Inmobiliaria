package Modelo.Superficies;

public class PlazaGaraje extends Superficie{

    boolean esPrivado;
    public PlazaGaraje(String ubicacion, int metrosCuadrados, double precioPorMetroCuadrado, boolean esPrivado) {
        super(ubicacion, metrosCuadrados, precioPorMetroCuadrado);

        this.esPrivado = esPrivado;
    }
}
