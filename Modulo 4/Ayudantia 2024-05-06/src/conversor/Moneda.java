package conversor;

public class Moneda {

    private String nombre;
    private double tasa;
    private String code;

    public Moneda(String nombre, double tasa, String code) {
        this.nombre = nombre;
        this.tasa = tasa;
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public double getTasa() {
        return tasa;
    }

    @Override
    public String toString() {
        return "Moneda{" +
                "nombre='" + nombre + '\'' +
                ", tasa=" + tasa +
                ", code='" + code + '\'' +
                '}';
    }
}
