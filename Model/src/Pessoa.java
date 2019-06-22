public class Pessoa {

    private String nome;
    private String cpf;
    private String email;


    public Pessoa(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public Pessoa() {

    }


    public String getNome() {
        return nome;
    }


    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


}
