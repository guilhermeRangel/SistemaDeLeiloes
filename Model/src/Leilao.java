import java.util.ArrayList;
import java.util.Date;

public class Leilao {
    private Date inicio;
    private Date fim;
    private Produto produto;
    private ArrayList<Proposta> propostas = new ArrayList<>();
    private Cliente currentCliente;
    private boolean status;


    public Leilao(Produto produto, ArrayList<Proposta> propostas, Cliente currentCliente, boolean status) {

        this.produto = produto;
        this.propostas = propostas;
        this.currentCliente = currentCliente;
        this.status = status;
    }





    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public ArrayList<Proposta> getPropostas() {
        return propostas;
    }

    public void setPropostas(ArrayList<Proposta> propostas) {
        this.propostas = propostas;
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
