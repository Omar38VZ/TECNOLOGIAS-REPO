public class Dragon extends Enemigo {
    public Dragon(){ 
        super("Dragon", 1000, 300); 
    }

    @Override
    public void atacar(){ 
        System.out.println("El Dragon ataca y hace " + this.ataque + " puntos de daño");
    }
}
