package com.corentworks.modelo;

public class Cuadrado extends Figura{
    private double lado;

    @Override
    public String toString() {
        return "Cuadrado{" +
                "lado=" + lado +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public double calcularArea() {
        return lado*lado;
    }

    public Cuadrado() {
    }

    public Cuadrado(int x, int y, double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
