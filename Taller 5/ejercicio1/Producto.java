package ejercicio1;

public class Producto {

    String nombre;
    double precio;
    int stock;

    Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;

    }

    void mostrarInfo(){
        System.out.println("Nombre: " +  nombre + ", Precio: " + precio + ", Stock: " + stock);
    }
}
