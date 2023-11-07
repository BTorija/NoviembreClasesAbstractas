package com.corentworks.presentacion;

import com.corentworks.modelo.Rectangulo;

public class ProbarRectangulo {
    public static void main(String[] args) {
        Rectangulo r1=new Rectangulo(0,0,4,2);
        System.out.println("Area rectangulo ->" +r1.calcularArea());
        System.out.println(r1.toString());
    }
}
