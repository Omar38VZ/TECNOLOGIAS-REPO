public interface OperacionesCredito {
    void pagarDeuda(double cantidad);
    double consultarDeuda();
    double consultarCreditoDisponible();
}
