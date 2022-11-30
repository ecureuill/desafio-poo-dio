package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Set;

public class Modulo{
    private boolean completo;
    private String titulo;

    public Modulo(String titulo) {
        this.titulo = titulo;
        this.cursos = new LinkedHashSet<Curso>();
        this.mentorias = new LinkedHashSet<Mentoria>();
        this.completo = false;
    }
    private Set<Curso> cursos;

    public boolean isCompleto() {
        return completo;
    }

    public String getTitulo() {
        return titulo;
    }

    private Set<Mentoria> mentorias;
//    private Set<Desafio> desafios;

    public Set<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(Curso curso) {
        this.cursos.add(curso);
//        setCargaHoraria(getCargaHoraria() + curso.getCargaHoraria());
    }

    public Set<Mentoria> getMentorias() {
        return mentorias;
    }

    public void setMentorias(Mentoria mentoria) {
        this.mentorias.add(mentoria);
//        setCargaHoraria(getCargaHoraria() + mentoria.getCargaHoraria());

    }

    public int getTotalCargaHoraria(){
        int cargaHorariaTotal = 0;
        for (Curso curso : this.cursos)
            cargaHorariaTotal = cargaHorariaTotal + curso.getCargaHoraria();

        for (Mentoria mentoria : this.mentorias)
            cargaHorariaTotal = cargaHorariaTotal + mentoria.getCargaHoraria();

        return  cargaHorariaTotal;

    }

    public int getTotalAtividades(){
        return cursos.size() + mentorias.size();
    }

}