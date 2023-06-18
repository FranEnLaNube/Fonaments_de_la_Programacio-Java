public class Cuenta {
    // Atributos
    private int nroCuenta;
    private int saldo;
    // Constructor
    public Cuenta (int nroCuenta, int saldo) {
        this.nroCuenta = nroCuenta;
        this.saldo = saldo;
    }
    // Getters y Setters
    // Getters
    public int getNroCuenta() {
        return nroCuenta;
    }
    public int getSaldo() {
        return saldo;
    }
    // Setters
    public void setNroCuenta (int nroCuenta) {
        this.nroCuenta = nroCuenta;
    }
    public void setSaldo (int saldo) {
        this.saldo = saldo;
    }
    // Métodos particulares
    // Método para operar con el saldo
    public int opSaldo(int deposito) {
        return this.saldo = saldo + deposito;
    }

}
