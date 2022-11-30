package test.java;

import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Mentoria;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.time.LocalDate;

public class MentoriaTest {
    @Test
    public void createMentoria(){
        Mentoria mentoria = new Mentoria("titulo","descricao", Conteudo.Nivel.INICIANTE,2, LocalDate.of(2022,11,30));
        assertMentoriaValues(mentoria, "titulo","descricao", Conteudo.Nivel.INICIANTE,2, LocalDate.of(2022,11,30));
    }
    @Test
    public void editMentoria(){
        Mentoria mentoria = new Mentoria("titulo","descricao", Conteudo.Nivel.INICIANTE,2, LocalDate.of(2022,11,30));

        mentoria.setCargaHoraria(5);
        mentoria.setNivel(Conteudo.Nivel.INTERMEDIARIO);
        mentoria.setDescricao("descricao do mentoria");
        mentoria.setTitulo("titulo do mentoria");
        mentoria.setData(LocalDate.of(2022,11,15));

        assertMentoriaValues(mentoria, "titulo do mentoria","descricao do mentoria", Conteudo.Nivel.INTERMEDIARIO,5, LocalDate.of(2022,11,15));
    }
    public static void assertMentoriaValues(Mentoria mentoria,
                                             String titulo,
                                             String descricao,
                                             Conteudo.Nivel nivel,
                                             int cargaHoraria,
                                             LocalDate data) {
        Assertions.assertEquals(titulo, mentoria.getTitulo());
        Assertions.assertEquals(descricao, mentoria.getDescricao());
        Assertions.assertEquals(nivel, mentoria.getNivel());
        Assertions.assertEquals(cargaHoraria, mentoria.getCargaHoraria());
        Assertions.assertEquals(data, mentoria.getData());
    }
}
