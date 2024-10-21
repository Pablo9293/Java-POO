public class Cliente {
    private String nome;
    private String email;
    private String telefone;

    public Cliente(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void fazerReserva(Hotel hotel, Quarto quarto, Date checkIn, Date checkOut) {
        Reserva reserva = new Reserva(this, quarto, checkIn, checkOut);
        reserva.confirmarReserva();
    }

    public void cancelarReserva(Reserva reserva) {
        reserva.cancelarReserva();
    }
}
