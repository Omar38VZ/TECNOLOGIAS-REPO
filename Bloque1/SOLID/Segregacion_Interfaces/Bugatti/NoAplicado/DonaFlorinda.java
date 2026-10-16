public class DonaFlorinda implements AccionesPersonaje {
    private final String nombre = "Doña Florinda"; 

    @Override
    public void darGolpe(){ 
        System.out.println(nombre + ": ¡Le da una cachetada a Don Ramón!");
    }
    @Override 
    public void pagarRenta(){ 
        System.out.println(nombre + ": Paga 5k de renta puntualmente"); 
    }
    @Override
    public void cobrarRenta(){ 
        throw new UnsupportedOperationException(nombre + ": No es dueña de la vecindad del Chavo"); 
    }
    @Override 
    public void jugar(){ 
        throw new UnsupportedOperationException(nombre + ": No juega nada"); 
    }
    @Override 
    public void llorar(){ 
        throw new UnsupportedOperationException(nombre + ": Las mujeres no lloran, facturan");
    }
}
