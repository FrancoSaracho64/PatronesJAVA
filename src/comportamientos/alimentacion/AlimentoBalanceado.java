package comportamientos.alimentacion;

import interfaz.ComportamientoDeAlimentacion;

public class AlimentoBalanceado implements ComportamientoDeAlimentacion {
    @Override
    public void alimentarse() {
        System.out.println("Comiendo alimento balanceado");
    }
}
