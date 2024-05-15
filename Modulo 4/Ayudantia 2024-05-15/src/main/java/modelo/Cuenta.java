package modelo;

public abstract class Cuenta {
    private String id;
    private double monto;

    public Cuenta() {
        this.monto = 0;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    @Override
    public String toString() {
        return "\nCuenta{" +
                "id='" + id + '\'' +
                ", monto=" + monto +
                '}';
    }
}
