import animales.Gato;
import animales.Perro;
import modelo.Animal;

public class App {

    public static void main(String[] args) {
        Animal miPerro = new Perro();
        miPerro.describir();
        miPerro.realizarSonido();
        System.out.println();
        Animal miGato = new Gato();
        miGato.describir();
        miGato.realizarSonido();
        System.out.println("--- Fin de la prueba ---");
    }
}
