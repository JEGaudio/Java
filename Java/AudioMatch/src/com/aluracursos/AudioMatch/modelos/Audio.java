package com.aluracursos.AudioMatch.modelos;

public class Audio {
    private String titulo;
    private int duracion;
    private int totalDeReproduciones;
    private int totalDeMeGusta;
    private int clasificacion;

    public void meGusta(){
        this.totalDeMeGusta++;
    }

    public void reproducir(){
        this.totalDeReproduciones++;

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getTotalDeReproduciones() {
        return totalDeReproduciones;
    }

    public void setTotalDeReproduciones(int totalDeReproduciones) {
        this.totalDeReproduciones = totalDeReproduciones;
    }

    public int getTotalDeMeGusta() {
        return totalDeMeGusta;
    }

    public void setTotalDeMeGusta(int meGusta) {
        this.totalDeMeGusta = meGusta;
    }

    public int getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(int clasificacion) {
        this.clasificacion = clasificacion;
    }
}
