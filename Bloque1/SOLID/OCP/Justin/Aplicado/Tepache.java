// Bebida nueva: se agrega sin modificar Caja (OCP).
public class Tepache extends Bebida {
    public Tepache(String nombreBebida, double precioBase){
        super(nombreBebida, Etiqueta.CON_IVA, precioBase);  
    }

    @Override 
    public boolean requiereINE(){ 
        return false; 
    }

    @Override 
    public double calcularTotal() { 
        return getPrecioBase() * (1 + IVA); 
    }
}
