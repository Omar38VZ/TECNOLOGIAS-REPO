public class Main {
    public static void main(String[] args) {
        Piston miPiston = new Piston();     
        Puerta miPuerta = new Puerta(); 
        Lampara miLampara = new Lampara(); 
        BloqueMusical miBLoqueMusical = new BloqueMusical(); 

        System.out.println("Se activó palanca");
        miPiston.activar(); 
        miPuerta.activar(); 
        miLampara.activar();
        miBLoqueMusical.activar();

        System.out.println("Se desactivo la palanca");
        miPiston.desactivar();
        miPuerta.activar();
        miLampara.activar();
        miBLoqueMusical.activar();

        Zombie miZombie = new Zombie(); 
        Esqueleto miEsqueleto = new Esqueleto(); 
        
        miZombie.quemarEnLava();
        miEsqueleto.quemarEnLava();

        miZombie.atacar();
        miEsqueleto.atacar();
    }
}
