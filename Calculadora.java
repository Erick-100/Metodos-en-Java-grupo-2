// Ejercicio 5: Validación de entrada en la clase Calculadora
public class Calculadora {

    public double calcularRaizCuadrada(double valor) {
        if (valor < 0) {
            System.out.println("Error: No se puede calcular raíz de números negativos");
            return 0.0;
        }
        return Math.sqrt(valor);
    }
}
