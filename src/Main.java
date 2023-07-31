import Pessoa.Pessoa;
import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        Calendar cal = Calendar.getInstance();
        Pessoa aluno = new Pessoa();

        //variables
        String name;
        int year, month, date, choice;

        System.out.print("1.Show default values\n2.Show custom values\nChoose: ");
        choice = keyboard.nextInt();

        if (choice == 1){
            aluno.setBornDate(2010, 6,16); // JULHO = 6 (os meses são -1)
            aluno.setAge(cal.get(Calendar.YEAR) - 2010);
            aluno.setName("Caetano");
        }
        else {
            System.out.println("\nCUSTOM INFOS");
            System.out.print("Type the name: ");
            name = keyboard.next();
            System.out.print("Type the Born Year: ");
            year = keyboard.nextInt();
            System.out.print("Type the Born Month(Numbers): ");
            month = (keyboard.nextInt() - 1);
            System.out.print("Type the Born Date: ");
            date = keyboard.nextInt();

            aluno.setBornDate(year, month, date);
            aluno.setAge(cal.get(Calendar.YEAR) - year);
            aluno.setName(name);

            System.out.print("\n");
        }
        System.out.println("Name: "+ aluno.getName() +
                           "\nAge: " + aluno.getAge() +
                           "\nBorn Date: " + aluno.formatter.format(aluno.getBornDate()));

    }
}