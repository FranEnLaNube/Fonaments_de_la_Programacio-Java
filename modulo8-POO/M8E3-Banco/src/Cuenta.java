public class Cuenta {
    // Atributos
    private int nroCuenta;
    private double saldo;
    // Constructor
    public Cuenta (int nroCuenta, double saldo) {
        this.nroCuenta = nroCuenta;
        this.saldo = saldo;
    }
    // Getters y Setters
    // Getters
    public int getNroCuenta() {
        return nroCuenta;
    }
    public double getSaldo() {
        return saldo;
    }
    // Setters
    public void setNroCuenta (int nroCuenta) {
        this.nroCuenta = nroCuenta;
    }
    public void setSaldo (double saldo) {
        this.saldo = saldo;
    }
    // Métodos particulares
    // Método para ingresar/depositar saldo
    public double ingresar(double deposito) {
        return this.saldo = saldo + deposito;
    }
    // Método para retirar/extraer saldo
    public double retirar(double extraccion) {
        return this.saldo = saldo - extraccion;
    }

}
