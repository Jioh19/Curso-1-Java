package Alkewallet;

public class Cuenta {
    private String numero;
    private double saldo;
    private Persona persona;

    public Cuenta(String numero, Persona persona) {
        this.numero = numero;
        this.persona = persona;
        this.saldo = 0;
    }

    @Override
    public String toString() {
        return "\nCuenta{" +
                "numero='" + numero + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
