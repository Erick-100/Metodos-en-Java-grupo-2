// Ejercicio 4: Múltiples parámetros con retorno
public class Empleado {

    public double generarReporteEmpleado(String nombre, int horas, double tarifa, boolean bono) {
        double sueldoBase = horas * tarifa;
        if (bono) {
            sueldoBase += sueldoBase * 0.20; // se suma el 20% de bonificación
        }
        System.out.println("Empleado: " + nombre);
        return sueldoBase;
    }
}
