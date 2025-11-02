package comportamientos.desplazamiento;

import interfaz.ComportamientoDeDesplazamiento;

public class Arrastrarse implements ComportamientoDeDesplazamiento {
    @Override
    public void desplazarse() {
        System.out.println("Deslizándose lentamente por el suelo...");
    }
}
