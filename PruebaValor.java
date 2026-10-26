// Ejercicio 3: Alcance de variables y paso por valor
public class PruebaValor {

    public void modificarValor(int x) {
        x = x * 2;
        System.out.println("Dentro: " + x);
    }

    public static void main(String[] args) {
        PruebaValor obj = new PruebaValor();
        int x = 15;
        obj.modificarValor(x);
        System.out.println("En main: " + x);
    }
}
