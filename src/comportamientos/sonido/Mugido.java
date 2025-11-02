package comportamientos.sonido;

import interfaz.ComportamientoDeSonido;

public class Mugido implements ComportamientoDeSonido {
    @Override
    public void hacerSonido() {
        System.out.println("Muuuu!");
    }
}
