package comportamientos.sonido;

import interfaz.ComportamientoDeSonido;

public class Rugido implements ComportamientoDeSonido {
    @Override
    public void hacerSonido() {
        System.out.println("¡GRRRRROOOOAR!");
    }
}
