package Bloque1.Patrones_De_Diseño.Singleton.Factory.NoAplicado;

public class Esqueleto extends Enemigo {
    public Esqueleto() {
        super("Esqueleto", 150, 75);
    }

    public void atacar(){ 
        System.out.println("El esqueleto ataca y hace" + this.ataque + "úntos de daño");
    }
}
