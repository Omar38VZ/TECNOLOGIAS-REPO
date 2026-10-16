package Bloque1.SOLID.Segregacion_Interfaces.Bugatti.NoAplicado;

public class App {
    public static void main(String[] args){ 
        DonRamon Ramon = new donRamon(); 
        DoñaFlorinda Florinda = new DoñaFlorinda();
        Nono Ñoño = new Nono(); 

        System.out.println("---La vensida del shavo---");
        
        Ramon.darGolpe();
        try {
            Ramon.cobrarRenta();
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }
    }
}
