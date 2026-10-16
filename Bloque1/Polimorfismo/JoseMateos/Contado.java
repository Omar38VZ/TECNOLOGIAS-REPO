public class Contado implements MetodoPago {

    private boolean estadoBilletes;

    public Contado(boolean estadoBilletes) {
        this.estadoBilletes = estadoBilletes;
    }

    @Override
    public boolean validar() {
        return estadoBilletes;
    }

    @Override
    public void pagar(double monto) {
        System.out.println("Pago de $" + monto + " en efectivo: el billete está en buen estado y se pagó de forma correcta");
    }
}
