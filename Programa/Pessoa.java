package Programa;

public class Pessoa{
    private int identidade;
    private String nome;
    private long cpf;
    private String email;
    private long data_nascimento;

    public Pessoa() {}

    public int getIdentidade(){
        return identidade;
    }
    public void setIdentidade(int identidade){
        this.identidade = identidade;
    }

    public String getNome(){ 
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public long getCpf(){
        return cpf;
    }
    public void setCpf(long cpf){
        this.cpf = cpf;
    }

    public String getEmail(){
        return email;
    } 
    public void setEmail(String email) {
        this.email = email;
    }

    public long getData_nascimento() {
        return data_nascimento;
    }
    public void setData_nascimento(long data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

public void atualizar_dados(){

}
}