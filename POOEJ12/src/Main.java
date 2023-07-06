import Entidades.Persona;
import Servicios.ServicePersona;

public class Main {
    public static void main(String[] args) {

        ServicePersona sp = new ServicePersona();
        Persona persona = sp.crearPersona();
        Persona persona2 = sp.crearPersona();

        sp.mostrarPersona(persona);
        sp.mostrarPersona(persona2);

        int edadPersona = sp.calcularEdad(persona);
        String nombrePersona = persona.getNombre();

        System.out.println(nombrePersona + " tiene " + edadPersona + " anios");

        int edadPersona2 = sp.calcularEdad(persona2);
        String nombrePersona2 = persona2.getNombre();

        System.out.println(nombrePersona2 + " tiene " + edadPersona2 + " anios");


        boolean personaMenor = sp.menorQue(edadPersona2, persona);

        System.out.println(nombrePersona + " es menor que " + nombrePersona2 + " ? " + personaMenor);

    }
}