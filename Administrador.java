public class Administrador {
    private String nome;
    private String id;

    public Administrador(String nome, String id) {
        this.nome = nome;
        this.id = id;
    }

    public void adicionarHotel(SistemaReservas sistema, String nomeHotel, String enderecoHotel) {
        Hotel novoHotel = new Hotel(nomeHotel, enderecoHotel);
        sistema.adicionarHotel(novoHotel);
        System.out.println("Hotel " + nomeHotel + " adicionado com sucesso.");
    }

    public void removerHotel(SistemaReservas sistema, Hotel hotel) {
        sistema.removerHotel(hotel);
        System.out.println("Hotel " + hotel.getNome() + " removido com sucesso.");
    }

    public void adicionarQuarto(Hotel hotel, int numero, String tipo, double preco) {
        Quarto novoQuarto = new Quarto(numero, tipo, preco);
        hotel.adicionarQuarto(novoQuarto);
        System.out.println("Quarto " + numero + " adicionado com sucesso no hotel " + hotel.getNome());
    }
}
