package animales;

import modelo.Animal;
import comportamientos.alimentacion.ComerSemillas;
import comportamientos.desplazamiento.Volar;
import comportamientos.sonido.Gorjear;

public class Pajaro extends Animal {
    public Pajaro(String nombre) {
        super(nombre);
        setSonido(new Gorjear());
        setAlimentacion(new ComerSemillas());
        setDesplazamiento(new Volar());
    }
    @Override
    public void describir() {
        System.out.println("Soy " + getNombre() + ", un pájaro que vuela libremente por el cielo.");
    }
}

