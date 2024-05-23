package org.example.service;

import org.example.model.Cuenta;

import java.util.Scanner;


public class ServiceCuenta {

    public static boolean depositar(Cuenta cuenta, double monto) {
        if (monto > 0) {
            cuenta.setSaldo(cuenta.getSaldo() + monto);
            return true;
        } else {
            return false;
        }
    }

    public static boolean retirar(Cuenta cuenta, double monto) {
        if (cuenta.getSaldo() >= monto) {
            cuenta.setSaldo(cuenta.getSaldo() - monto);
            return true;
        } else {
            System.out.println("Fondos insuficientes.");
            return false;
        }
    }
}