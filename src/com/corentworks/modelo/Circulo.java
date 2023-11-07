package com.corentworks.modelo;

public class Circulo extends Figura{
    private int radio;

    @Override
    public double calcularArea() {
        return Math.PI*Math.pow(radio,2);
        //return Math.PI *radio*radio
    }

    public Circulo() {
    }
    public Circulo(int x, int y, int radio) {
        super(x, y);
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
}
