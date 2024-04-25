package Alkewallet;

public class Banco {
    public static void main(String[] args) {
        Persona persona = new Persona("Juan", "15335679-3");
        Cuenta cuenta = new Cuenta("123456", persona);
        Cuenta cuenta2 = new Cuenta("456789", persona);
        persona.addCuenta(cuenta);
        persona.addCuenta(cuenta2);

        System.out.println(persona);
    }
}
