package Model;

public class Cuenta {
    private int numero;
    private double saldo;

    public Cuenta(int numero) {
        this.numero = numero;
        this.saldo = 0;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "numero=" + numero +
                ", saldo=" + saldo +
                '}';
    }

    public boolean depositar(double monto) {
        saldo += monto;
        return true;
    }

    public boolean retiro(double monto) {
        if(saldo < monto) {
            System.out.println("Fondos insuficientes");
            return false;
        }
        saldo -= monto;
        return true;
    }
}
