package Bloque1.SOLID.Liskov.NoAplicadoEvelyn;

public abstract class CuentaBancaria {
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
        saldo -= cantidad;
    }
    
    public double consultarSaldo() {
        return saldo;
    }
    
    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    
    public abstract double calcularIntereses();
    
    public void pagarDeuda(double cantidad) {
        // Método que las subclases que no son de crédito no pueden cumplir lógicamente
    }
    
    protected void validarCantidad(double cantidad) {
        if (cantidad < 0) {
            throw new IllegalArgumentException("La cantidad no puede ser menor a 0");
        }
    }
}
