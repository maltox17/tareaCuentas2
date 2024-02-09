package cuentas;

/**
 * Clase CCuenta para gestionar las cuentas bancarias.
 * Permite realizar operaciones como consultar el saldo,
 * ingresar dinero y retirar dinero de la cuenta.
 */
public class CCuenta {

    /**
     * Nombre del titular de la cuenta.
     */
    private String nombre;

    /**
     * Número de la cuenta bancaria.
     */
    private String cuenta;

    /**
     * Saldo actual de la cuenta bancaria.
     */
    private double saldo;

    /**
     * Tipo de interés aplicado a la cuenta.
     */
    private double tipoInteres;

    /**
     * Constructor por defecto de la clase CCuenta.
     */
    public CCuenta() {
    }

    /**
     * Constructor con parametros para crear una instancia de CCuenta.
     *
     * @param nom Nombre del titular de la cuenta.
     * @param cue Número de la cuenta.
     * @param sal Saldo inicial de la cuenta.
     * @param tipo Tipo de interés de la cuenta.
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
        tipoInteres = tipo;
    }

    /**
     * Obtiene el saldo actual de la cuenta.
     *
     * @return Saldo actual.
     */
    public double estado() {
        return saldo;
    }

    /**
     * Permite ingresar una cantidad de dinero en la cuenta.
     *
     * @param cantidad Cantidad de dinero a ingresar.
     * @throws Exception si la cantidad es negativa.
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo += cantidad;
    }

    /**
     * Permite retirar una cantidad de dinero de la cuenta.
     *
     * @param cantidad Cantidad de dinero a retirar.
     * @throws Exception si la cantidad es negativa o no hay suficiente saldo.
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception("No se puede retirar una cantidad negativa");
        if (estado() < cantidad)
            throw new Exception("No hay suficiente saldo");
        saldo -= cantidad;
    }
}
