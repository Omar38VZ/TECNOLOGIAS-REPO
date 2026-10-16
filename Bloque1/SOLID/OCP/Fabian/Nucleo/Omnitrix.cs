using OCP.Alien;

namespace OCP.Nucleo;

public class Omnitrix
{
    public IAlien? AlienActual { get; private set; }
    public bool EstaTransformado => AlienActual != null;

    public void Transformar(IAlien alien)
    {
        AlienActual = alien;
        System.Console.WriteLine($"Transformacion completada. Ahora eres {AlienActual.Nombre}");
    }

    public void Destransformar()
    {
        if (AlienActual != null)
        {
            System.Console.WriteLine($"Timeout. {AlienActual.Nombre} ahora es Ben.");
            AlienActual = null;
        }
    }
}
