package animales;

import modelo.Animal;
import comportamientos.alimentacion.Pastar;
import comportamientos.desplazamiento.Caminar;
import comportamientos.sonido.Mugido;

public class Vaca extends Animal {
    public Vaca(String nombre) {
        super(nombre);
        setSonido(new Mugido());
        setAlimentacion(new Pastar());
        setDesplazamiento(new Caminar());
    }
    @Override
    public void describir() {
        System.out.println("Soy " + getNombre() + ", una vaca que disfruta del pasto fresco.");
    }
}

