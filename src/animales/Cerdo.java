package animales;

import modelo.Animal;
import comportamientos.alimentacion.AlimentoBalanceado;
import comportamientos.desplazamiento.Caminar;
import comportamientos.sonido.Oincido;

public class Cerdo extends Animal {
    public Cerdo(String nombre) {
        super(nombre);
        setSonido(new Oincido());
        setAlimentacion(new AlimentoBalanceado());
        setDesplazamiento(new Caminar());
    }
    @Override
    public void describir() {
        System.out.println("Soy " + getNombre() + ", un cerdo doméstico que disfruta revolcarse en el lodo.");
    }
}

