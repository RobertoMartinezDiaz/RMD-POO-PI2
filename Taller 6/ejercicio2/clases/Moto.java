package ejercicio2.clases;

public class Moto extends  Vehiculo{
    private int cilindrada;

    public Moto(String tipo, String marca, int cilindrada) {
        super(tipo, marca); // Invoca al constructor del padre
        this.cilindrada = cilindrada;
    }

    public void mostrarDetalles() {
        // ACCESO PERMITIDO: Moto puede acceder a tipo y marca porque es una subclase
        System.out.println("Tipo: " + tipo + ", Marca: " + marca + ", Cilindrada: " + cilindrada);
    }
}
