package animales;

import modelo.Animal;
import comportamientos.alimentacion.Cazar;
import comportamientos.desplazamiento.Correr;
import comportamientos.sonido.Rugido;

public class Leon extends Animal {
    public Leon(String nombre) {
        super(nombre);
        setSonido(new Rugido());
        setAlimentacion(new Cazar());
        setDesplazamiento(new Correr());
    }
    @Override
    public void describir() {
        System.out.println("Soy " + getNombre() + ", el rey de la selva. Soy un animal salvaje y poderoso.");
    }
}

