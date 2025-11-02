package comportamientos.sonido;

import interfaz.ComportamientoDeSonido;

public class SinSonido implements ComportamientoDeSonido {
    @Override
    public void hacerSonido() {
        System.out.println("... (sin sonido)");
    }
}
