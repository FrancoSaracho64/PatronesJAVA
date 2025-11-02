package comportamientos.sonido;

import interfaz.ComportamientoDeSonido;

public class GrunidoConejo implements ComportamientoDeSonido {
    @Override
    public void hacerSonido() {
        System.out.println("Grrr...");
    }
}
