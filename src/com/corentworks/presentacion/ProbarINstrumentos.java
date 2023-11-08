package com.corentworks.presentacion;

import com.corentworks.modelo.*;

public class ProbarINstrumentos {
    public static void main(String[] args) {
        InstrumentoMusical guido=new Guitarra("Fuahhdefuahh", "nilon");
        System.out.println("Sonido de la guitarra " + guido.emitirSonido());
        System.out.println(guido.toString());


       InstrumentoMusical bataca=new Bateria("yoquese", 7);

        System.out.println("Sonido de la bateria-> "+ bataca.emitirSonido());
        System.out.println(bataca.toString());

         InstrumentoMusical ham=new Flauta("Amelin", "metal");


        System.out.println("Sonido de la flauta ->" +ham.emitirSonido());
        System.out.println(ham.toString());

        InstrumentoMusical[] instrumentos=new InstrumentoMusical[3];
        instrumentos[0]=guido;
        instrumentos[1]=bataca;
        instrumentos[2]=ham;
        System.out.println();
        //InstrumentoMusical[instrumentos{guido,bataca,ham}

        for (InstrumentoMusical elemento:instrumentos){
            System.out.println("Emitir sonido->" + elemento.emitirSonido());
            System.out.println(elemento.toString());
        }
        for (int i=0;i<instrumentos.length;i++){
            System.out.println(instrumentos[i].emitirSonido());
            System.out.println(instrumentos[i].toString());
        }
    }




}
