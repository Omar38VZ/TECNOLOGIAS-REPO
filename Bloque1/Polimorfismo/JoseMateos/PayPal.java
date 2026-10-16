public class PayPal implements MetodoPago {

    private String correo;

    public PayPal(String correo) {
        this.correo = correo;
    }

    @Override
    public boolean validar() {
        return this.correo.contains("@");
    }

    @Override
    public void pagar(double monto) {
        System.out.println("Pago de $" + monto + " enviado a la cuenta PayPal: " + this.correo);
    }
}
