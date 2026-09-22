package ejercicio2.pruebas;
import ejercicio2.clases.Vehiculo;

public class PruebaVehiculo {
    public static void main(String[] args) {
        Vehiculo miVehiculo = new Vehiculo("Terrestre", "Toyota");

        // ❌ ERRORES DE COMPILACIÓN ESPERADOS:
        // 'tipo' has protected access in 'ejercicio2.vehiculos.Vehiculo'
        // 'marca' has protected access in 'ejercicio2.vehiculos.Vehiculo'

        // System.out.println(miVehiculo.tipo);
        // System.out.println(miVehiculo.marca);
    }
}
