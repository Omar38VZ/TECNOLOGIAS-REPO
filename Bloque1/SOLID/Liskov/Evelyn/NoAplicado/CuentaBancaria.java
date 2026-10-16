public class CuentaBancaria {
    protected String numeroCuenta;
    protected double saldo;
    
    public CuentaBancaria(String numeroCuenta, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
    }
    
    public void depositar(double cantidad) {
        validarCantidad(cantidad);
        saldo += cantidad;
    }
    
    public void retirar(double cantidad) {
        validarCantidad(cantidad);
        if (cantidad > saldo) {
            throw new IllegalArgumentException("Saldo insuficiente");
        }
        saldo -= cantidad;
    }
    
    public double consultarSaldo() {
        return saldo;
    }
    
    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    
    public double calcularIntereses() {
        return 0;
    }
    
    public void pagarDeuda(double cantidad) {
        // Método que las subclases que no son de crédito no pueden cumplir lógicamente
    }
    
    protected void validarCantidad(double cantidad) {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("La cantidad debe ser mayor a 0");
        }
    }
}
