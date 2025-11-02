package comportamientos.sonido;

import interfaz.ComportamientoDeSonido;

public class Balido implements ComportamientoDeSonido {
    @Override
    public void hacerSonido() {
        System.out.println("Beeee!");
    }
}
