package billeteraDigital;

public class Usuario {
    // Atributos
    private String usuario;
    private String Cuenta = "123456";
    private float saldo;

    // Getter y Setter
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getCuenta() {
        return Cuenta;
    }

    public void setCuenta(String cuenta) {
        Cuenta = cuenta;
    }

    public Float getSaldo() {
        return saldo;
    }

    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }

    // constructor
    public Usuario(Float saldo) {
        this.saldo = saldo;
    }

    public Usuario(){};

}
