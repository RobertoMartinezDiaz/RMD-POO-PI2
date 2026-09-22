package ejercicio2.pruebas;
import ejercicio2.vehiculos.Vehiculo;
import ejercicio2.vehiculos.Moto;

public class Prueba {
    public static void main(String[] args) {
        //Vehiculo v = new Vehiculo("Terrestre");

        // ERROR DE COMPILACIÓN: 'tipo' no es público en Vehiculo;
        // no se puede acceder desde fuera del paquete 'vehiculos'.
        // System.out.println(v.tipo);
    }
}
