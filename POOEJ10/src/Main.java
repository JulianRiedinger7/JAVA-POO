//Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
//de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
//programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
//Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
//ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
//0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
//20.

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] arrA = new double[50];
        double[] arrB;

        for (int i = 0; i < arrA.length; i++) {
            arrA[i] = Math.round(Math.random() * 20);
        }
        System.out.println(Arrays.toString(arrA));

        Arrays.sort(arrA);

        System.out.println(Arrays.toString(arrA));
        arrB = Arrays.copyOf(arrA, 20);
        System.out.println(Arrays.toString(arrB));
        Arrays.fill(arrB,10,20,0.5);
        System.out.println(Arrays.toString(arrB));


    }
}