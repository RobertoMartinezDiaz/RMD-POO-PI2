package ejercicio3;

public class BancoSeguro {
    private double saldo;

    public BancoSeguro(double saldoInicial) {
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            this.saldo = 0;
        }
    }

    // Permite consultar el saldo de forma controlada (Solo lectura)
    public double getSaldo() {
        return this.saldo;
    }

    // Método con validación de depósito
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            this.saldo += cantidad;
            System.out.println("Depósito exitoso. Nuevo saldo: " + this.saldo);
        } else {
            System.out.println("Error: El monto a depositar debe ser positivo.");
        }
    }

    // Método con validación de retiro y fondos disponibles
    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= this.saldo) {
            this.saldo -= cantidad;
            System.out.println("Retiro exitoso. Nuevo saldo: " + this.saldo);
        } else {
            System.out.println("Error: Fondos insuficientes o monto inválido.");
        }
    }

    /*
     * DISCUSIÓN DE MEJORA (Atributo private):
     *
     * ¿Cómo mejora esta implementación?
     * 1. Cambiar el atributo a 'private' garantiza el ocultamiento total de los datos. Ninguna
     *    clase externa (ni del mismo paquete ni subclases) puede modificar el saldo directamente.
     * 2. Se obliga a usar métodos específicos ('depositar' y 'retirar') que actúan como filtros
     *    de seguridad, aplicando reglas de negocio estrictas antes de alterar el estado.
     */
}

