package modelo;

import comportamientos.alimentacion.AlimentoBalanceado;
import comportamientos.desplazamiento.Caminar;
import comportamientos.sonido.SinSonido;
import interfaz.ComportamientoDeAlimentacion;
import interfaz.ComportamientoDeDesplazamiento;
import interfaz.ComportamientoDeSonido;

public abstract class Animal {
    protected ComportamientoDeSonido sonido;
    protected ComportamientoDeAlimentacion alimentacion;
    protected ComportamientoDeDesplazamiento desplazamiento;
    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
        this.sonido = new SinSonido();
        this.alimentacion = new AlimentoBalanceado();
        this.desplazamiento = new Caminar();
    }

    public void realizarSonido() {
        System.out.print(nombre + ": ");
        sonido.hacerSonido();
    }

    public void comer() {
        System.out.print(nombre + " está... ");
        alimentacion.alimentarse();
    }

    public void desplazar() {
        System.out.print(nombre + " está... ");
        desplazamiento.desplazarse();
    }

    public void setSonido(ComportamientoDeSonido sonido) {
        this.sonido = sonido;
    }

    public void setAlimentacion(ComportamientoDeAlimentacion alimentacion) {
        this.alimentacion = alimentacion;
    }

    public void setDesplazamiento(ComportamientoDeDesplazamiento desplazamiento) {
        this.desplazamiento = desplazamiento;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract void describir();
}
