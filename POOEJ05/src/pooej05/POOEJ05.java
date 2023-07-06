/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pooej05;

import Entidades.Cuenta;

/**
 *
 * @author User
 */
public class POOEJ05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Cuenta miCuenta = new Cuenta();
        
        miCuenta.crearCuenta();
        miCuenta.consultarDatos();
        
        miCuenta.consultarSaldo();
        miCuenta.ingresar(1000);
        miCuenta.consultarSaldo();
        miCuenta.retirar(1000);
        miCuenta.consultarSaldo();
        miCuenta.extraccionRapida();
        miCuenta.consultarSaldo();
        miCuenta.retirar(10000);
        miCuenta.consultarSaldo();
    }
    
}
