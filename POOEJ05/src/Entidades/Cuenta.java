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
public class Cuenta {
    private int numeroCuenta;
    private long dni;
    private double saldoActual, interes;
    
    public Cuenta(){
        
    }

    public Cuenta(int numeroCuenta, long dni, double saldoActual, double interes) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldoActual = saldoActual;
        this.interes = interes;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }
    
    public void crearCuenta(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese Numero Cuenta");
        setNumeroCuenta(leer.nextInt());
        System.out.println("Ingrese DNI");
        setDni(leer.nextLong());
        System.out.println("Ingrese Saldo");
        setSaldoActual(leer.nextDouble());
    }
    
    public void ingresar(double ingreso) {
        saldoActual += ingreso;
    }
    
    public void retirar(double retiro) {
        if (retiro > saldoActual) {
            saldoActual = 0;
        } else {
            saldoActual -= retiro;
        }
    }
    
    public void extraccionRapida() {
        saldoActual -= saldoActual * 0.2;
    }
    
    
    public void consultarSaldo() {
        System.out.println("El saldo actual en su cuenta es de $" + saldoActual);
    }
    
    public void consultarDatos(){
        System.out.println("Numero Cuenta: " + numeroCuenta + " DNI: " + dni);
    }
}
