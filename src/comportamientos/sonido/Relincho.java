package comportamientos.sonido;

import interfaz.ComportamientoDeSonido;

public class Relincho implements ComportamientoDeSonido {
    @Override
    public void hacerSonido() {
        System.out.println("Hiiiiii! Brrrrfff");
    }
}
