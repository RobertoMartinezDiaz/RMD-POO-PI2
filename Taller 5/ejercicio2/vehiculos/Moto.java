package ejercicio2.vehiculos;

public class Moto extends Vehiculo {
    private int cilindrada;

    public Moto(String tipo, int cilindrada) {
        super(tipo);
        this.cilindrada = cilindrada;
    }

    public void mostrarInfo() {

        System.out.println("Tipo: " + tipo + ", Cilindrada: " + cilindrada);
    }
}
