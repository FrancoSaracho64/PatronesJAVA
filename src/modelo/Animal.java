package modelo;

import interfaz.ComportamientoDeAlimentacion;
import interfaz.ComportamientoDeDesplazamiento;
import interfaz.ComportamientoDeSonido;

public abstract class Animal {
    protected ComportamientoDeSonido comportamientoSonidoAnimal;
    protected ComportamientoDeAlimentacion comportamientoDeAlimentacion;
    protected ComportamientoDeDesplazamiento comportamientoDeDesplazamiento;

    public Animal(){
    }

    public void realizarSonido() {
        comportamientoSonidoAnimal.emitirSonido();
    }

    public void comer(){
        comportamientoDeAlimentacion.alimentarse();
    }

    public void desplazar(){
        comportamientoDeDesplazamiento.desplazarse();
    }

    public void setComportamientoDeSonido(ComportamientoDeSonido cs) {
        this.comportamientoSonidoAnimal = cs;
    }

    public abstract void describir();
}
