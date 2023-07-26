import java.security.PublicKey;
import java.util.Date;

public class Pessoa {

    private String nome;
    private Date dataNascimento;
    private Integer idade;

    public Pessoa(){
    }

    public Pessoa(String novoNome, Date novaData, Integer novaIdade){
        this.nome = novoNome;
        this.dataNascimento = novaData;
        this.idade = novaIdade;
    }

    public Pessoa(String novoNome){
        this.nome = novoNome;
    }

    public Integer setIdade(Integer novaIdade){
        this.idade = novaIdade;
        return this.idade;
    }

    public String setNome(String novoNome){
        this.nome = novoNome;
        return this.nome;
    }

    public String getNome(){
        return this.nome;
    }

    public Date getDataNascimento(){
        return this.dataNascimento;
    }

    public  Integer getIdade(){
        return this.idade;
    }

}
