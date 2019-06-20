public class Proposta {

    private Cliente cli;
    private Double valorLance;

    public Proposta(Cliente cli, Double valorLance) {
        this.cli = cli;
        this.valorLance = valorLance;
    }

    public Cliente getCli() {
        return cli;
    }

    public void setCli(Cliente cli) {
        this.cli = cli;
    }

    public Double getValorLance() {
        return valorLance;
    }

    public void setValorLance(Double valorLance) {
        this.valorLance = valorLance;
    }


    @Override
    public String toString() {
        return "Proposta{" +
                "cli=" + cli +
                ", valorLance=" + valorLance +
                '}';
    }
}
