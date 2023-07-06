/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pooej03;

import Entidades.Operacion;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class POOEJ03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Operacion op1 = new Operacion();
        
        crearOperacion(op1);
        
        System.out.println("La resta entre " + op1.getNumero1() + " y " + op1.getNumero2() + " es: ");
        System.out.println(op1.restar());
         System.out.println("La suma entre " + op1.getNumero1() + " y " + op1.getNumero2() + " es: ");
        System.out.println(op1.sumar());
        
    }
    
    public static void crearOperacion(Operacion op){
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero");
        op.setNumero1(leer.nextInt());
        System.out.println("Ingrese el segundo numero");
        op.setNumero2(leer.nextInt());
        
        
    }
    
}
