package Professor;

public class Professor {

    private String name;
    private Integer age;
    private String mat;

    public Professor(){}
    public Professor(String name, Integer age, String mat){
        this.name = name;
        this.age = age;
        this.mat = mat;
    }

    public String getName(){
        return this.name;
    }
    public Integer getAge(){
        return this.age;
    }
    public String getMat(){
        return this.mat;
    }

    public String setName(String name){
        this.name = name;
        return this.name;
    }

    public Integer setAge(Integer age){
        this.age = age;
        return this.age;
    }

    public String setMat(String mat){
        this.mat = mat;
        return this.mat;
    }

}
