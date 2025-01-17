package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Stream;

public class Bootcamp{
    private String titulo;
    private String descricao;
    private Conteudo.Nivel nivel;

    public Bootcamp(String titulo, String descricao, Conteudo.Nivel nivel) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.nivel = nivel;
    }

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

    public Conteudo.Nivel getNivel() {
        return nivel;
    }

    public void setNivel(Conteudo.Nivel nivel) {
        this.nivel = nivel;
    }

    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45);
    private Set<Dev> devsInscritos = new HashSet<Dev>();
    private Set<Modulo> modulos = new LinkedHashSet<Modulo>();

    public Integer getCargaHoraria(){
        Integer totalCargaHoraria = 0;
        for (Modulo modulo : this.modulos)
            totalCargaHoraria = totalCargaHoraria + modulo.getTotalCargaHoraria();

        return  totalCargaHoraria;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    public void setDevsInscritos(Set<Dev> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }

    public Set<Modulo> getModulos() {
        return modulos;
    }

    public void setModulos(Modulo modulo) {
        this.modulos.add(modulo);
    }

    @Override
    public String toString(){
        return "BootCamp" + getTitulo() + '\n' +
                "\tdescricao: " + getDescricao() + '\n' +
                "\tnivel: " + getNivel().toString() + '\n' +
                "\tcarga horaria: " + getCargaHoraria() + '\n' +
                "\tData: " + getDataInicial() + "-"+ getDataFinal() + "\n" +
                "\tinscritos: " + "" + '\n' +
                "\t******** Modulos ********* \n" +
                modulos.toString();

    }
}
