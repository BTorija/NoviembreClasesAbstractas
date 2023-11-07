package com.corentworks.modelo;

public class Gerente extends Empleado{
    private  double bono;

    @Override
    public String toString() {
        return "Gerente{" +
                "bono=" + bono +
                ", nombre='" + nombre + '\'' +
                ", sueldo=" + sueldo +
                '}';
    }

    @Override
    public double calcularNomina() {
        return sueldo+bono;
    }

    public Gerente() {
    }

    public Gerente(String nombre, double sueldo, double bono) {
        super(nombre, sueldo);
        this.bono = bono;
    }

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }
}
