package Servicio;

import Modelo.Inmueble;
import Modelo.Interfaz.IAgencia;

import java.util.ArrayList;

public class AgenciaInmobiliaria implements IAgencia {

    @Override
    public boolean añadeAlquilerInmueble(Inmueble inmbueble) {
        return false;
    }

    @Override
    public ArrayList<Inmueble> inmueblesVenta(Float precio) {
        return null;
    }

    @Override
    public ArrayList<Inmueble> SegundaMano(Float superficie) {
        return null;
    }

    @Override
    public int solaresRusticos() {
        return 0;
    }

    @Override
    public IAgencia fusion(IAgencia agencia) {
        return null;
    }


}
