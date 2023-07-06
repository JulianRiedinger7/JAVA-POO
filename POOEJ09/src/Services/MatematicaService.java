package Services;

import Entidades.Matematica;

public class MatematicaService {

    public Matematica crearMatematica() {
        Matematica matematica = new Matematica();

        matematica.setNum1(Math.round(Math.random() * 10));
        matematica.setNum2(Math.round(Math.random() * 10));

        return matematica;
    }

    public double devolverMayor(Matematica m1) {
        return Math.max(m1.getNum1(), m1.getNum2());
    }

    public double calcularPotencia(Matematica m1) {
        double mayor = devolverMayor(m1);

        if(mayor == m1.getNum1()) {
            return Math.pow(mayor, m1.getNum2());
        }
        return Math.pow(mayor, m1.getNum1());

    }

    public double calcularRaiz(Matematica m1) {
        double mayor = devolverMayor(m1);
        if(mayor == m1.getNum1()) {
            return Math.sqrt(Math.abs(m1.getNum2()));
        }
        return Math.sqrt(Math.abs(m1.getNum1()));

    }
}
