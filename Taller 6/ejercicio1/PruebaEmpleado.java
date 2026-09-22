package ejercicio1;

public class PruebaEmpleado {

    public static void main(String[] args) {
        Gerente gerente = new Gerente("Ana Gomez", 4500.0, "Tecnología");

        // Llama al método sobrescrito en Gerente
        gerente.mostrarInformacion();
    }
}
