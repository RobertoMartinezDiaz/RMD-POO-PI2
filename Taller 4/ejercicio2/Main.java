package ejercicio2;

public class Main {
    public static void main(String[] args){

        /*
        Coche coche = new Coche("Toyota", "Fortuner", 20.5);

        System.out.println(coche.marca);
        System.out.println(coche.modelo);
        System.out.println(coche.velocidadMaxima);
        */
        // Dado que se intenta acceder directamente a un atributo privado de la clase "Coche"
        // desde la clase "Main", se genera un error de compilación. Esto ocurre porque el modificador
        // 'private' impide el acceso directo desde cualquier clase externa o diferente a la clase origen.


        //Asi quedaria de manera que funcione:

        Coche coche = new Coche("Toyota", "Fortuner", 20.5);
        System.out.println(coche.getMarca());
        System.out.println(coche.getModelo());
        System.out.println(coche.getVelocidadMaxima());

    }
}
