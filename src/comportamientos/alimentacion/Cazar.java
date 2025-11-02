package comportamientos.alimentacion;

import interfaz.ComportamientoDeAlimentacion;

public class Cazar implements ComportamientoDeAlimentacion {
    @Override
    public void alimentarse() {
        System.out.println("Iniciando cacería... ¡Caza exitosa!");
    }
}
