using OCP.Alien;

namespace OCP.Extensiones;

public class Fusion<TAlienA, TAlienB> : IAlien
    where TAlienA : IAlien, new()
    where TAlienB : IAlien, new()
{
    private readonly TAlienA _alienA = new();
    private readonly TAlienB _alienB = new();

    public string Nombre => $"Fusion {_alienA.Nombre} + {_alienB.Nombre}";
    public string Descripcion => $"Habilidades combinadas de {_alienA.Nombre} y {_alienB.Nombre}";

    public void UsarHabilidad()
    {
        System.Console.WriteLine("Activas ambas mitades de ADN fusionado:");
        _alienA.UsarHabilidad();
        _alienB.UsarHabilidad();
    }
}
