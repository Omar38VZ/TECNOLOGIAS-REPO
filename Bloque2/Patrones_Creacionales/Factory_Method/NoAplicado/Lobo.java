package Bloque1.Patrones_De_Diseño.Singleton.Factory.NoAplicado;

public class Lobo extends Enemigo {
    public Lobo(){ 
        super("Lobo",, 100, 50); 
    }
    public void atacar(){ 
        System.out.println("El lobo ataca y te resta" + this.ataque + "puntos de daño");
    }
}