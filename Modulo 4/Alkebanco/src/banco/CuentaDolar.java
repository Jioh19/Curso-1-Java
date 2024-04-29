package banco;

public class CuentaDolar extends Cuenta implements Conversor{
    private double maxDeposito;
    private double depositoActual;

    public CuentaDolar() {
        this.maxDeposito = 20000;
    }

    /**
     * 
     * @param deposito
     * @return
     */
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
        if(saldo < retiro*1.02) {
            return false;
        } else {
            saldo -= retiro*1.02;
            return true;
        }
    }

    @Override
    public double conversorPeso(double monto) {
        return monto*950;
    }
}
