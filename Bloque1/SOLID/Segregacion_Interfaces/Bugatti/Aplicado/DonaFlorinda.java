public class DonaFlorinda implements Inquilino, Habitante, Peleonero {
    private final String nombre = "Doña Florinda";

    @Override
    public void pagarRenta() {
        System.out.println(nombre + ": Paga 5k de renta puntualmente");
    }

    @Override
    public void interactuarConElChavo() {
        System.out.println(nombre + ": ¡Vámonos, tesoro, no te juntes con esta chusma!");
    }

    @Override
    public void darGolpe() {
        System.out.println(nombre + ": ¡Le da una cachetada a Don Ramón!");
    }
}
