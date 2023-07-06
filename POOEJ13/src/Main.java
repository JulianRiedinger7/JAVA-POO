import Entidades.Curso;
import Servicios.CursoService;

public class Main {
    public static void main(String[] args) {

        CursoService cs = new CursoService();
        Curso curso1 = cs.crearCurso();

        System.out.println(curso1);
        int gananciaSemanal = cs.calcularGananciaSemanal(curso1);
        System.out.println("La ganancia semanal del curso de " + curso1.getNombreCurso() + " es: $" + gananciaSemanal);
    }

    }
