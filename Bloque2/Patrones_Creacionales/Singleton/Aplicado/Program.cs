public class Program{ 
    public static void Main(){
        IAlmacen AlmacenCentral = AlmacenCentral.Instancia;

        Inventario empleadoInventario = new Inventario(almacenGlobal); 
        Inventario empleadoVenta = new Venta(almacenGlobal); 
        
        empleadoInventario.registrarProducto("Coca Cola", 10201, 15.50, 10);
        empleadoInventario.registrarProducto("Papas", 20202, 15.50, 10);
        empleadoInventario.registrarProducto("Galletas", 20203, 15.50, 10);   

        empleadoVenta.CobrarProducto(1,4);
        empleadoVenta.CobrarProducto(2,4);
        empleadoVenta.CobrarProducto(3,18);

        var Instancia1 = AlmacenCentral.Instancia;
        var Instancia2 = AlmacenCentral.Instancia;

        if (ReferenciaEquals(instancia, instancia2)){
            System.Console.WriteLine("Ambos apuntan a la misma instancia");
        }
        
    }
}