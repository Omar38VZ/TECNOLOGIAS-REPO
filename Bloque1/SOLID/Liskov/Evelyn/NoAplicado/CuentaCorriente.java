public class CuentaCorriente extends CuentaBancaria {
    private double limiteSobregiro;
    private double tasaInteres;

    public CuentaCorriente(String numeroCuenta, double saldoInicial, double limiteSobregiro) {
        super(numeroCuenta, saldoInicial);
        if (limiteSobregiro < 0) {
            throw new IllegalArgumentException("El limite de sobregiro no debe ser menor a 0");
        }
        this.limiteSobregiro = limiteSobregiro;
        this.tasaInteres = 0.01;
    }

    @Override
    public void retirar(double cantidad) {
        validarCantidad(cantidad);
        if (saldo + limiteSobregiro < cantidad) {
            throw new IllegalArgumentException("Sobregiro excedido");
        }
        saldo -= cantidad;
    }

    @Override
    public double calcularIntereses() {
        return saldo > 0 ? saldo * tasaInteres : 0;
    }

    @Override
    public void pagarDeuda(double cantidad) {
        throw new UnsupportedOperationException("No se puede pagar deuda en una cuenta corriente");
    }
    
    public double consultarSobregiroUtilizado() {
        return saldo < 0 ? -saldo : 0;
    }
    
    public double getLimiteSobregiro() {
        return limiteSobregiro;
    }
}
