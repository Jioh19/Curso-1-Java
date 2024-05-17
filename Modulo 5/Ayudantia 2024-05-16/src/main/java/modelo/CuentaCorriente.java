package modelo;

import java.util.Random;

public class CuentaCorriente extends Cuenta{
    public CuentaCorriente() {
        this.setId("CL" + String.valueOf(new Random().nextInt(10000000) + 1000000));
    }


}
