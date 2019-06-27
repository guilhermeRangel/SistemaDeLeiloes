public class Proposta {

    private String cli;
    private Double valorLance;

    public Proposta(String cli, Double valorLance) {
        this.cli = cli;
        this.valorLance = valorLance;
    }

    public Proposta(String clinteProposta) {

    }

    public String getCli() {
        return cli;
    }

    public void setCli(String cli) {
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
