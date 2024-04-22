package com.aluracursos.AudioMatch.modelos;

public class Podcast extends Audio{
    private String presentador;
    private String descripion;





    public String getPresentador() {
        return presentador;
    }

    public void setPresentador(String presentador) {
        this.presentador = presentador;
    }

    public String getDescripion() {
        return descripion;
    }

    public void setDescripion(String descripion) {
        this.descripion = descripion;
    }
}
