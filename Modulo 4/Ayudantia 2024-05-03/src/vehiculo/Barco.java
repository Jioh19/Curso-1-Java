package vehiculo;

public class Barco extends Vehiculo{

    private int capacidad;
    public Barco(int pasajeros, double velocidad, double carga) {
        super(pasajeros, velocidad, carga);
        capacidad = 0;
    }

    @Override
    public void avanzar() {
        System.out.println("El barco esta navegando boop boop!");
    }

    public Barco(int pasajeros, double velocidad, double carga, int capacidad) {
        super(pasajeros, velocidad, carga);
        this.capacidad = capacidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
}
