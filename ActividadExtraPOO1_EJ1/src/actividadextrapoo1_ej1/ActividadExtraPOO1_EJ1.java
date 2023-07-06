/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividadextrapoo1_ej1;

import Entidades.Vehiculo;

/**
 *
 * @author User
 */
public class ActividadExtraPOO1_EJ1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Vehiculo auto = new Vehiculo("asdad", "asdas", "automovil", 2000);
        Vehiculo moto = new Vehiculo("asdad", "asdas", "motocicleta", 2000);
        Vehiculo bici = new Vehiculo("asdad", "asdas", "bicicleta", 2000);

        System.out.println("AUTO:");
        System.out.println(auto.moverse(5));
        System.out.println(auto.moverse(10));
        System.out.println(auto.moverse(60));
        
        System.out.println("MOTO:");
        System.out.println(moto.moverse(5));
        System.out.println(moto.moverse(10));
        System.out.println(moto.moverse(60));
        
        System.out.println("Bici:");
        System.out.println(bici.moverse(5));
        System.out.println(bici.moverse(10));
        System.out.println(bici.moverse(60));
        
        int metrosAvanzados = auto.moverse(300);
        int metrosFrenados = auto.frenar();
        
        System.out.println("El auto, luego de 5 minutos, avanzo: ");
        System.out.println(totalAvanzado(metrosAvanzados, metrosFrenados));
        
        metrosAvanzados = moto.moverse(300);
        metrosFrenados = moto.frenar();
        
        System.out.println("La moto, luego de 5 minutos, avanzo: ");
        System.out.println(totalAvanzado(metrosAvanzados, metrosFrenados));
        
        metrosAvanzados = bici.moverse(300);
        metrosFrenados = bici.frenar();
        
        System.out.println("La bici, luego de 5 minutos, avanzo: ");
        System.out.println(totalAvanzado(metrosAvanzados, metrosFrenados));
        
    }
    
    
    public static int totalAvanzado(int metrosAvanzados, int metrosFrenados) {
        return metrosAvanzados + metrosFrenados;
    }
    
}
