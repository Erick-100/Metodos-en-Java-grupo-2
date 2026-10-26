// Ejercicio 2: Métodos sin retorno (void) y control de flujo
public class ControlAcceso {

    public void evaluarAcceso(String rol, int anios) {
        if (rol.equalsIgnoreCase("Administrador") && anios >= 2) {
            System.out.println("Acceso total concedido");
        } else {
            System.out.println("Acceso restringido");
        }
    }
}
