package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public abstract class Conteudo {

    //-- Constantes
    //----------------------------------------------
    protected static final double XP_PADRAO = 10d;

    //-- Atributos
    //----------------------------------------------
    private String titulo;
    private String descricao;

    //-- Método
    //----------------------------------------------
    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
