package Modelo.Superficies;

public class Solar extends Superficie{

    boolean esRustico;

    public Solar(String ubicacion, int metrosCuadrados, double precioPorMetroCuadrado, boolean esRustico) {
        super(ubicacion, metrosCuadrados, precioPorMetroCuadrado);

        this.esRustico = esRustico;
    }
}
