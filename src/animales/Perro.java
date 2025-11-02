package animales;

import comportamientos.sonido.Ladrido;
import modelo.Animal;

public class Perro extends Animal {
    public Perro(){
        super();
        this.setComportamientoDeSonido(new Ladrido());
    }

    @Override
    public void describir() {
        System.out.println("Soy un perro.");
    }
}
