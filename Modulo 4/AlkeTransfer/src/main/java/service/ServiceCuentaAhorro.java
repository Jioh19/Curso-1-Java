package service;

import model.Cuenta;
import model.CuentaAhorro;

public class ServiceCuentaAhorro implements ServiceCuenta{

    @Override
    public boolean checkDeposito(Cuenta cuenta, double monto) {

        if(cuenta instanceof CuentaAhorro) {
            return !(((CuentaAhorro) cuenta).getMaxDeposito() < ((CuentaAhorro) cuenta).getNowDeposito() + monto);
        }
        return false;
    }

    @Override
    public boolean checkRetiro(Cuenta cuenta, double monto) {
        return false;
    }

    @Override
    public void deposito(Cuenta cuenta, double monto) {

    }

    @Override
    public void retiro(Cuenta cuenta, double monto) {

    }
}
