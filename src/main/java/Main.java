import com.dio.model.*;

public class Main {
    public static void main(String[] args) {

        Conteudo curso1 = new Curso();
        curso1.setDescricao("Orientação objetos");
        curso1.setTitulo("POO");

        Conteudo curso2 = new Mentoria();
        curso2.setTitulo("Mentoria 1");
        curso2.setDescricao("Mentoria");

        Dev dev1 = new Dev();
        dev1.setNome("Paulo");

        Dev dev = new Dev();
        dev.setNome("Joao");

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java depveloper");
        bootcamp.setDescricao("Descricao do bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);

        dev.inscrever(bootcamp);
        dev1.inscrever(bootcamp);



    }
}
