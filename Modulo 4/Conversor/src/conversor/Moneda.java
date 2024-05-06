package conversor;

public class Moneda {
    private String name;
    private double conversion;
    private String code;

    public Moneda(String name, double conversion, String code) {
        this.name = name;
        this.conversion = conversion;
        this.code = code;
    }

    public double getConversion() {
        return conversion;
    }

    public void setConversion(double conversion) {
        this.conversion = conversion;
    }

    public String getCode() {
        return code;
    }

    @Override
    public String toString() {
        return "Moneda{" +
                "name='" + name + '\'' +
                ", conversion=" + conversion +
                ", code='" + code + '\'' +
                '}';
    }


}
