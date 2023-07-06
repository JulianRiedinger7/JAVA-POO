/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Cuadrado {
    private int lado;
    
    public Cuadrado(){
        
    }
    
    public void setLado(int lado) {
        this.lado = lado;
    }
    
    public int area(){
        return lado * lado;
    }
    
    public int perimetro(){
        return 4 * lado;
    }
    
    public void crearCuadrado() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor del lado");
        setLado(leer.nextInt());
    }
    
    public void mostrarCalculos() {
        System.out.println("El area del cuadrado es: " + area() + " y el perimetro es " + perimetro());
    }
}
