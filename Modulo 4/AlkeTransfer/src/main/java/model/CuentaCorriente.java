package model;

import java.util.Random;

public class CuentaCorriente extends Cuenta{

    public CuentaCorriente() {
        this.setId("CL" + Integer.toString(new Random().nextInt(10000000)+1000000));
    }


}
