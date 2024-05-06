package vehiculo;

public class AvionMilitar extends Avion implements Disparar{
    public AvionMilitar(int pasajeros, double velocidad, double carga) {
        super(pasajeros, velocidad, carga);
    }

    @Override
    public void disparo() {
        System.out.println("El avion dispara ratatatatat!");
    }

    @Override
    public String toString() {
        return "AvionMilitar{ pasajeros=" + this.getPasajeros() + " velocidad=" + this.getVelocidad() +
                " carga=" + this.getCarga() + "}";
    }
}
