import Entidades.Raices;
import Servicios.RaicesService;

public class Main {
    public static void main(String[] args) {

        RaicesService rs = new RaicesService();

        Raices r1 = rs.crearRaices();

        rs.calcular(r1);

    }
}