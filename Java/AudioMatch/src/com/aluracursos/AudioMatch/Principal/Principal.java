package com.aluracursos.AudioMatch.Principal;

import com.aluracursos.AudioMatch.modelos.Musica;
import com.aluracursos.AudioMatch.modelos.Podcast;

public class Principal {

    public static void main(String[] args) {
        Musica miMusica = new Musica();
        miMusica.setTitulo("Forever");
        miMusica.setCantante("Kiss");

        Podcast miPodcast = new Podcast();
        miPodcast.setPresentador("Gabriela Aguilar");
        miPodcast.setTitulo("Cafe.Tech");
        miPodcast.setDescripion("Sobre tecnologia");

        for (int i = 0; i < 100; i++) {
            miMusica.meGusta();

        }
        for (int i = 0; i < 5000; i++) {
            miMusica.reproducir();
        }


        for (int i = 0; i < 50; i++) {
            miPodcast.meGusta();
        }

        System.out.println("Total de me gusta: "+ miMusica.getTotalDeMeGusta());
        System.out.println("Total de reproducciones: "+ miMusica.getTotalDeReproduciones());

    }
}
