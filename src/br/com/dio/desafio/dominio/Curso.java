package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{
    @Override
    public double calcularXp() {
        return XP_PADRAO * getCargaHoraria();
    }
    public Curso(String titulo, String descricao, Nivel nivel, Integer cargaHoraria) {
        super(titulo,descricao,nivel,cargaHoraria);
    }
}
