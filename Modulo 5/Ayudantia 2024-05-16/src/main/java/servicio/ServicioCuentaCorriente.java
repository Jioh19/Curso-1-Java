package servicio;

import modelo.Cuenta;



public class ServicioCuentaCorriente implements ServicioCuenta{
    @Override
    public boolean checkDeposito(Cuenta cuenta, double monto) {
        if(cuenta == null) {
            throw new NullPointerException();
        }
        return true;
    }

    @Override
    public boolean checkRetiro(Cuenta cuenta, double monto) {
        if(cuenta == null) {
            throw new NullPointerException();
        }
        return !(cuenta.getMonto() < monto);

    }

    @Override
    public void deposito(Cuenta cuenta, double monto) {
        cuenta.setMonto(cuenta.getMonto() + monto);
    }

    @Override
    public void retiro(Cuenta cuenta, double monto) {
        cuenta.setMonto(cuenta.getMonto() - monto);
    }
}
