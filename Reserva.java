import java.util.Date;

public class Reserva {
    private Cliente cliente;
    private Quarto quarto;
    private Date dataCheckIn;
    private Date dataCheckOut;

    public Reserva(Cliente cliente, Quarto quarto, Date checkIn, Date checkOut) {
        this.cliente = cliente;
        this.quarto = quarto;
        this.dataCheckIn = checkIn;
        this.dataCheckOut = checkOut;
    }

    public void confirmarReserva() {
        quarto.reservar();
        System.out.println("Reserva confirmada para " + cliente.getNome());
    }

    public void cancelarReserva() {
        quarto.liberar();
        System.out.println("Reserva cancelada.");
    }
}
