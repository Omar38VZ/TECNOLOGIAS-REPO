package Bloque1.SOLID.Liskov.NoAplicadoEvelyn;

public class CuentaCredito extends CuentaBancaria {
    private double limiteCredito;
    private double deuda;
    private double tasaInteres;

    public CuentaCredito(String numeroCuenta, double limiteCredito) {
        super(numeroCuenta, 0); 
        this.limiteCredito = limiteCredito;
        this.deuda = 0;
        this.tasaInteres = 0.15;
    }

    @Override
    public void retirar(double cantidad) {
        validarCantidad(cantidad);
        if (deuda + cantidad > limiteCredito) {
            throw new IllegalArgumentException("Limite de credito excedido");
        }
        deuda += cantidad;
    }

    @Override
    public void depositar(double cantidad) {
        pagarDeuda(cantidad);
    }

    @Override
    public double consultarSaldo() {
        return -deuda;
    }

    @Override
    public double calcularIntereses() {
        return deuda * tasaInteres;
    }

    @Override
    public void pagarDeuda(double cantidad) {
        validarCantidad(cantidad);
        deuda -= cantidad;
        if (deuda < 0) {
            saldo = -deuda; // pasa a saldo a favor
            deuda = 0;
        }
    }
    
    public double consultarDeuda() {
        return deuda;
    }
    
    public double consultarCreditoDisponible() {
        return limiteCredito - deuda;
    }
}
