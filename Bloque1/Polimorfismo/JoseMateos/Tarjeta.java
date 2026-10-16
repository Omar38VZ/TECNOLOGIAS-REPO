public class Tarjeta implements MetodoPago {

    private String numero;

    public Tarjeta(String numero) {
        this.numero = numero;
    }

    @Override
    public boolean validar() {
        return this.numero.length() == 16;
    }

    @Override
    public void pagar(double monto) {
        System.out.println("Pago de $" + monto + " realizado con tarjeta: **** " + this.numero.substring(12));
    }
}
