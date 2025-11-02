package comportamientos.alimentacion;

import interfaz.ComportamientoDeAlimentacion;

public class ComerSemillas implements ComportamientoDeAlimentacion {
    @Override
    public void alimentarse() {
        System.out.println("Picoteando semillas del suelo");
    }
}
