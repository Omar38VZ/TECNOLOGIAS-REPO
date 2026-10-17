public class AlmacenCentral : IAlmacen{ 
    private readonly List<Producto> _productos;
    private static readonly Lazy<AlmacenCentral> _instancia = 
        new Lazy<AlmacenCentral>(() => new AlmacenCentral()); 

    public static AlmacenCentral Instancia => _instancia.Value;

    private AlmacenCentral(){
        System.Console.WriteLine("Creando el almacen");
        _productos = new List<Producto>();
    }

    public List<Producto> ObtenerProductos(){
        return _productos;
    }
    
    public Producto? BuscarProducto(int codigo){
        return _productos.FirstOrDefault(x => x.Codigo == codigo);
    }
    
    public bool AgregarProducto(Producto producto){
        if(BuscarProducto(producto.Codigo) == null){
            _productos.Add(producto); 
            return true;
        }
        return false;
    }
}
