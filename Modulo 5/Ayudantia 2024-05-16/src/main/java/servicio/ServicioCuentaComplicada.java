package servicio;

import modelo.Cuenta;
import modelo.CuentaComplicada;

public class ServicioCuentaComplicada implements ServicioCuenta {
    @Override
    public boolean checkDeposito(Cuenta cuenta, double monto) {
        if (cuenta == null) {
            throw new NullPointerException("Verificar cuenta");
        }
        if (cuenta instanceof CuentaComplicada) {
            return ((CuentaComplicada) cuenta).getMaxDeposito() >
                    (((CuentaComplicada) cuenta).getNowDeposito()) + monto;
        }
        return false;
    }

    @Override
    public boolean checkRetiro(Cuenta cuenta, double monto) {
        if (cuenta == null) {
            throw new NullPointerException("Verificar cuenta");
        }
        if (cuenta instanceof CuentaComplicada) {
            return ((CuentaComplicada) cuenta).getMaxRetiro() >=
                    (((CuentaComplicada) cuenta).getNowRetiro() + 1);
        }
        return false;
    }

    @Override
    public void deposito(Cuenta cuenta, double monto) {
        if (cuenta == null) {
            throw new NullPointerException("Verificar cuenta");
        }

        if (cuenta instanceof CuentaComplicada) {
            cuenta.setMonto(cuenta.getMonto() + monto);
            ((CuentaComplicada) cuenta).setNowDeposito(
                    ((CuentaComplicada) cuenta).getNowDeposito() + monto);
        }
    }


    @Override
    public void retiro(Cuenta cuenta, double monto) {
        if (cuenta == null) {
            throw new NullPointerException("Verificar cuenta");
        }
        if (cuenta instanceof CuentaComplicada) {
            cuenta.setMonto(cuenta.getMonto() - monto);
            ((CuentaComplicada) cuenta).setNowRetiro(
                    ((CuentaComplicada) cuenta).getNowRetiro() +1);
        }
    }
}
