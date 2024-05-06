package vehiculo;

public class Automovil extends Vehiculo{
    private double odometro;

    public Automovil(int pasajeros, double velocidad, double carga) {
        super(pasajeros, velocidad, carga);
        odometro = 0;
    }

    @Override
    public void avanzar() {
        System.out.println("El automovil esta avanzando beep beep!");
    }

    public double getOdometro() {
        return odometro;
    }

    public void setOdometro(double odometro) {
        this.odometro = odometro;
    }
}
