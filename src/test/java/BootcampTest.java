package test.java;

import br.com.dio.desafio.dominio.*;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import static test.java.CursoTest.assertCursoValues;
import static test.java.MentoriaTest.assertMentoriaValues;

public class BootcampTest {
    @Test
    public void createBootCamp(){
        Set<Dev> devsInscritos = new HashSet<Dev>();
        Set<Modulo> modulos = new LinkedHashSet<Modulo>();

        Bootcamp bootcamp = new Bootcamp("titulo","descricao", Conteudo.Nivel.INICIANTE,devsInscritos, modulos);
        assertBootcampValues(bootcamp, "titulo","descricao", Conteudo.Nivel.INICIANTE,0, 100, true,devsInscritos, modulos);
    }

    @Test
    public void createBootcampComAtividades(){
        Set<Dev> devsInscritos = new HashSet<Dev>();
        Set<Modulo> modulos = new LinkedHashSet<Modulo>();

        Bootcamp bootcamp = new Bootcamp("titulo","descricao", Conteudo.Nivel.INICIANTE,devsInscritos, modulos);

        Modulo modulo = new Modulo("titulo do Modulo");

        Curso curso = new Curso("titulo do curso","descricao do curso", Conteudo.Nivel.INICIANTE,2);
        modulo.setCursos(curso);

        Mentoria mentoria = new Mentoria("titulo do mentoria","descricao do mentoria", Conteudo.Nivel.INICIANTE,2, LocalDate.of(2022,11,30));
        modulo.setMentorias(mentoria);

        bootcamp.setModulos(modulo);

        Modulo modulo2 = new Modulo("titulo do Modulo2");

        Curso curso2 = new Curso("titulo do curso2","descricao do curso", Conteudo.Nivel.INICIANTE,2);
        Curso curso3 = new Curso("titulo do curso3","descricao do curso", Conteudo.Nivel.INICIANTE,2);
        modulo.setCursos(curso);
        assertBootcampValues(bootcamp, "titulo","descricao", Conteudo.Nivel.INICIANTE,8, 0, false,devsInscritos, modulos);
    }

    public static void assertBootcampValues(Bootcamp bootcamp,
                                            String titulo,
                                            String descricao,
                                            Conteudo.Nivel nivel,
                                            Integer cargaHoraria,
                                            Integer percentual,
                                            Boolean isCompleto,
                                            Set<Dev> devsInscritos,
                                            Set<Modulo> modulos) {
        Assertions.assertEquals(titulo, bootcamp.getTitulo());
        Assertions.assertEquals(descricao, bootcamp.getDescricao());
        Assertions.assertEquals(nivel, bootcamp.getNivel());
        Assertions.assertEquals(cargaHoraria, bootcamp.getCargaHoraria());
//        Assertions.assertEquals(percentual, bootcamp.getPercentual());
        Assertions.assertEquals(isCompleto, bootcamp.isCompleto());
    }
}
