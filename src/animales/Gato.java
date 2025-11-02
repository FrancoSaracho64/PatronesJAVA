package animales;

import comportamientos.sonido.Maullido;
import modelo.Animal;

public class Gato extends Animal {
    public Gato (){
        super();
        this.setComportamientoDeSonido(new Maullido());
    }

    @Override
    public void describir() {
       System.out.println("Soy un lindo gatito");
    }
}
