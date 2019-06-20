public class Produto {
    private String nomeProduto;
    private String descricao;
    private Double valorInicial;
    private String imagemProduto;







    public Produto(String nomeProduto, String descricao, Double valorInicial) {
        this.nomeProduto = nomeProduto;
        this.descricao = descricao;
        this.valorInicial = valorInicial;

    }




    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValorInicial() {
        return valorInicial;
    }

    public void setValorInicial(Double valorInicial) {
        this.valorInicial = valorInicial;
    }

    public String getImagemProduto() {
        return imagemProduto;
    }

    public void setImagemProduto(String imagemProduto) {
        this.imagemProduto = imagemProduto;
    }


    @Override
    public String toString() {
        return "Produto{" +
                "nomeProduto='" + nomeProduto + '\'' +
                ", descricao='" + descricao + '\'' +
                ", valorInicial=" + valorInicial +
                ", imagemProduto='" + imagemProduto + '\'' +
                '}';
    }
}
