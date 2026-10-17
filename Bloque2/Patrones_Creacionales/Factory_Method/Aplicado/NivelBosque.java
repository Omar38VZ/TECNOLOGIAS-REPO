public class NivelBosque extends Nivel {
    public NivelBosque() {
        super("Nivel Bosque");
    }

    @Override
    public Enemigo crearEnemigo() {
        return new Lobo();
    }
}
