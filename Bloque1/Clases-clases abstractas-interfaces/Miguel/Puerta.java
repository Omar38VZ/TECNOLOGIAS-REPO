public class Puerta implements ActivablePorRedstone {

    @Override
    public void activar(){
        System.out.println("Puerta se le manda señal y se abre");
    }
    @Override
    public void desactivar() { 
        System.out.println("Puerta se le manda señal y se cierra");
    }


}
