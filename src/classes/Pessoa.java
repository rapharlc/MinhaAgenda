package classes;

public class Pessoa {
public String nome;
public String sobrenome;
public String telefone;


    public String getNome() {
       return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public String getTelefone() {
        return telefone
    ;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    } 
    public Pessoa(){

    }   
    public Pessoa(String nome, String sobrenome, String contato){
        this.setNome(nome);
        this.setSobrenome(sobrenome);
        this.setTelefone(telefone);

    }
}
