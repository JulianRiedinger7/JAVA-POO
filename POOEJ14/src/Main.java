import Entidades.Movil;
import Servicios.MovilService;

public class Main {
    public static void main(String[] args) {

        MovilService ms = new MovilService();
        Movil movil = ms.cargarCelular();

        System.out.println(movil);
    }
}