import java.time.LocalDateTime;

public class Reservation {
    private final int reservationId; 
    private final LocalDateTime reservationDate;
    private Customer customer;

    public Reservation(int reservationId, LocalDateTime reservationDate, Customer customer) {
        this.reservationId = reservationId;
        this.reservationDate = reservationDate;
        this.customer = customer;
    }

    public int getReservationId() {
        return reservationId;
    }

    public LocalDateTime getReservationDate() {
        return reservationDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void printReservation() {
        System.out.println("\nReservation ID: " + reservationId);
        System.out.println("Reservation Date: " + reservationDate);
        System.out.println("Customer Info:");
        customer.printProfile();  
    }

    @Override
    public String toString() {
        return "Reservation [reservationId=" + reservationId + ", reservationDate=" + reservationDate + ", customer="
                + customer + "]";
    }




    
    
}
