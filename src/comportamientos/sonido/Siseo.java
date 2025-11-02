package comportamientos.sonido;

import interfaz.ComportamientoDeSonido;

public class Siseo implements ComportamientoDeSonido {
    @Override
    public void hacerSonido() {
        System.out.println("Sssssss...");
    }
}
