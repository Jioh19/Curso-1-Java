package sort;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    public static void main(String[] args) {
        List<Container> lista = new ArrayList<>();

        lista.add(new Container(5));
        lista.add(new Container(100));
        lista.add(new Container(-99));
        lista.add(new Container(50));
        lista.add(new Container(-10000));
        System.out.println(lista);

        lista.sort(null);

        System.out.println(lista);
    }


}
