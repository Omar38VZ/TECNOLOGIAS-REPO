class Mago : Personaje, IHabilidadEspecial
{
    public Mago (String nombre) : base(nombre)
    {
        
    }

    public override void Ataque(Personaje objetivo)
    {
        System.Console.WriteLine($"{nombre} lanzo una bola de fuego {objetivo.nombre} ");
    }
    public void UsuarHabilidad()
    {
        puntosVida += 30; 
        if (puntosVidas > 100) puntosVida = 100; 
        System.Console.WriteLine($"{nombre} regenero 30 puntos de vida, su vida actual es: {puntosVida}");
    }
}