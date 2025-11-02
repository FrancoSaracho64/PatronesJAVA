import animales.Gato;
import animales.Perro;
import animales.Leon;
import animales.Pajaro;
import animales.Serpiente;
import animales.Cerdo;
import animales.Vaca;
import animales.Oveja;
import animales.Caballo;
import animales.Conejo;
import modelo.Animal;

public class App {

    public static void main(String[] args) {
        Animal miPerro = new Perro("Rocky");
        miPerro.describir();
        miPerro.realizarSonido();
        miPerro.desplazar();
        miPerro.comer();

        System.out.println();

        Animal miGato = new Gato("Michi");
        miGato.describir();
        miGato.realizarSonido();
        miGato.desplazar();
        miGato.comer();

        System.out.println();

        Animal leon = new Leon("Simba");
        leon.describir();
        leon.realizarSonido();
        leon.desplazar();
        leon.comer();

        System.out.println();

        Animal pajaro = new Pajaro("Piolín");
        pajaro.describir();
        pajaro.realizarSonido();
        pajaro.desplazar();
        pajaro.comer();

        System.out.println();

        Animal serpiente = new Serpiente("Kaa");
        serpiente.describir();
        serpiente.realizarSonido();
        serpiente.desplazar();
        serpiente.comer();

        System.out.println();

        Animal cerdo = new Cerdo("Porky");
        cerdo.describir();
        cerdo.realizarSonido();
        cerdo.desplazar();
        cerdo.comer();

        System.out.println();

        Animal vaca = new Vaca("Lola");
        vaca.describir();
        vaca.realizarSonido();
        vaca.desplazar();
        vaca.comer();

        System.out.println();

        Animal oveja = new Oveja("Dolly");
        oveja.describir();
        oveja.realizarSonido();
        oveja.desplazar();
        oveja.comer();

        System.out.println();

        Animal caballo = new Caballo("Spirit");
        caballo.describir();
        caballo.realizarSonido();
        caballo.desplazar();
        caballo.comer();

        System.out.println();

        Animal conejo = new Conejo("Bugs");
        conejo.describir();
        conejo.realizarSonido();
        conejo.desplazar();
        conejo.comer();

        System.out.println();

        System.out.println("--- Fin de la prueba ---");
    }
}
