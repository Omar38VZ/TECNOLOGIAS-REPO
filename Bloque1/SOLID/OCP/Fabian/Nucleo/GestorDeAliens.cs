using OCP.Alien;
using OCP.Extensiones;
using OCP.Fabrica;

namespace OCP.Nucleo;

public class GestorDeAliens
{
    private readonly List<(string Nombre, Func<IAlien> Crear, bool Desbloqueado)> _catalogo = new()
    {
        ("Fuego", () => new Fuego(), true),
        ("Humungosaurio", () => new Humungosaurio(), true),
        ("Cuatro Brazos", () => new CuatroBrazos(), true)
    };

    private readonly List<(string Nombre, Func<IAlien> Crear)> _escanearADN = new();

    private readonly Dictionary<Type, Func<IAlien>> _supremos = new()
    {
        { typeof(Humungosaurio), () => new HumungosaurioSupremo() }
    };

    private readonly List<(string Nombre, Func<IAlien> Crear)> _fusiones = new()
    {
        ("Humungosaurio + Cuatro Brazos", () => new Fusion<Humungosaurio, CuatroBrazos>()),
        ("Fuego + Cuatro Brazos", () => new Fusion<Fuego, CuatroBrazos>()),
        ("Fuego + Humungosaurio", () => new Fusion<Fuego, Humungosaurio>())
    };

    public List<(string Nombre, Func<IAlien> Crear)> ObtenerDesbloqueados()
    {
        var lista = _catalogo
            .Where(a => a.Desbloqueado)
            .Select(a => (a.Nombre, a.Crear))
            .ToList();
        lista.AddRange(_escanearADN);
        return lista;
    }

    public void RegistrarADN(MuestraADN muestra)
    {
        _escanearADN.Add((muestra.Nombre, () => FabricaAlien.CrearDesdeMuestra(muestra)));
    }

    public bool TieneSupremo(IAlien alien) => _supremos.ContainsKey(alien.GetType());

    public IAlien CrearSupremo(IAlien alien) => _supremos[alien.GetType()]();

    public List<(string Nombre, Func<IAlien> Crear)> ObtenerFusion() => _fusiones;

    public IAlien ElegirAlienAleatorio()
    {
        var disponibles = ObtenerDesbloqueados();
        var indice = Random.Shared.Next(disponibles.Count);
        return disponibles[indice].Crear();
    }
}
