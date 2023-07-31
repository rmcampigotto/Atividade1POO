import Pessoa.Pessoa;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        Pessoa aluno = new Pessoa();
        int year = 2010;

        aluno.setBornDate(year, 6,16); // JULHO = 8 (os meses são +1)
        aluno.setAge(cal.get(Calendar.YEAR) - year);
        aluno.setName("Caetano");

        System.out.println("Name: "+ aluno.getName() +
                           "\nAge: " + aluno.getAge() +
                           "\nBorn Date: " + aluno.formatter.format(aluno.getBornDate()));

    }
}