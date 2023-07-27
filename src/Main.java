import Pessoa.Pessoa;

public class Main {
    public static void main(String[] args) {

        Pessoa aluno = new Pessoa();

        aluno.setIdade(10);
        aluno.setNome("Caetano");

        System.out.println(aluno.getNome());

    }
}