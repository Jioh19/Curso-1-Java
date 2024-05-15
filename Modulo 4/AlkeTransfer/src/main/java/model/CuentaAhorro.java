package model;

import java.util.Random;

public class CuentaAhorro extends Cuenta{
    private int retiros = 0;
    private double maxDeposito;
    private double nowDeposito;

    public CuentaAhorro(double maxDeposito) {
        this.setId("CL" + Integer.toString(new Random().nextInt(10000000)+1000000));
        this.maxDeposito = maxDeposito;
        this.nowDeposito = 0;
    }

    public int getRetiros() {
        return retiros;
    }

    public void setRetiros(int retiros) {
        this.retiros = retiros;
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
