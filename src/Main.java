import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso("Introdução ao Mercado de Qualidade de Software","descrição curso java",Conteudo.Nivel.INICIANTE, 2);
        Curso curso2 = new Curso("O caminho pra a certificação CTFL","descrição curso java",Conteudo.Nivel.INTERMEDIARIO, 2);

        Modulo modulo = new Modulo("Fundamentos de Qualidade de Software");
        modulo.setCursos(curso1);
        modulo.setCursos(curso2);

        Mentoria mentoria = new Mentoria("Dominando Programação Orientada a Objetos com Java", "A POO nos permite criar softwares com um constante aprimoramento do processo, sem que isso implique um rearranjo de todo o sistema. Com isso, nesta mentoria estudaremos na prática os principais conceitos desse paradigma de programação mais utilizado no mercado.", Conteudo.Nivel.INTERMEDIARIO, 1, LocalDate.now());

        Modulo modulo2 = new Modulo("Programação Orientada a Objetos com Java");
        modulo2.setMentorias(mentoria);

        Bootcamp bootcamp = new Bootcamp(
                "GFT Quality Assurance Para Mulheres",
                "O bootcamp ideal para pessoas que se identificam como mulheres e que estão buscando uma primeira oportunidade no mercado de TI, migração de carreira ou até mesmo júniores em busca de crescimento profissional e uma maior oportunidade na GFT. Com o objetivo de ensinar e graduar até mesmo quem nunca viu nada sobre o assunto, o bootcamp chegou para ser uma excelente porta de entrada para quem deseja aprender de verdade e construir uma carreira na área de Quality Assurance.",
                Conteudo.Nivel.INICIANTE);
        bootcamp.setModulos(modulo);
        bootcamp.setModulos(modulo2);

        System.out.println(bootcamp.toString());

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());

        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());

    }

}
