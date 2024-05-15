package model;

import java.time.LocalDateTime;

public class Transferencia {
    private Cliente clienteOrigen;
    private Cliente clienteDestino;
    private Cuenta cuentaOrigen;
    private Cuenta cuentaDestino;
    private LocalDateTime fecha;

    public Transferencia(Cliente clienteOrigen, Cliente clienteDestino, Cuenta cuentaOrigen, Cuenta cuentaDestino) {
        this.clienteOrigen = clienteOrigen;
        this.clienteDestino = clienteDestino;
        this.cuentaOrigen = cuentaOrigen;
        this.cuentaDestino = cuentaDestino;
        this.fecha = LocalDateTime.now();
    }
}
