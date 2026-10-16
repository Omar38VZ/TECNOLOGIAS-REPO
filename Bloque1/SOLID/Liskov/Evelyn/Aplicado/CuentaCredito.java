public class CuentaCredito extends CuentaBancaria implements OperacionesCredito {
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
        double usaSaldo = Math.min(saldo, cantidad); // primero se usa el saldo a favor
        double nuevaDeuda = cantidad - usaSaldo;
        if (deuda + nuevaDeuda > limiteCredito) {
            throw new IllegalArgumentException("Limite de credito excedido");
        }
        saldo -= usaSaldo;
        deuda += nuevaDeuda;
    }

    @Override
    public void depositar(double cantidad) {
        pagarDeuda(cantidad);
    }

    @Override
    public double consultarSaldo() {
        return saldo - deuda;
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
            saldo += -deuda; // lo que sobra pasa a saldo a favor
            deuda = 0;
        }
    }
    
    @Override
    public double consultarDeuda() {
        return deuda;
    }
    
    @Override
    public double consultarCreditoDisponible() {
        return limiteCredito - deuda;
    }
}
