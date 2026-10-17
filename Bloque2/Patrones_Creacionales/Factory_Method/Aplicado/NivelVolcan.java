public class NivelVolcan extends Nivel {
    public NivelVolcan() {
        super("Nivel Volcan");
    }

    @Override
    public Enemigo crearEnemigo() {
        return new Dragon();
    }
}
