public class Pendular extends Comboio {
    private String des_servico = "Servico sem enjoos.";
    private ServicoABordo servico = new ServicoSemEnjoos();;
    public Pendular(String nome) {
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
}
