import java.util.List;

public class App { 
    public static void main(String[] args) { 
        Nono nono = new Nono(); 
        DonRamon donRamon = new DonRamon(); 
        DonaFlorinda donaFlorinda = new DonaFlorinda();
        ProfeJirafales jirafales = new ProfeJirafales();

        System.out.println("---La vecindad del Chavo (ISP aplicado)---");

        // Interfaz para el Profe Jirafales
        List<Educador> educadores = List.of(jirafales); 
        for (Educador e : educadores) { 
            e.impartirClase();
            e.pasarLista();
            e.hacerCoraje();
        }

        // Interfaz para los que pagan renta
        List<Inquilino> inquilinos = List.of(donRamon, donaFlorinda);
        for (Inquilino i : inquilinos) { 
            i.pagarRenta();
        }

        // Interfaz para los que se pelean
        List<Peleonero> peleoneros = List.of(donRamon, donaFlorinda);
        for (Peleonero p : peleoneros) { 
            p.darGolpe();
        }

        // Interfaz para los habitantes
        List<Habitante> habitantes = List.of(donRamon, donaFlorinda, jirafales); 
        for (Habitante h : habitantes) { 
            h.interactuarConElChavo();
        }

        // Interfaz para los niños
        List<Nino> ninos = List.of(nono); 
        for (Nino n : ninos) {
            n.jugar();
            n.llorar();
            n.cantar();
        }
    }
}
