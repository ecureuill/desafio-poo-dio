package test.java;

import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;
import br.com.dio.desafio.dominio.Modulo;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;

import java.time.LocalDate;

import static test.java.CursoTest.assertCursoValues;
import static test.java.MentoriaTest.assertMentoriaValues;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ModuloTest {

    @Test
    @Order(1)
    public void createModulo(){
        Modulo modulo = new Modulo("titulo");
        assertModuloValues(modulo, "titulo", false, 0, 0);
    }

    public static void assertModuloValues(
            Modulo modulo,
            String titulo,
            Boolean isCompleto,
            Integer totalAtividades,
            Integer cargaHoraria) {
        Assertions.assertEquals(titulo, modulo.getTitulo());
        Assertions.assertEquals(isCompleto, modulo.isCompleto());
        Assertions.assertEquals(totalAtividades, modulo.getTotalAtividades());
        Assertions.assertEquals(cargaHoraria, modulo.getTotalCargaHoraria());
    }

    @Test
    @Order(2)
    public void addCourse(){
        Modulo modulo = new Modulo("titulo");
        Curso curso = new Curso("titulo do curso","descricao do curso", Conteudo.Nivel.INICIANTE,2);

        modulo.setCursos(curso);
        Assertions.assertTrue(modulo.getCursos().size() == 1);

        Curso addedCurso =  modulo.getCursos().iterator().next();
        assertCursoValues(addedCurso, "titulo do curso","descricao do curso", Conteudo.Nivel.INICIANTE,2, 0, false);
        assertModuloValues(modulo, "titulo", false, 1, 2);

        Curso curso2 = new Curso("titulo do curso 2","descricao do curso 2", Conteudo.Nivel.INICIANTE,3);
        modulo.setCursos(curso2);
        Assertions.assertTrue(modulo.getCursos().size() == 2);

        assertModuloValues(modulo, "titulo", false, 2, 5);
    }

    @Test
    @Order(3)
    public void addMentoriaAndCourse(){
        Modulo modulo = new Modulo("titulo do Modulo");
        Curso curso = new Curso("titulo do curso","descricao do curso", Conteudo.Nivel.INICIANTE,2);
        modulo.setCursos(curso);

        Mentoria mentoria = new Mentoria("titulo do mentoria","descricao do mentoria", Conteudo.Nivel.INICIANTE,2, LocalDate.of(2022,11,30));
        modulo.setMentorias(mentoria);
        Assertions.assertTrue(modulo.getMentorias().size() == 1);

        Curso addedCurso =  modulo.getCursos().iterator().next();
        assertCursoValues(addedCurso, "titulo do curso","descricao do curso", Conteudo.Nivel.INICIANTE,2, 0, false);


        Mentoria addedMentoria =  modulo.getMentorias().iterator().next();
        assertMentoriaValues(addedMentoria, "titulo do mentoria","descricao do mentoria", Conteudo.Nivel.INICIANTE,2, 0, false, LocalDate.of(2022,11,30));

        assertModuloValues(modulo, "titulo do Modulo", false, 2, 4);
    }
}

