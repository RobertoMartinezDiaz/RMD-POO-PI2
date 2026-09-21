package ejercicio2;

public class Coche {
    private String marca;
    private String modelo;
    private  double velocidadMaxima;

    public Coche (String marca, String modelo, double velocidadMaxima){
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getModelo(){
        return modelo;
    }
    public  void setModelo(String modelo){
        this.modelo = modelo;
    }

    public double getVelocidadMaxima(){
        return velocidadMaxima;
    }
    public void setVelocidadMaxima(double velocidadMaxima){
        this.velocidadMaxima = velocidadMaxima;
    }

    public void acelerar(double incremento){
        if (incremento > 0){
            velocidadMaxima += incremento;
        }
    }

}
