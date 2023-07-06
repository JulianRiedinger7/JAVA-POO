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
    private int base,altura;
    
    public Rectangulo(){
        
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public void crearRectangulo(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor para la base");
        setBase(leer.nextInt());
        System.out.println("Ingrese el valor para la altura");
        setAltura(leer.nextInt());
    }
    
    public int calcularSuperficie(){
        return base * altura;
    }
    
    public int calcularPerimetro(){
        return (base + altura) * 2;
    }
    
    
    public void dibujar(){
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }
    
}
