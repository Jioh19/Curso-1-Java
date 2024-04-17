import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ListaArreglo {
    public static void main(String[] args) {
        // Palabra clave new. Invoca el constructor de la clase para
        // instanciar una clase y crearla para ser asignada.
        ArrayList<Integer> arrayList = new ArrayList<>();


        for(int i = 0; i < 10; i++) {
            //arrayList.add((int)(Math.random() * 1000));
            arrayList.add(new Random().nextInt(1000));
        }
        arrayList.sort((a , b) -> {return b - a;});
        System.out.println(arrayList.toString());

    }
}
