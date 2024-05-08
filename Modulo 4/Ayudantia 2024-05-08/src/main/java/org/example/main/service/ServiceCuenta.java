package org.example.main.service;

import org.example.main.model.Cuenta;

public class ServiceCuenta {


    public boolean depositar(Cuenta cuenta, double monto) {
        cuenta.setSaldo(cuenta.getSaldo() + monto);
        return true;
    }

    public boolean retiro(Cuenta cuenta, double monto) {
        if(cuenta.getSaldo() < monto) {
            System.out.println("Fondos insuficientes");
            return false;
        }
        cuenta.setSaldo(cuenta.getSaldo() - monto);
        return true;
    }
}
