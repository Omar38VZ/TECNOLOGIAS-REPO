using System.Collections;
using System.Runtime.InteropServices;

Guerrero guerrero1 = new Guerrero("Justin"); 
Mago mago1 = new Mago("Chris"); 

System.Console.WriteLine("Duelo");
System.Console.WriteLine($"{mago1.nombre} vs {guerrero1.nombre}");

while (mago1.estadoVida && guerrero1.estadoVida)
{
    System.Console.WriteLine("1.Guerrero Ataca a Mago"); 
    System.Console.WriteLine("2.Mago ataca a guerrero");
    System.Console.WriteLine("3.Mago usa habilidad");
    System.Console.WriteLine("Eliga una opcion: ");

    string? opcion = Console.ReadLine();

    switch (opcion)
    {
        case "1": 
            guerrero1.ataque(mago1); 
            
    
        
    }
 


}