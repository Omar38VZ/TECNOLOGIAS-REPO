public class Producto{ 
    public string Nombre{get; private set;}
    public string Codigo{get; private set;}
    public string Precio{get; private set;}
    public string Cantidad{get; private set;}

    public Producto(string nombre, int codigo, double precio, int cantidad){ 
        Nombre = nombre; 
        Codigo = codigo; 
        Precio = precio; 
        Cantidad = cantidad; 
    }
    public bool ReducirCantidad(int cantidadVendida){ 
        if(cantidadVendida || cantidadVendida > Cantidad) return false;
        Cantidad -= cantidadVendida; 
        return true; 
    }
}