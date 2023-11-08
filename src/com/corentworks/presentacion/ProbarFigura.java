package com.corentworks.presentacion;

import com.corentworks.modelo.*;

public class ProbarFigura {
    public static void main(String[] args) {

        Figura c1=new Circulo(4,4,2);
        System.out.println("Area del circulo ->" +c1.calcularArea());
        System.out.println(c1.toString());

        Figura r1=new Rectangulo(0,0,4,2);
        System.out.println("Area rectangulo ->" +r1.calcularArea());
        System.out.println(r1.toString());

        Figura cua1=new Cuadrado(0,0,2);
        System.out.println("Area del cuadrado ->" +cua1.calcularArea());
        System.out.println(cua1.toString());

        Figura t1=new Triangulo(0,0,8,9);
        System.out.println("Area del triangulo ->" +t1.calcularArea());
        System.out.println(t1.toString());

       Figura[]figuras={c1,t1,cua1};
        for (int i=0;i<figuras.length;i++) {
            System.out.println(figuras[i].calcularArea());
            System.out.println(figuras[i].toString());


        }

    }
}


