package comportamientos.sonido;

import interfaz.ComportamientoDeSonido;

public class Oincido implements ComportamientoDeSonido {
    @Override
    public void hacerSonido() {
        System.out.println("Oink oink!");
    }
}
