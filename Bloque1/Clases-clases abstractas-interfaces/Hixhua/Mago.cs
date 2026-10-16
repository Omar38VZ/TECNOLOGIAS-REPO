class Mago : Personaje, IHabilidadEspecial
{
    public Mago(string nombre) : base(nombre)
    {

    }

    public override void Ataque(Personaje objetivo)
    {
        Console.WriteLine($"{nombre} lanzo una bola de fuego a {objetivo.nombre}");
        objetivo.RecibirDano(25);
    }

    public void UsarHabilidad()
    {
        puntosVida += 30;
        if (puntosVida > 100) puntosVida = 100;
        Console.WriteLine($"{nombre} regenero 30 puntos de vida, su vida actual es: {puntosVida}");
    }
}
