package Modelo;

public abstract class Inmueble {

    String ubicacion;

    Integer metrosCuadrados;

    public Inmueble(String ubicacion, Integer metrosCuadrados){
        this.ubicacion = ubicacion;
        this.metrosCuadrados = metrosCuadrados;
    }
}
