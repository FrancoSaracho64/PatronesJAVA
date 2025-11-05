package animales;

import modelo.Animal;
import comportamientos.alimentacion.AlimentoBalanceado;
import comportamientos.desplazamiento.Caminar;
import comportamientos.sonido.Maullido;

public class Gato extends Animal {
    public Gato(String nombre) {
        super(nombre);
        setSonido(new Maullido());
        setAlimentacion(new AlimentoBalanceado());
        setDesplazamiento(new Caminar());
    }

    @Override
    public void describir() {
        System.out.println("Soy un lindo gatito.");
    }
}

