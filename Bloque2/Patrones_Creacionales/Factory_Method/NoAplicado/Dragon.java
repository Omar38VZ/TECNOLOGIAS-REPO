package Bloque1.Patrones_De_Diseño.Singleton.Factory.NoAplicado;

public class Dragon extends Enemigo{
    public Dragon(){ 
        super ("Dragon", 1000, 300); 
    }
    public void atacar(){ 
        System.out.println("El Dragon ataca y hace" + this.ataque + "úntos de daño");
    }
    
}
