package comportamientos.sonido;

import interfaz.ComportamientoDeSonido;

public class Ladrido implements ComportamientoDeSonido {

    @Override
    public void hacerSonido() {
        System.out.println("¡Guau guau!");
    }
}