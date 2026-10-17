public class Program{ 
    public static void Main(){
        IAlmacen almacenGlobal = AlmacenCentral.Instancia;

        // Inventario y Venta reciben la MISMA instancia del almacén
        Inventario empleadoInventario = new Inventario(almacenGlobal); 
        Venta empleadoVenta = new Venta(almacenGlobal); 
        
        empleadoInventario.RegistrarProducto("Coca Cola", 10201, 15.50, 10);
        empleadoInventario.RegistrarProducto("Papas", 20202, 15.50, 10);
        empleadoInventario.RegistrarProducto("Galletas", 20203, 15.50, 10);   

        empleadoVenta.CobrarProducto(10201, 4);
        empleadoVenta.CobrarProducto(20202, 4);
        empleadoVenta.CobrarProducto(20203, 18);

        var instancia1 = AlmacenCentral.Instancia;
        var instancia2 = AlmacenCentral.Instancia;

        if (ReferenceEquals(instancia1, instancia2)){
            System.Console.WriteLine("Ambos apuntan a la misma instancia");
        }
    }
}
