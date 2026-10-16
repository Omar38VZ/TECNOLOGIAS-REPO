Guerrero guerrero1 = new Guerrero("Justin");
Mago mago1 = new Mago("Chris");

Console.WriteLine("Duelo");
Console.WriteLine($"{mago1.nombre} vs {guerrero1.nombre}");

while (mago1.estadoVida && guerrero1.estadoVida)
{
    Console.WriteLine("1.Guerrero ataca a mago");
    Console.WriteLine("2.Mago ataca a guerrero");
    Console.WriteLine("3.Mago usa habilidad");
    Console.WriteLine("Elija una opcion: ");

    string? opcion = Console.ReadLine();
    if (opcion == null) break;

    switch (opcion)
    {
        case "1":
            guerrero1.Ataque(mago1);
            break;
        case "2":
            mago1.Ataque(guerrero1);
            break;
        case "3":
            mago1.UsarHabilidad();
            break;
        default:
            Console.WriteLine("Opcion no valida");
            break;
    }
}

if (!mago1.estadoVida) Console.WriteLine($"{guerrero1.nombre} gana el duelo");
else if (!guerrero1.estadoVida) Console.WriteLine($"{mago1.nombre} gana el duelo");
