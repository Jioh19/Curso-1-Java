package service;

import model.Cuenta;

public class ServiceCuentaCorriente implements ServiceCuenta{
    @Override
    public boolean checkDeposito(Cuenta cuenta, double monto) {
        return true;
    }

    @Override
    public boolean checkRetiro(Cuenta cuenta, double monto) {
        return cuenta.getSaldo() >= monto;
    }

    @Override
    public void deposito(Cuenta cuenta, double monto) {
        cuenta.setSaldo(cuenta.getSaldo() + monto);
    }

    @Override
    public void retiro(Cuenta cuenta, double monto) {
        cuenta.setSaldo(cuenta.getSaldo() - monto);
    }
}
