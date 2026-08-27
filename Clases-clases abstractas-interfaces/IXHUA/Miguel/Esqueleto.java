public class Esqueleto extends MobHostil {
    public Esqueleto(){ 
        super("Esqueleto1", 20); 
    }
    
    @Override
    public void atacar(){ 
        System.out.println("El esqueleto te persigue y te ataca con sus arco.");
    }
}
