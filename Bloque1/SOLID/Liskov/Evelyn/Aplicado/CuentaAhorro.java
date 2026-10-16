public class CuentaAhorro extends CuentaBancaria {
    private double tasaInteres;

    public CuentaAhorro(String numeroCuenta, double saldoInicial) {
        super(numeroCuenta, saldoInicial);
        this.tasaInteres = 0.05;
    }

    @Override
    public void retirar(double cantidad) {
        validarCantidad(cantidad);
        if (cantidad > saldo) {
            throw new IllegalArgumentException("Saldo insuficiente");
        }
        saldo -= cantidad;
    }

    @Override
    public double calcularIntereses() {
        return saldo * tasaInteres;
    }
}
