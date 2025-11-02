package comportamientos.alimentacion;

import interfaz.ComportamientoDeAlimentacion;

public class Pastar implements ComportamientoDeAlimentacion {
    @Override
    public void alimentarse() {
        System.out.println("Pastando tranquilamente en el campo");
    }
}
