public class Nono implements Nino {
    private final String nombre = "Ñoño";

    @Override
    public void jugar() {
        System.out.println(nombre + ": Juega con sus pelotas");
    }

    @Override
    public void llorar() {
        System.out.println(nombre + ": Llora por Paty");
    }

    @Override
    public void cantar() {
        System.out.println(nombre + ": Canta \"Mi papá es el dueño de la vecindad\"");
    }
}
