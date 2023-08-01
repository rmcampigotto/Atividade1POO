import Pessoa.Pessoa;
import java.util.Calendar;
import javax.swing.JOptionPane;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        Pessoa aluno = new Pessoa();

        //variables
        String name;
        int year, month, date, choice, choice2;

        choice = parseInt(JOptionPane.showInputDialog("1.Show default values\n2.Show custom values\nChoose: "));

        if (choice == 1){
            aluno.setBornDate(2010, 6,16); // JULHO = 6 (os meses são -1)
            aluno.setAge(cal.get(Calendar.YEAR) - 2010);
            aluno.setName("Caetano");
        }
        else {
            name = JOptionPane.showInputDialog("Type the name:");
            year = parseInt(JOptionPane.showInputDialog("Type the Born Year:"));
            month = (parseInt(JOptionPane.showInputDialog("Type the Born Month:")) - 1);
            date = parseInt(JOptionPane.showInputDialog("Type the Born Date:"));

            if ((choice2 = JOptionPane.showConfirmDialog(null, "Confirm the alterations?")) == 0) {
                aluno.setBornDate(year, month, date);
                aluno.setAge(cal.get(Calendar.YEAR) - year);
                aluno.setName(name);
            }else {
                aluno.setBornDate(2010, 6,16); // JULHO = 6 (os meses são -1)
                aluno.setAge(cal.get(Calendar.YEAR) - 2010);
                aluno.setName("Caetano");
            }
        }
        JOptionPane.showMessageDialog(null, "NAME: "+ aluno.getName() +
                "\nAGE: " + aluno.getAge() +
                "\nBORN DATE: " + aluno.formatter.format(aluno.getBornDate()), "INFO'S", 1);

    }
}