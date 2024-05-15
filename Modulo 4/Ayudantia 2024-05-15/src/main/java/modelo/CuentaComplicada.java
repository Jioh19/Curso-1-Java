package modelo;

import java.util.Random;

public class CuentaComplicada extends Cuenta{
    private int maxRetiro;
    private int nowRetiro;
    private double maxDeposito;
    private double nowDeposito;

    public CuentaComplicada(int maxRetiro, double maxDeposito) {
        this.setId("CC" + String.valueOf(new Random().nextInt(10000000) + 1000000));
        this.maxRetiro = maxRetiro;
        this.maxDeposito = maxDeposito;
        this.nowRetiro = 0;
        this.nowDeposito = 0;
    }

    public int getMaxRetiro() {
        return maxRetiro;
    }

    public void setMaxRetiro(int maxRetiro) {
        this.maxRetiro = maxRetiro;
    }

    public int getNowRetiro() {
        return nowRetiro;
    }

    public void setNowRetiro(int nowRetiro) {
        this.nowRetiro = nowRetiro;
    }

    public double getMaxDeposito() {
        return maxDeposito;
    }

    public void setMaxDeposito(double maxDeposito) {
        this.maxDeposito = maxDeposito;
    }

    public double getNowDeposito() {
        return nowDeposito;
    }

    public void setNowDeposito(double nowDeposito) {
        this.nowDeposito = nowDeposito;
    }
}
