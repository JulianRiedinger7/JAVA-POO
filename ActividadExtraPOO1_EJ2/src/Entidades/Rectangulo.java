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
public class Rectangulo {

    private int base, altura;

    public Rectangulo() {

    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int area() {
        return base * altura;
    }

    public int perimetro() {
        return (base + altura) * 2;
    }

    public void crearRectangulo() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor de la base");
        setBase(leer.nextInt());
        System.out.println("Ingrese el valor de la altura");
        setAltura(leer.nextInt());
    }

    public void mostrarCalculos() {
        System.out.println("El area del rectangulo es: " + area() + " y el perimetro es " + perimetro());
    }

}
