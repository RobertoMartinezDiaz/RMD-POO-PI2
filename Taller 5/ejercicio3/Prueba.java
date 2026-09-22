package ejercicio3;

public class Prueba {
    public static void main(String[] args) {
        Persona p = new Persona("Carlos", 25);

        // 1. Verificación del atributo de paquete 'edad'
        // ACCESO PERMITIDO: Al estar en el mismo paquete, se puede leer y modificar directamente.
        p.edad = 26;
        System.out.println("Edad: " + p.edad);

        // 2. Verificación del atributo privado 'nombre'
        // ERROR DE COMPILACIÓN si intentas hacer: p.nombre = "Juan";
        // ACCESO PERMITIDO a través de sus métodos get y set:
        p.setNombre("Juan");
        System.out.println("Nombre: " + p.getNombre());
    }
}
