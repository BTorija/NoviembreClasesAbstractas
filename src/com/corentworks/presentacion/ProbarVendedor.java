package com.corentworks.presentacion;

import com.corentworks.modelo.Vendedor;

public class ProbarVendedor {
    public static void main(String[] args) {
        Vendedor v1 = new Vendedor("Paco", 1500, 15500, 0.01);
        System.out.println(v1.calcularNomina());
        System.out.println(v1.toString());

    }
}