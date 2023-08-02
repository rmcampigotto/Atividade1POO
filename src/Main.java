import Aluno.Aluno;
import Professor.Professor;
import java.util.Calendar;
import javax.swing.JOptionPane;
import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        Aluno aluno = new Aluno();
        Professor professor = new Professor();

        //variables
        String name;
        int year, month, date, choice, choice2;

        choice = parseInt(JOptionPane.showInputDialog("1.Show default Student values\n2.Show custom Student values\n3.Show custom Professor values\nChoose: "));

        if (choice == 3){
            professor.setName(JOptionPane.showInputDialog("Insert the Professor Name:"));
            professor.setAge(parseInt(JOptionPane.showInputDialog("Insert the Professor Age:")));
            professor.setMat(JOptionPane.showInputDialog("Insert the Professor Mat:"));

            JOptionPane.showMessageDialog(null, "NAME: "+ professor.getName() +
                    "\nAGE: " + professor.getAge() +
                    "\nMAT:" + professor.getMat(), "INFO'S", 1);

            return;
        }

        if (choice == 1){
            aluno.setBornDate(2010, 6,16); // JULHO = 6 (os meses são -1)
            aluno.setAge(cal.get(Calendar.YEAR) - 2010);
            aluno.setName("Caetano");
        }
        else{
            name = JOptionPane.showInputDialog("Type the name:");
            year = parseInt(JOptionPane.showInputDialog("Type the Born Year:"));
            month = (parseInt(JOptionPane.showInputDialog("Type the Born Month:")) - 1);
            date = parseInt(JOptionPane.showInputDialog("Type the Born Date:"));

            if ((choice2 = JOptionPane.showConfirmDialog(null, "Confirm the alterations?", "CONFIRM", 2)) == 0) {
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
                "\nBORN DATE: " + aluno.formatter.format(aluno.getBornDate())+
                "\nRA:" + aluno.getRa(), "INFO'S", 1);

    }
}