/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author User
 */
public class Vehiculo {

    private String marca, modelo, tipo;
    private int anio;

    public Vehiculo() {

    }

    public Vehiculo(String marca, String modelo, String tipo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.anio = anio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    

    public int moverse(int segundos) {
        switch (tipo) {
            case "automovil":
                return 3 * segundos;
            case "motocicleta":
                return 2 * segundos;
            case "bicicleta":
                return 1 * segundos;
            default:
                throw new AssertionError();
        }
    }
    
    public int frenar() {
        if (tipo.equals("automovil") || tipo.equals("motocicleta")) {
            return 2;
        }
        return 0;             
    }

}
