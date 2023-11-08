package com.corentworks.presentacion;

import com.corentworks.modelo.Empleado;
import com.corentworks.modelo.Gerente;
import com.corentworks.modelo.Operador;
import com.corentworks.modelo.Vendedor;

public class ProbarPolimorfismo {
    public static void main(String[] args) {
        //Probar polimorfismo
        Gerente g1=new Gerente("Pepe",2000,500);
        Empleado e1= new Gerente("Poli",3000,700);
        System.out.println("Calcular nomina -> "+e1.calcularNomina());
        System.out.println(e1.toString());
        Gerente g2=(Gerente) e1;
        System.out.println(g2.getBono());

        Empleado e2=new Vendedor("Luis",1500,20000,0.01);
        System.out.println(e2.calcularNomina());
        System.out.println(e2.toString());

        Empleado e3=new Operador("Pedro",1000,1000,0.02);
        System.out.println(e3.calcularNomina());
        System.out.println(e3.toString());


        Empleado[]empleados=new Empleado[3];
        empleados[0]=e1;
        empleados[1]=e2;
        empleados[2]=e3;

        for (Empleado elemento:empleados){
            System.out.println("Calcular nomina->" + elemento.calcularNomina());
            System.out.println(elemento.toString());
        }

    }

}
