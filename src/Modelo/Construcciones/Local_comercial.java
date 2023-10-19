package Modelo.Construcciones;

public class Local_comercial extends Construccion{

    double precioPorMetroCuadrado;

    public Local_comercial(String ubicacion, int metrosCuadrados,boolean estado, double precioPorMetroCuadrado) {
        super(ubicacion, metrosCuadrados, estado);

        this.precioPorMetroCuadrado = precioPorMetroCuadrado;
    }
}
