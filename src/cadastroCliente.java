import java.util.Date;

public class cadastroCliente {
    private String nome;
    private int idade;
    private int cpf;
    private int cep;

    public cadastroCliente() {
    }

    public int getCpf(int i) {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getCep(int i) {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;


    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public int getIdade() {

        return idade;
    }

    public void setIdade(int idade) {

        this.idade = idade;
    }

    Date data = new Date();


    public String getDados() {
        return "Nome: " + this.nome +"\nIdade: " + this.idade +"\nCPF: " + this.cpf + "\nCep: " + this.cep + "\nConsultado em:  " + data +
                "\n------------------------------------------------------------------------------";

    }


}




