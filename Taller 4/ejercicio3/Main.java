package ejercicio3;

public class Main {
    public static void main(String[] args) {

        CuentaBancaria cuenta = new CuentaBancaria(1000.0);

        /*
        // [Punto 1] Intento de acceso directo desde otra clase:
        System.out.println(cuenta.saldo);
        cuenta.saldo = 5000.0;
        */

        // OBSERVACIÓN DEL ERROR DE COMPILACIÓN:
        // Al quitar los comentarios de las líneas de arriba, el compilador de Java
        // detiene el proceso inmediatamente y arroja el siguiente error en la terminal:
        // -> "error: saldo has private access in CuentaBancaria"
        // Esto demuestra que 'private' cumple su función de aislar por completo la propiedad.

        System.out.println("Ejercicio 3: Errores documentados y discusión teórica añadida con éxito.");
    }
}
