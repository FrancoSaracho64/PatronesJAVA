package comportamientos.alimentacion;

import interfaz.ComportamientoDeAlimentacion;

public class ComerVegetales implements ComportamientoDeAlimentacion {
    @Override
    public void alimentarse() {
        System.out.println("Comiendo vegetales y hojas verdes");
    }
}