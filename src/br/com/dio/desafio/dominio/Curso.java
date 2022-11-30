package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{
    @Override
    public double calcularXp() {
        return XP_PADRAO * getCargaHoraria();
    }
    public Curso(String titulo, String descricao, Nivel nivel, Integer cargaHoraria) {
        super(titulo,descricao,nivel,cargaHoraria);
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + getCargaHoraria() +
                ", nível=" + getNivel() +
                ", completo=" + isCompleto() +
                ", percentual=" + getPercentual() +
                '}';
    }
}
