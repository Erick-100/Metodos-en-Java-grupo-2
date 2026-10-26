// Ejercicio 6: Retorno directo y validaciones lógicas
public class CajaRegistradora {

    public double calcularSubtotal(double precio, int cantidad) {
        if (cantidad <= 0 || precio < 0) {
            System.out.println("Error: Datos de compra inválidos");
            return 0.0;
        }
        return precio * cantidad;
    }
}
