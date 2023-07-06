import Entidades.Nif;
import Servicios.NifService;

public class Main {
    public static void main(String[] args) {

        NifService ns = new NifService();

        Nif nif = ns.crearNif();

        ns.mostrar(nif);

    }
}