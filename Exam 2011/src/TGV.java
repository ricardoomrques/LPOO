public class TGV extends Comboio {
    private String des_servico = "Servico prioritario.";
    private ServicoABordo servico = new ServicoPrioritario();
    public TGV(String nome) {
        super(nome);
    }

    public ServicoABordo getServicoABordo() {
        return servico;
    }

    public String getDescricaoServico() {
        return des_servico;
    }

    public void setServicoABordo(ServicoABordo servico) {
        this.servico = servico;
        if (servico instanceof ServicoPrioritario) des_servico = "Servico prioritario.";
        else if (servico instanceof ServicoSemEnjoos) des_servico = "Servico sem enjoos.";
    }

    @Override
    public String toString(){
        if (getNumCarruagens() == 1 && getNumLugares() == 1) return "TGV " + getNome() + ", " + getNumCarruagens() + " carruagem, " + getNumLugares() + " lugar, " + getNumPassageiros() + " passageiros";
        else if (getNumCarruagens() == 1) return "TGV " + getNome() + ", " + getNumCarruagens() + " carruagem, " + getNumLugares() + " lugares, " + getNumPassageiros() + " passageiros";
        else if (getNumLugares() == 1) return "TGV " + getNome() + ", " + getNumCarruagens() + " carruagens, " + getNumLugares() + " lugar, " + getNumPassageiros() + " passageiros";
        else return "TGV " + getNome() + ", " + getNumCarruagens() + " carruagens, " + getNumLugares() + " lugares, " + getNumPassageiros() + " passageiros";
    }
}
