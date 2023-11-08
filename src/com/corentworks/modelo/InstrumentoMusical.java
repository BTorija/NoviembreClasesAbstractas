package com.corentworks.modelo;

public abstract class InstrumentoMusical {
    protected  String marca;

    @Override
    public String toString() {
        return "InstrumentoMusical{" +
                "marca='" + marca + '\'' +
                '}';
    }

    public abstract String emitirSonido();

    public InstrumentoMusical() {
    }

    public InstrumentoMusical(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
