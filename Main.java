// Ejercicio 8: Instanciación e invocación en el Main
public class Main {
    public static void main(String[] args) {
        // a. Instanciar el objeto
        Producto p = new Producto();

        // b. Asignar stock y precio unitario
        p.stock = 10;
        p.precioUnitario = 25.5;

        // c. Llamar al método, guardar el resultado e imprimirlo
        double totalInventario = p.calcularValorTotal();
        System.out.println("Total del inventario: " + totalInventario);
    }
}

// Clase de apoyo (el enunciado no la incluye)
class Producto {
    int stock;
    double precioUnitario;

    public double calcularValorTotal() {
        return stock * precioUnitario;
    }
}
