package animales;

import modelo.Animal;
import comportamientos.alimentacion.Cazar;
import comportamientos.desplazamiento.Arrastrarse;
import comportamientos.sonido.Siseo;

public class Serpiente extends Animal {
    public Serpiente(String nombre) {
        super(nombre);
        setSonido(new Siseo());
        setAlimentacion(new Cazar());
        setDesplazamiento(new Arrastrarse());
    }
    @Override
    public void describir() {
        System.out.println("Soy " + getNombre() + ", una serpiente que se desliza silenciosamente.");
    }
}

