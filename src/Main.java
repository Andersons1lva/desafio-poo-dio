import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso = new Curso();
        Mentoria mentoria = new Mentoria();

        curso.setTitulo("Poo");
        curso.setDescricao("Curso Java");
        curso.setCargaHoraria(45);

        mentoria.setTitulo("Spring");
        mentoria.setData(LocalDate.now());
        mentoria.setDescricao("Bootcamp Spring framework");

        /*System.out.println(curso);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Jave Developer");
        bootcamp.setDescricacao("Desafio dio POO");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(mentoria);

        Dev devAnderson = new Dev();
        Dev devBryan = new Dev();

        devAnderson.setNome("Anderson");
        devAnderson.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + devAnderson.getConteudosInscritos());
        devAnderson.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Concluidos" + devAnderson.getConteudosConcluidos());
        System.out.println("XP: " + devAnderson.calcularTotalXp());


        System.out.println("------------------------");


        devBryan.setNome("Bryan");
        devBryan.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + devBryan.getConteudosInscritos());
        devBryan.progredir();
        devBryan.progredir();
        devBryan.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Concluidos" + devBryan.getConteudosConcluidos());
        System.out.println("XP: " + devBryan.calcularTotalXp());





    }

}
