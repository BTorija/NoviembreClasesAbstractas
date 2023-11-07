package com.corentworks.presentacion;

import com.corentworks.modelo.Circulo;

public class ProbarCirculo {
    public static void main(String[] args) {
        Circulo c1=new Circulo(4,4,2);
        System.out.println("Area del circulo ->" +c1.calcularArea());
        System.out.println(c1.toString());
    }
}
