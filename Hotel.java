import java.util.ArrayList;

public class Hotel {
    private String nome;
    private String endereco;
    private ArrayList<Quarto> listaDeQuartos;

    public Hotel(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.listaDeQuartos = new ArrayList<>();
    }

    public void adicionarQuarto(Quarto quarto) {
        listaDeQuartos.add(quarto);
    }

    public void removerQuarto(Quarto quarto) {
        listaDeQuartos.remove(quarto);
    }

    public ArrayList<Quarto> listarQuartosDisponiveis() {
        ArrayList<Quarto> quartosDisponiveis = new ArrayList<>();
        for (Quarto quarto : listaDeQuartos) {
            if (quarto.isDisponivel()) {
                quartosDisponiveis.add(quarto);
            }
        }
        return quartosDisponiveis;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }
}
