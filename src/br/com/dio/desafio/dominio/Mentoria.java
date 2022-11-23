package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo { //-- Extende a classe Conteudo que foi criada para reaproveitamento de código

    //-- Atributos
    //----------------------------------------------
    LocalDate data;

    //-- Implementa o método herdado da classe Conteudo
    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    //-- Construtor vazio
    //----------------------------------------------
    public Mentoria() {
    }

    //-- Getters and Setters
    //----------------------------------------------
    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    //-- toString para imprimir os dados ao
    //-- invés da posição na memória
    //----------------------------------------------
    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }
}
