public class Tren {
    public static void main(String[] args) {
        double inicio = System.currentTimeMillis();
//        System.out.println("El area del cuadrado de lado 5 es " + cuadrado(5));
//        System.out.println("El area del rectangulo de lado 5 y alturo 2 es "
//        + rectangulo(5,2));
//        System.out.println("El area del triangulo de base 3 y altura 4 es "
//        + triangulo(3,4));
//        System.out.println("El area del circulo de radio 3 es "
//        + circulo(3));
        double areaTotal = 0;
        areaTotal += cuadrado(1);
        areaTotal += cuadrado(2); // areaTotal = areaTotal + cuadrado(2)
        areaTotal += rectangulo(2, 4);
        areaTotal += triangulo(2, 2);
        areaTotal += 3*circulo(1);
        System.out.println("El area del trencito es: " + areaTotal);
        double termino = System.currentTimeMillis();
        System.out.println("El tiempo total del algoritmo es: "
                + (termino - inicio));
    }

    public static double cuadrado(double lado) {
//        double area = Math.pow(lado, 2);
//        return area;
        return Math.pow(lado, 2);
    }

    public static double rectangulo(double lado, double alto) {
        return lado*alto;
    }

    public static double triangulo(double base, double altura) {
        return base*altura/2;
    }

    public static double circulo(double radio) {
        return Math.PI*Math.pow(radio,2);
    }
}
