package com.corentworks.modelo;

public abstract class Figura {
    protected int x;
    protected int y;

    @Override
    public String toString() {
        return "Figura{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public abstract double calcularArea();

    public Figura() {
    }

    public Figura(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
