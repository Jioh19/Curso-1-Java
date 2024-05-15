package servicio;

import modelo.Cuenta;

public interface ServicioCuenta {
    public boolean checkDeposito(Cuenta cuenta, double monto);
    public boolean checkRetiro(Cuenta cuenta, double monto);
    public void deposito(Cuenta cuenta, double monto);
    public void retiro(Cuenta cuenta, double monto);

}
