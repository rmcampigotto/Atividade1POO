package Aluno;
import Pessoa.Pessoa;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Aluno {

    private String name;
    private Date bornDate;
    public SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    private Integer age;
    private Integer ra;

    public Aluno(){
    }

    public Aluno(String newName, Date newDate, Integer newAge){
        this.name = newName;
        this.bornDate = newDate;
        this.age = newAge;
    }

    public Aluno(String newName){
        this.name = newName;
    }

    public Integer setAge(Integer newAge){
        this.age = newAge;
        return this.age;
    }

    public String setName(String newName){
        this.name = newName;
        return this.name;
    }

    public Date setBornDate(Integer year, Integer month, Integer date){
        this.bornDate = new Date(year - 1900, month, date);
        return this.bornDate;
    }

    public String getName(){
        return this.name;
    }

    public Date getBornDate(){
        return this.bornDate;
    }

    public Integer getAge(){
        return this.age;
    }

    public Integer getRa() {
        return this.ra;
    }
}
