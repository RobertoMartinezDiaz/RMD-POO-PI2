package ejercicio3;

public class CuentaBancaria {

    private double saldo;

    public CuentaBancaria(double saldoInicial) {
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        }
    }

    // No se implementan métodos get y set para el atributo 'saldo'.
    // DISCUSIÓN SOBRE PROTECCIÓN DE DATOS:
    // Al no proporcionar métodos get y set, el atributo 'saldo' queda completamente
    // blindado contra modificaciones externas malintencionadas (inmutabilidad).
    // Sin embargo, ocultar el dato al 100% también impide que la aplicación legítima
    // consulte el saldo o realice depósitos/retiros válidos.
    // Lo ideal en la protección de datos no es "bloquear" el acceso, sino "controlarlo"
    // mediante getters de solo lectura o métodos de negocio seguros (ej. retirar(), depositar()).
}

