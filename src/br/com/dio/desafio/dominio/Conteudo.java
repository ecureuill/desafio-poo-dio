package br.com.dio.desafio.dominio;

public abstract class Conteudo {

    public Conteudo(String titulo, String descricao, Nivel nivel, Integer cargaHoraria) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.nivel = nivel;
        this.cargaHoraria = cargaHoraria;
        this.percentual = 0;
        this.completo = false;
    }
    public Conteudo(String titulo, String descricao, Nivel nivel) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.nivel = nivel;
        this.cargaHoraria = 0;
        this.percentual = 0;
        this.completo = false;
    }

    public Conteudo(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.cargaHoraria = 0;
        this.percentual = 0;
        this.completo = false;
    }

    public enum Nivel {
        INICIANTE, INTERMEDIARIO, AVANCADO
    }
    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;
    private Boolean completo;
    private Integer percentual;
    private Nivel nivel;
    private Integer cargaHoraria;

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Integer getPercentual() {
        return percentual;
    }

    public void setPercentual(Integer percentual) {
        this.percentual = percentual;
    }

    public Nivel getNivel() {
        return nivel;
    }

    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }

    public Boolean isCompleto() {
        return completo;
    }
    public void setCompleto(Boolean completo) {
        this.completo = completo;
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
}
