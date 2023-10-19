package Modelo.Construcciones;

public class Vivienda  extends Construccion{

    double precio;

    int num_habitaciones;

    int piso;

    public Vivienda(String ubicacion, int metrosCuadrados,boolean estado, double precio, int num_habitaciones, int piso) {
        super(ubicacion, metrosCuadrados, estado);
        this.precio = precio;
        this.num_habitaciones = num_habitaciones;
        this.piso = piso;
    }
}
