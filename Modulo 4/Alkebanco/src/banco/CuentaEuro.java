package banco;

public class CuentaEuro extends Cuenta implements Conversor{
    private double maxDeposito;
    private double depositoActual;

    public CuentaEuro() {
        this.maxDeposito = 20000;
    }

    @Override
    public boolean depositar(double deposito) {
        if(maxDeposito < depositoActual + deposito) {
            return false;
        } else {
            saldo += deposito;
            depositoActual += deposito;
            return true;
        }
    }

    @Override
    public boolean retirar(double retiro) {
        if(saldo < retiro*1.03) {
            return false;
        } else {
            saldo -= retiro*1.03;
            return true;
        }
    }

    @Override
    public double conversorPeso(double monto) {
        return monto*1050;
    }
}
