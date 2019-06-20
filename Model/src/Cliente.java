public class Cliente extends Pessoa {


    public Cliente(String nome, String cpf, String email) {
        super(nome, cpf, email);

    }

    public Cliente() {
        super();
    }

    @Override
    public String toString() {
        return "nome:" + getNome() + "cpf" + getCpf() + "email" + getEmail();
    }
}
