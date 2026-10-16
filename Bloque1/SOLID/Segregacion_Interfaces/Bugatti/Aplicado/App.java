import java.util.List;

import Bloque1.SOLID.Segregacion_Interfaces.Bugatti.NoAplicado.DonRamon;
public class App{ 
    public static void main(String[] args) throws Exception{ 
        Nono ñoño = new Nono(); 
        DonRamon ramon = new DonRamon(); 
        PorfesorJirafales jirafales = new ProfesorJirafales();
        
        //Interfaz para El profe Jirafales
        List<EducadorZ educadores = List.of(jirafales); 
        for (Educador e : educadores){ 
            e.impartirClase();
            e.pasarLista();
            e.hacerCoraje();
        }

        //Interfaz para Don Ramón
        List<Inquilino> inquilinos = List.of(donRamon);
        for (Inquilino i : inquilinos){ 
            i.pagarRenta();
        }
        //Interfaz pars Habitante
        List<Habitante> habitantes = List.of(donRamon, jirafales); 
        for (Habitante i : habitantes){ 
            i.interactuarConElChavo();
        }

        //Interfaz para niño
        List<Nino> niños = List.of(nono); 
        for (Nino i: niños){
            i.llorar();
            i.cantar();
        }
    }
}
