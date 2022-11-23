package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

    //-- Atributos
    //----------------------------------------------
    private int cargaHoraria;

    @Override
    public double calcularXp() {
        return XP_PADRAO + cargaHoraria;
    }

    //-- Construtor vazio
    //----------------------------------------------

    public Curso() {
    }

    //-- Getters and Setters
    //----------------------------------------------
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    //-- toString para imprimir os dados ao
    //-- invés da posição na memória
    //----------------------------------------------
    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
