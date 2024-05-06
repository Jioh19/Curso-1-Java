package vehiculo;

public class Avion extends Vehiculo{

    public Avion(int pasajeros, double velocidad, double carga) {
        super(pasajeros, velocidad, carga);
    }

    @Override
    public void avanzar() {
        System.out.println("El avion vuela vrooom!");
    }
}
