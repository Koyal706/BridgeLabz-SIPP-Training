class MovieTicket {
    String movieName;
    String seatNumber;
    double price;

    void bookTicket(String movie, String seat, double price) {
        this.movieName = movie;
        this.seatNumber = seat;
        this.price = price;
        System.out.println("Ticket Booked!");
    }

    void displayDetails() {
        System.out.println("Movie: " + movieName);
        System.out.println("Seat: " + seatNumber);
        System.out.println("Price: ₹" + price);
    }
}

public class Main {
    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket();
        ticket.bookTicket("RRR", "A12", 250);
        ticket.displayDetails();
    }
}
