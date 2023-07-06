import Entidades.Matematica;
import Services.MatematicaService;

public class Main {
    public static void main(String[] args) {

        MatematicaService ms = new MatematicaService();
        Matematica m1 = ms.crearMatematica();

        System.out.println(m1);
        double mayor = ms.devolverMayor(m1);
        System.out.println("El mayor de los atributos es " + mayor);
        System.out.println("La potencia es " + ms.calcularPotencia(m1));
        System.out.println("La raiz del menor es " + ms.calcularRaiz(m1) );
    }
}