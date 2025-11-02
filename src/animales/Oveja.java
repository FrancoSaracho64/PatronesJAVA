package animales;

import modelo.Animal;
import comportamientos.alimentacion.Pastar;
import comportamientos.desplazamiento.Caminar;
import comportamientos.sonido.Balido;

public class Oveja extends Animal {
    public Oveja(String nombre) {
        super(nombre);
        setSonido(new Balido());
        setAlimentacion(new Pastar());
        setDesplazamiento(new Caminar());
    }
    @Override
    public void describir() {
        System.out.println("Soy " + getNombre() + ", una oveja que pasta tranquila en el campo.");
    }
}

