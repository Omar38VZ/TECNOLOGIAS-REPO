using System; 
using System.Collections.Generic; 

public class Producto{ 
    public int Codigo; 
    public int Cantidad; 

    public Producto(int codigo, int cantidad){
        Codigo = codigo; 
        Cantidad = cantidad; 
    }
}

public class AlmacenCentral{ 
    public List<Producto> Productos = new List<Producto>(); 

    public AlmacenCentral(){}

    // Sin Singleton: cada acceso crea un almacén NUEVO y vacío
    public static AlmacenCentral Instancia => new AlmacenCentral();

    public void RegistrarProducto(Producto producto){ 
        Productos.Add(producto);
        Console.WriteLine($"Registrado: {producto.Codigo}"); 
    }

    public void VenderProducto(int codigo, int cantidad){
        Producto? producto = Productos.Find(p => p.Codigo == codigo);  
        if (producto == null){
            Console.WriteLine("Producto no encontrado"); 
            return;
        }

        producto.Cantidad -= cantidad; 
        Console.WriteLine($"Venta realizada. Stock: {producto.Cantidad}");        
    }
}

public class Program
{ 
    public static void Main(){
        AlmacenCentral.Instancia.RegistrarProducto(new Producto(1, 10)); 
        AlmacenCentral.Instancia.VenderProducto(1, 3); 
        Console.WriteLine($"¿Es la misma instancia? {ReferenceEquals(AlmacenCentral.Instancia, AlmacenCentral.Instancia)}"); 
    } 
}
