package vehiculo;

public abstract class Vehiculo {
    private int pasajeros;
    private double velocidad;
    private double carga;

    public Vehiculo(int pasajeros, double velocidad, double carga) {
        this.pasajeros = pasajeros;
        this.velocidad = velocidad;
        this.carga = carga;
    }

    public abstract void avanzar();


    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "pasajeros=" + pasajeros +
                ", velocidad=" + velocidad +
                ", carga=" + carga +
                '}';
    }
}
