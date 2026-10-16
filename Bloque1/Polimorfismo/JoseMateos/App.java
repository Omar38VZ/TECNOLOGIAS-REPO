public class App {

    public static void main(String[] args) throws Exception {
        Caja caja = new Caja();

        MetodoPago tarjeta = new Tarjeta("1234512345123456");
        MetodoPago paypal = new PayPal("usuario@gmail.com");
        MetodoPago contado = new Contado(true);

        caja.cobrar(tarjeta, 500);
        caja.cobrar(paypal, 1000);
        caja.cobrar(contado, 200);

        // Caso inválido: billete en mal estado
        MetodoPago billeteRoto = new Contado(false);
        caja.cobrar(billeteRoto, 300);
    }
}
