import java.util.ArrayList;


public class Leilao {
    private Produto produto;
    private ArrayList<Proposta> propostas = new ArrayList<>();
    private Cliente currentCliente;
    private boolean status;
    private int numeroLeilao;


    public Leilao(Produto produto,  Cliente currentCliente, boolean status, ArrayList<Proposta> propostas) {

        this.propostas = propostas;
        this.produto = produto;
        this.currentCliente = currentCliente;
        this.status = status;
    }


    public Leilao(Produto produto,  Cliente currentCliente, boolean status) {


        this.produto = produto;
        this.currentCliente = currentCliente;
        this.status = status;
    }



    public void setNleilao(int i){
        numeroLeilao = i;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public ArrayList<Proposta> getListaDePropostas() {
        return propostas;
    }

    public void setPropostas(Proposta p) {
        propostas.add(p);
    }

    public Cliente getCurrentCliente() {
        return currentCliente;
    }

    public void setCurrentCliente(Cliente currentCliente) {
        this.currentCliente = currentCliente;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }



    @Override
    public String toString() {
        return "Leilao{" +
                ", produto=" + produto +
                ", propostas=" + propostas +
                ", currentCliente=" + currentCliente +
                ", status=" + status +
                '}';
    }
}
