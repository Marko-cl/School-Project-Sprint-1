import java.time.LocalDateTime;
import java.util.ArrayList;

public class BookingManager {

    public static void main(String[] args) {

        ArrayList<Reservation> reservations = new ArrayList<>();

        reservations.add(new Reservation(1, LocalDateTime.now(), Customer.Customer1));
        reservations.add(new Reservation(2, LocalDateTime.now(), Customer.Customer2));
        reservations.add(new Reservation(3, LocalDateTime.now(), Customer.Customer3));

        for (Reservation r : reservations) {
            r.printReservation();
        }
    }
}
