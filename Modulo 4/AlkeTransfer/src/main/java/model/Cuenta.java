package model;

public abstract class Cuenta {

    private String id;
    private double saldo;

    public Cuenta() {
        this.saldo = 0;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getId() {
        return id;
    }

    protected void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "id='" + id + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
