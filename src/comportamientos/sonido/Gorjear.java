package comportamientos.sonido;

import interfaz.ComportamientoDeSonido;

public class Gorjear implements ComportamientoDeSonido {
    @Override
    public void hacerSonido() {
        System.out.println("Pío pío!");
    }
}
