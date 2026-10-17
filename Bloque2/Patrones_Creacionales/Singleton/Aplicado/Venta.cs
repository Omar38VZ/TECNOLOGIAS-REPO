public class Venta{ 
    private readonly IAlmacen _almacen; 

    public Venta(IAlmacen almacen){
        _almacen = almacen;
    }

    public bool CobrarProducto(int codigo, int cantidad){ 
        Producto? venta = _almacen.BuscarProducto(codigo); 
        if (venta == null){
            System.Console.WriteLine($"[CAJA]: El producto {codigo} no existe");
            return false; 
        }

        if (!venta.ReducirCantidad(cantidad)){
            System.Console.WriteLine($"[CAJA]: Stock insuficiente de {venta.Nombre} (hay {venta.Cantidad}, se pidieron {cantidad})");
            return false;
        }

        double total = venta.Precio * cantidad; 
        System.Console.WriteLine($"[CAJA]: Venta realizada con exito por el producto: {venta.Nombre}. Total a pagar: ${total:F2}. Stock restante: {venta.Cantidad}"); 
        return true;
    }
}
