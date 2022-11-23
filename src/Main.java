import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {

        //-- Cria objetos do tipo Curso (Classe Curso)
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso de Java da Dio.me");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Curso de JavaScript da Dio.me");
        curso2.setCargaHoraria(4);

        //-- Cria objetos do tipo Mentoria (Classe Mentoria)
        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Mentoria do curso de Java da Dio.me");
        mentoria1.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria de JavaScript");
        mentoria2.setDescricao("Mentoria do curso de JavaScript da Dio.me");
        mentoria2.setData(LocalDate.now());

        //-- Cria objeto do tipo Bootcamp
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Treinamento Web");
        bootcamp.setDescricao("Bootcamp de Web developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        //-- Cria objetos do tipo Dev (Alunos do Bootcamp)
        Dev dev1 = new Dev();
        dev1.inscreverBootcamp(bootcamp);
        dev1.setNome("Moises");
        dev1.progredir();
        dev1.progredir();

        Dev dev2 = new Dev();
        dev2.inscreverBootcamp(bootcamp);
        dev2.setNome("Fontana");
        dev2.progredir();

        System.out.println("------------------");

        System.out.println("Conteúdos inscritos aluno " + dev1.getNome() + ": " + dev1.getConteudosInscritos());
        System.out.println("Conteúdos concluídos aluno " + dev1.getNome() + ": " + dev1.getConteudosConcluidos());
        System.out.println("XP do aluno " + dev1.getNome() + ": " + dev1.calcularXp());
        System.out.println("Dias restantes para concluir o Bootcamp: " + diasRestantesBootcamp(LocalDate.now(), bootcamp.getDataFinal()));

        System.out.println("------------------");

        System.out.println("Conteúdos inscritos aluno " + dev2.getNome() + ": " + dev2.getConteudosInscritos());
        System.out.println("Conteúdos concluídos aluno " + dev2.getNome() + ": " + dev2.getConteudosConcluidos());
        System.out.println("XP do aluno " + dev1.getNome() + ": " + dev1.calcularXp());

    }

    //-- Método que calcula dias restantes do Bootcamp
    public static long diasRestantesBootcamp(LocalDate dataHoje, LocalDate dataFinal){
        long diasRestantes = ChronoUnit.DAYS.between(dataHoje, dataFinal);
        return diasRestantes;
    }
}