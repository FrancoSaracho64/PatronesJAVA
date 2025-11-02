package comportamientos.desplazamiento;

import interfaz.ComportamientoDeDesplazamiento;

public class Volar implements ComportamientoDeDesplazamiento {
    @Override
    public void desplazarse() {
        System.out.println("Volando por los aires...");
    }
}
