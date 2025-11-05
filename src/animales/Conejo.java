package animales;

import modelo.Animal;
import comportamientos.alimentacion.ComerVegetales;
import comportamientos.desplazamiento.Saltar;
import comportamientos.sonido.GrunidoConejo;

public class Conejo extends Animal {
    public Conejo(String nombre) {
        super(nombre);
        setSonido(new GrunidoConejo());
        setAlimentacion(new ComerVegetales());
        setDesplazamiento(new Saltar());
    }
    @Override
    public void describir() {
        System.out.println("Soy un conejo.");
    }
}

