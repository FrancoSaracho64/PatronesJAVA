package comportamientos.desplazamiento;

import interfaz.ComportamientoDeDesplazamiento;

public class Caminar implements ComportamientoDeDesplazamiento {
    @Override
    public void desplazarse() {
        System.out.println("Caminando lentamente...");
    }
}
