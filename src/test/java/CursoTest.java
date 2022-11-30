package test.java;

import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;
import com.github.javafaker.Faker;

public class CursoTest {
    @Test
    public void createCurso(){
        Curso curso = new Curso("titulo","descricao", Conteudo.Nivel.INICIANTE,2);
        assertCursoValues(curso, "titulo","descricao", Conteudo.Nivel.INICIANTE,2);
    }

    @Test
    public void editCurso(){
        Curso curso = new Curso("titulo","descricao", Conteudo.Nivel.INICIANTE,2);

        curso.setNivel(Conteudo.Nivel.INTERMEDIARIO);
        curso.setDescricao("descricao do curso");
        curso.setTitulo("titulo do curso");

        assertCursoValues(curso, "titulo do curso","descricao do curso", Conteudo.Nivel.INTERMEDIARIO,2);

    }

        public static void assertCursoValues(Curso curso,
                                             String titulo,
                                             String descricao,
                                             Conteudo.Nivel nivel,
                                             Integer cargaHoraria ) {
        Assertions.assertEquals(titulo, curso.getTitulo());
        Assertions.assertEquals(descricao, curso.getDescricao());
        Assertions.assertEquals(nivel, curso.getNivel());
        Assertions.assertEquals(cargaHoraria, curso.getCargaHoraria());
    }
}
