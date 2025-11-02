package comportamientos.sonido;

import interfaz.ComportamientoDeSonido;

public class Maullido implements ComportamientoDeSonido {

    @Override
    public void emitirSonido() {
        System.out.println("Miau, miau... gggggrrrrr");    
    }
}
