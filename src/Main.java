import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("Descrição Curso Js");
        curso2.setCargaHoraria(4);

        Conteudo conteudo = new Curso();
        // tudo que tem em conteúdo tem em curso, mas nem tudo que tem em curso tem em conteudo
        // como a classe conteudo é abstracta ela não pode ser instanciada em outra classe
        // classe curso extende a classe conteudo

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Descrição da mentoria de Java");
        mentoria1.setData(LocalDate.now()); // No momento que criar esse objeto pelo now, vai atribuir a data de criação

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila"+ devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Concluídos Camila"+ devCamila.getConteudosConcluidos());
        System.out.println("Conteúdos Inscritos Camila"+ devCamila.getConteudosInscritos());
        System.out.println("XP:"+devCamila.calcularXp());

        System.out.println("---------------------");

        Dev devMarcos = new Dev();
        devMarcos.setNome("Marcos");
        devMarcos.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Marcos"+ devMarcos.getConteudosInscritos());
        devMarcos.progredir();
        devMarcos.progredir();
        devMarcos.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Concluídos Marcos"+ devMarcos.getConteudosConcluidos());
        System.out.println("Conteúdos Inscritos Marcos"+ devMarcos.getConteudosInscritos());
        System.out.println("XP:"+devMarcos.calcularXp());
    }
}
