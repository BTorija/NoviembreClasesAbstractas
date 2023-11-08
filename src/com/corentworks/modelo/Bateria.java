package com.corentworks.modelo;

public class Bateria extends InstrumentoMusical {
    private  int noPLatillos;

    @Override
    public String toString() {
        return "Bateria{" +
                "noPLatillos=" + noPLatillos +
                ", marca='" + marca + '\'' +
                '}';
    }

    @Override
    public String emitirSonido() {
        return "Plasshh plaaashh";
    }

    public Bateria() {
    }

    public Bateria(String marca, int noPLatillos) {
        super(marca);
        this.noPLatillos = noPLatillos;
    }

    public int getNoPLatillos() {
        return noPLatillos;
    }

    public void setNoPLatillos(int noPLatillos) {
        this.noPLatillos = noPLatillos;
    }
}
