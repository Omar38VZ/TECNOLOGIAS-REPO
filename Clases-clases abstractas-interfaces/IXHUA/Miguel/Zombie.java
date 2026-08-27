public class Zombie extends MobHostil {

    public Zombie() {
        super("Zombie1", 20);
    }

    @Override
    public void atacar() {
        System.out.println("El Zombie te persigue y te ataca con sus mano.");
    }
}
