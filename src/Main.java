import Pessoa.Pessoa;

public class Main {
    public static void main(String[] args) {

        Pessoa aluno = new Pessoa();

        aluno.setAge(10);
        aluno.setName("Caetano");
        aluno.setBornDate(2010, 8,16); // JULHO = 8 (os meses são +1)

        System.out.println("Name: "+ aluno.getName() +
                           "\nAge: " + aluno.getAge() +
                           "\nBorn Date: " + aluno.formatter.format(aluno.getBornDate()));

    }
}