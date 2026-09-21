package ejercicio1;

public class Main {
    public static void main(String[] args) {

        /*
        Estudiante p = new Estudiante("Juan", 12, 3.5);
        System.out.println(p.nombre);
        System.out.println(p.edad);
        System.out.println(p.notaPromedio);
        */

        // Dado que se intenta acceder directamente a un atributo privado de la clase "Estudiante"
        // desde la clase "Main", se genera un error de compilación. Esto ocurre porque el modificador
        // 'private' impide el acceso directo desde cualquier clase externa o diferente a la clase origen.


        //Asi deberia quedar para que pueda servir:
        Estudiante p = new Estudiante("Juan", 12, 3.5);

        // CORRECCIÓN: Cambiamos p.nombre por p.getNombre() para que el código pueda compilar y ejecutar

        System.out.println(p.getNombre());
        System.out.println(p.getEdad());
        System.out.println(p.getNotaPromedio());

    }
}
