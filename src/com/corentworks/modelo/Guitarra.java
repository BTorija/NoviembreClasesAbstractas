package com.corentworks.modelo;

public class Guitarra extends InstrumentoMusical{
    private  String tiposCuerdas;

    @Override
    public String toString() {
        return "Guido{" +
                "tiposCuerdas='" + tiposCuerdas + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }

    @Override
    public String emitirSonido() {
        return "nanaino";
    }

    public Guitarra() {
    }

    public Guitarra(String marca, String tiposCuerdas) {
        super(marca);
        this.tiposCuerdas = tiposCuerdas;
    }

    public String getTiposCuerdas() {
        return tiposCuerdas;
    }

    public void setTiposCuerdas(String tiposCuerdas) {
        this.tiposCuerdas = tiposCuerdas;
    }
}
