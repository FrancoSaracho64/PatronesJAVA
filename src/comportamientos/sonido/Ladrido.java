package comportamientos.sonido;

import interfaz.ComportamientoDeSonido;

public class Ladrido implements ComportamientoDeSonido {

    @Override
    public void emitirSonido() {
        System.out.println("¡Guau! ¡Guau!");
    }
}