import animales.Caballo;
import animales.Perro;
import comportamientos.alimentacion.AlimentoBalanceado;
import comportamientos.desplazamiento.Caminar;
import comportamientos.desplazamiento.Saltar;
import comportamientos.sonido.SinSonido;
import modelo.Animal;

public class App {

    public static void main(String[] args) {
        Animal miPerro = new Perro("Rodolfo");
        miPerro.describir();
        miPerro.realizarSonido();
        miPerro.desplazar();
        miPerro.comer();
        System.out.println();

        Animal caballo = new Caballo("Spirit");
        caballo.describir();
        caballo.realizarSonido();
        caballo.desplazar();
        caballo.comer();
        System.out.println();

        System.out.println("El perro se quedó mudo y está saltando. Se cambia su comportamiento.");
        miPerro.setSonido(new SinSonido());
        miPerro.setDesplazamiento(new Saltar());
        miPerro.realizarSonido();
        miPerro.desplazar();
        System.out.println();

        System.out.println("El caballo ahora se alimenta con alimento balanceado y está caminando. Se cambia su comportamiento.");
        caballo.setDesplazamiento(new Caminar());
        caballo.setAlimentacion(new AlimentoBalanceado());
        caballo.desplazar();
        caballo.comer();
        System.out.println();

        System.out.println("--- Fin de la prueba ---");
    }
}
