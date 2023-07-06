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
public class Persona {
    private int edad,peso;
    private String nombre;
    private char sexo;
    private double altura;
    
    public Persona(){
        
    }

    public Persona(int edad, int peso, String nombre, char sexo, double altura) {
        this.edad = edad;
        this.peso = peso;
        this.nombre = nombre;
        this.sexo = sexo;
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public void crearPersona() {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese nombre");
        setNombre(leer.nextLine());
        System.out.println("Ingrese edad");
        setEdad(leer.nextInt());
        System.out.println("Ingrese peso");
        setPeso(leer.nextInt());
        System.out.println("Ingrese altura");
        setAltura(leer.nextDouble());
        do {
            System.out.println("Ingrese sexo (M/H/O)");
            setSexo(leer.next().charAt(0));
        } while (sexo != 'M' && sexo != 'H' && sexo != 'O');
    }
    
    public int calcularIMC() {
        double calculo = peso / (altura * altura);
        
        if(calculo < 20) {
            return -1;
        } else if (calculo >= 20 && calculo <= 25) {
            return 0;
        }
        
        return 1;
    }
    
    
    public boolean esMayorDeEdad() {
        return edad >= 18;
    }
}
