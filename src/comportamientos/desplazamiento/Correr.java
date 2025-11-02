package comportamientos.desplazamiento;

import interfaz.ComportamientoDeDesplazamiento;

public class Correr implements ComportamientoDeDesplazamiento {
    @Override
    public void desplazarse() {
        System.out.println("Corriendo a gran velocidad...");
    }
}
