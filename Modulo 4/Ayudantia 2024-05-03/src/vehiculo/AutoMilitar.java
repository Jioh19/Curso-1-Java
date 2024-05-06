package vehiculo;

public class AutoMilitar extends Automovil implements Disparar{
    public AutoMilitar(int pasajeros, double velocidad, double carga) {
        super(pasajeros, velocidad, carga);
    }

    @Override
    public void disparo() {
        System.out.println("El autito que dispara boom boom!");

    }
}
