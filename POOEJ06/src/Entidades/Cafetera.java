/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author User
 */
public class Cafetera {
    private int capacidadMaxima, cantidadActual;
    
    public Cafetera(){
        
    }
    
    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    
    public void llenarCafetera() {
        cantidadActual = capacidadMaxima;
    }
    
    
    public void servirTaza(int tamanio) {
        if (tamanio > cantidadActual) {
            tamanio -= cantidadActual;
            cantidadActual = 0;
            System.out.println("No se logro Llenar la taza, le faltaron " + tamanio + " grs");
        } else {
            cantidadActual -= tamanio;
            System.out.println("Se logro llenar la taza");
        }
    }
    
    public void vaciarCafetera() {
        cantidadActual = 0;
    }
    
    public void agregarCafe(int cantidad) {
        cantidadActual += cantidad;
    }
}
