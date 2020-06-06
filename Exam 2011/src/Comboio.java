import java.util.ArrayList;
import java.util.List;

public class Comboio {
    private String nome;
    private int lugares_livres;
    private int passageiros;
    private ServicoABordo servico = new ServicoRegular();
    private String des_servico = "Servico regular.";
    private List<Carruagem> carruagens = new ArrayList<>();
    public Comboio(String nome) {
        this.nome = nome;
        lugares_livres = 0;
        passageiros = 0;
    }

    public String getNome() {
        return nome;
    }

    public int getNumLugares() {
        int result = 0;
        for (Carruagem carr : carruagens) result += carr.getNumLugares();
        return result;
    }

    public int getNumCarruagens() {
        return carruagens.size();
    }

    public void addCarruagem(Carruagem c) {
        carruagens.add(c);
        lugares_livres += c.getNumLugares();
    }

    public Carruagem getCarruagemByOrder(int ind) {
        for (int i = 0; i < carruagens.size(); i++) if (i == ind) return carruagens.get(i);
        return new Carruagem(0);
    }

    public void removeAllCarruagens(int capacity) {
        carruagens.removeIf(carr -> carr.getNumLugares() == capacity);
    }

    public int getNumPassageiros() {
        return passageiros;
    }

    public void addPassageiros(int num) throws PassengerCapacityExceeded {
        if (passageiros + num > getNumLugares()) throw new PassengerCapacityExceeded();
        passageiros += num;
        lugares_livres -= num;
    }

    public int getLugaresLivres() {
        return lugares_livres;
    }

    public void removePassageiros() {
        passageiros = 0;
    }

    public void removePassageiros(int num) {
        passageiros -= num;
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
        if (getNumCarruagens() == 1 && getNumLugares() == 1) return "Comboio " + nome + ", " + getNumCarruagens() + " carruagem, " + getNumLugares() + " lugar, " + getNumPassageiros() + " passageiros";
        else if (getNumCarruagens() == 1) return "Comboio " + nome + ", " + getNumCarruagens() + " carruagem, " + getNumLugares() + " lugares, " + getNumPassageiros() + " passageiros";
        else if (getNumLugares() == 1) return "Comboio " + nome + ", " + getNumCarruagens() + " carruagens, " + getNumLugares() + " lugar, " + getNumPassageiros() + " passageiros";
        else return "Comboio " + nome + ", " + getNumCarruagens() + " carruagens, " + getNumLugares() + " lugares, " + getNumPassageiros() + " passageiros";
    }

    @Override
    public boolean equals(Object obj) {
        Comboio c = (Comboio) obj;
        if (this.getNumCarruagens() == 0 && ((Comboio) obj).getNumCarruagens() == 0) return true;
        else if (this.getNumCarruagens() != ((Comboio) obj).getNumCarruagens()) return false;
        for (int i = 0; i < this.carruagens.size(); i++) {
            if (carruagens.get(i).getNumLugares() != ((Comboio) obj).carruagens.get(i).getNumLugares()) return false;
        }
        return true;
    }
}
