package com.corentworks.presentacion;

import com.corentworks.modelo.Gerente;

public class ProbarGerente {
    public static void main(String[] args) {
        Gerente g1=new Gerente("Manolo",1500,900);
        System.out.println(g1.calcularNomina());
        System.out.println(g1.toString());

    }
}
