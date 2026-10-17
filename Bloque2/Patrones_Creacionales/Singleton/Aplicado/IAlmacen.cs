public interface IAlmacen{
    List<Producto> ObtenerProductos();
    Producto? BuscarProducto(int codigo); 
    bool AgregarProducto(Producto producto);
}
