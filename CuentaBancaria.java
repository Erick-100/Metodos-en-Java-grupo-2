// Ejercicio 1: Depuración de errores de firma y retorno
public class CuentaBancaria {

    public double retirarDinero(double saldoActual, double montoRetiro) {
        if (montoRetiro > saldoActual) {
            System.out.println("Fondos insuficientes");
            return saldoActual; // devuelve el saldo sin cambios
        }
        double nuevoSaldo = saldoActual - montoRetiro;
        System.out.println("Retiro exitoso");
        return nuevoSaldo; // devuelve el saldo ya restado
    }
}
