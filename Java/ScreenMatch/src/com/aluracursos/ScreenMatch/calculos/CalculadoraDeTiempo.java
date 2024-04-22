package com.aluracursos.ScreenMatch.calculos;
import com.aluracursos.ScreenMatch.modelos.Titulo;

public class CalculadoraDeTiempo {

    private int tiempoTotal;

    public void incluye(Titulo titulo){
        this.tiempoTotal += titulo.getDuracionEnMinutos();
    }

    public int getTiempoTotal() {
        return tiempoTotal;
    }
}
