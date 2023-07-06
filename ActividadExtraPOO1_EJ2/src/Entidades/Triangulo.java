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
public class Triangulo {
    private double lado;
    
    public Triangulo() {
        
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    public double area() {
        return (lado * lado) / 2;
    }

    public double perimetro() {
        return lado * 3;
    }

    public void crearTriangulo() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor del lado");
        setLado(leer.nextInt());
    }

    public void mostrarCalculos() {
        System.out.println("El area del triangulo es: " + area() + " y el perimetro es " + perimetro());
    }
}
