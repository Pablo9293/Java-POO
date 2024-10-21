public class Quarto {
    private int numero;
    private String tipo;
    private double preco;
    private boolean estaDisponivel;

    public Quarto(int numero, String tipo, double preco) {
        this.numero = numero;
        this.tipo = tipo;
        this.preco = preco;
        this.estaDisponivel = true; // Inicialmente, o quarto está disponível.
    }

    public void reservar() {
        this.estaDisponivel = false;
    }

    public void liberar() {
        this.estaDisponivel = true;
    }

    public boolean isDisponivel() {
        return estaDisponivel;
    }

    public int getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPreco() {
        return preco;
    }
}
