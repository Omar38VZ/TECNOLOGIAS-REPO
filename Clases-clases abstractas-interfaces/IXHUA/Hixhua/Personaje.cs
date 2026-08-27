using System.Diagnostics;
using System.Runtime;

abstract class Personaje
{
    public string nombre {
        get; private set; 
    }
    public int puntosVida
    {
        get; protected set; 
    }
    public bool estadoVida
    {
        get {return estadoVida > 0;}
    }
    public Personaje(String nombre)
    {
        this.nombre = nombre;
        PuntosVida = 100; 
    }   
    public void RecibirDano(int cantidad)
    {
        PuntosVida -= cantidad; 
            if (PuntosVida < 0) puntosVida = 0; 
            System.Console.WriteLine($"{nombre} recibio un daño de {cantidad}, sus puntos de vida son {puntosVida}"); 
    } 
    
    public abstract void Ataque (Personaje objetivo);


    }