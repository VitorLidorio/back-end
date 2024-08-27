package org.example;

public class Musica {
    private String nome;
    private String artista; 

    public Musica(String nome, String artista) {
        System.out.println("Construtor iniciado");
        this.nome = nome;
        this.artista = artista;
    }
    
    public Musica() {
    
    }

}