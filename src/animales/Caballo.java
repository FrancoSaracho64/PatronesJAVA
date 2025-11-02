package animales;

import modelo.Animal;
import comportamientos.alimentacion.Pastar;
import comportamientos.desplazamiento.Correr;
import comportamientos.sonido.Relincho;

public class Caballo extends Animal {
    public Caballo(String nombre) {
        super(nombre);
        setSonido(new Relincho());
        setAlimentacion(new Pastar());
        setDesplazamiento(new Correr());
    }
    @Override
    public void describir() {
        System.out.println("Soy " + getNombre() + ", un caballo veloz y elegante.");
    }
}

