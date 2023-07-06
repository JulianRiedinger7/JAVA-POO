package Entidades;

import java.util.Arrays;

public class Ahorcado {

    private String palabraABuscar[];
    int letrasEncontradas, jugadasMaximas;

    public Ahorcado() {

    }

    public Ahorcado(String[] palabraABuscar, int letrasEncontradas, int jugadasMaximas) {
        this.palabraABuscar = palabraABuscar;
        this.letrasEncontradas = letrasEncontradas;
        this.jugadasMaximas = jugadasMaximas;
    }

    public String[] getPalabraABuscar() {
        return palabraABuscar;
    }

    public void setPalabraABuscar(String[] palabraABuscar) {
        this.palabraABuscar = palabraABuscar;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getJugadasMaximas() {
        return jugadasMaximas;
    }

    public void setJugadasMaximas(int jugadasMaximas) {
        this.jugadasMaximas = jugadasMaximas;
    }

    @Override
    public String toString() {
        return "Ahorcado{" +
                "palabraABuscar=" + Arrays.toString(palabraABuscar) +
                ", letrasEncontradas=" + letrasEncontradas +
                ", jugadasMaximas=" + jugadasMaximas +
                '}';
    }
}
