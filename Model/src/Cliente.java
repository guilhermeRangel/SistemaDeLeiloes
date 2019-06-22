public class Cliente extends Pessoa {

    //singleton
    private static Cliente instancia;

    public Cliente(String nome, String cpf, String email) {
        super(nome, cpf, email);

    }


    public static Cliente getInstance() {
        if (instancia == null) {
            instancia = new Cliente();

        }
        return instancia;
    }

    public static Cliente getInstancia() {
        return instancia;
    }

    public static void setInstancia(Cliente instancia) {
        Cliente.instancia = instancia;
    }

    public Cliente() {
        super();
    }

    @Override
    public String toString() {
        return " nome:  " + getNome() + " cpf:  " + getCpf() + " email:  " + getEmail();
    }
}
