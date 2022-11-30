package br.com.dio.desafio.dominio;

public abstract class Conteudo {

    public Conteudo(String titulo, String descricao, Nivel nivel, Integer cargaHoraria) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.nivel = nivel;
        this.cargaHoraria = cargaHoraria;
    }
    public Conteudo(String titulo, String descricao, Nivel nivel) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.nivel = nivel;
        this.cargaHoraria = 0;
    }

    public Conteudo(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.cargaHoraria = 0;
    }

    public enum Nivel {
        INICIANTE, INTERMEDIARIO, AVANCADO
    }
    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;
    private Nivel nivel;
    private Integer cargaHoraria;

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Nivel getNivel() {
        return nivel;
    }

    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }

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

    @Override
    public String toString() {
        return  "\t\t\ttitulo='" + getTitulo() + '\n' +
                "\t\t\tdescricao='" + getDescricao() + '\n' +
                "\t\t\tcargaHoraria=" + getCargaHoraria() +'\n' +
                "\t\t\tnível=" + getNivel() +"\n\n";
    }
}
