public class DonRamon implements Inquilino, Habitante, Peleonero {
    private final String nombre = "Don Ramón";

    @Override
    public void pagarRenta() {
        System.out.println(nombre + ": ¡Le pago la próxima semana, Señor Barriga!");
    }

    @Override
    public void interactuarConElChavo() {
        System.out.println(nombre + ": ¡Chavo, ve por unas tortas!");
    }

    @Override
    public void darGolpe() {
        System.out.println(nombre + ": ¡Toma!, ¡toma!");
    }
}
