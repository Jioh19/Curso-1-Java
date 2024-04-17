public class Test {
    public static void main(String[] args) {

        Persona persona1 = new Persona("Juan", "Oh", 42);
        Persona copiaPersona1 = persona1;

        persona1.edad = 12;
        persona1.nombre = "Pedro";
        copiaPersona1.apellido = "Salazar";
        System.out.println(persona1);
        System.out.println(copiaPersona1);
    }
}
