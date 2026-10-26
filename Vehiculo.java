// Ejercicio 7: Completar la estructura de una clase (Vehículo)
public class Vehiculo {
    String placa;
    double tarifaDiaria;

    public double calcularAlquiler(int dias) {
        if (dias <= 0) {
            System.out.println("Días inválidos");
            return 0.0;
        }
        return dias * tarifaDiaria;
    }
}
