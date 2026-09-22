package ejercicio3;

public class BancoInseguro {
    protected double saldo;

    public BancoInseguro(double saldoInicial) {
        this.saldo = saldoInicial;
    }
    /*
     * DISCUSIÓN DE SEGURIDAD (Atributo protected):
     *
     * ¿Por qué esta implementación NO es segura?
     * 1. El modificador 'protected' permite que cualquier otra clase dentro del mismo
     *    paquete ('ejercicio3') tenga acceso directo de lectura y escritura a este atributo.
     * 2. Rompe el principio de encapsulamiento: un componente externo malicioso o erróneo
     *    podría asignar valores ilógicos (ej. saldo negativo o inflado) sin control alguno.
     * 3. No permite auditar ni validar los cambios en los datos críticos del objeto.
     */

}

