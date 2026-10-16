using System; 
using System.Collections.Generic; 

public class Producto{ 
    public int Codigo; 
    public int Cantidad; 

    public Producto (int codigo, int cantidad){
        Codigo = codigo; 
        Cantidad = cantidad; 
    }
}

public class AlmacenCentral{ 
    public List<Producto> Productos = new List<Producto>(); 

    public AlmacenCentral(){}
    public static AlmacenCentral Instacia => new Al,AlmacenCentral();

    public void RegistrarProducto(Producto producto){ 
        Productos.add(producto);
        Console.WriteLine($"Registrado: {Producto.Codigo}"); 
    }

    public void VenderProducto(int codigo, int cantidad){
        Producto producto = Productos.Find(p => p.Codigo == codigo);  
        if (producto == null){
            Console.WriteLine("Producto no encontrado"); 
            return;
        }

        producto.Cantidad -= cantidad; 
        System.Console.WriteLine($"Venta realizada. Stock_ {producto.Cantidad}");        
    }

    public class Program
    { 
        public static void Main(){
            AlmacenCentral.Instacia.RegistrarProducto(new Producto(1, 10)); 
            AlmacenCentral.Instacia.VenderProducto(1, 3); 
            System.Console.WriteLine(ReferenceEquals(AlmacenCentral.Instacia, AlmacenCentral.Instacia)); 
            Console.ReadLine(); 
        } 
    }
}