package animales;

import modelo.Animal;
import comportamientos.alimentacion.AlimentoBalanceado;
import comportamientos.desplazamiento.Caminar;
import comportamientos.sonido.Ladrido;

public class Perro extends Animal {
    public Perro(String nombre) {
        super(nombre);
        setSonido(new Ladrido());
        setAlimentacion(new AlimentoBalanceado());
        setDesplazamiento(new Caminar());
    }

    @Override
    public void describir() {
        System.out.println("Soy " + getNombre() + ", un perro fiel y amigable. ¡Guau!");
    }

    public void moverLaCola() {
        System.out.println(getNombre() + " está moviendo la cola felizmente!");
    }
}

