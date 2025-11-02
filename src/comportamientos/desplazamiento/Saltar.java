package comportamientos.desplazamiento;

import interfaz.ComportamientoDeDesplazamiento;

public class Saltar implements ComportamientoDeDesplazamiento {
    @Override
    public void desplazarse() {
        System.out.println("Saltando rápidamente...");
    }
}
