public class Ticket {
    private final int filmID;
    private String title;
    private String showTime;
    private double price;
    private int seatNumber;
    private String showDate;
    private boolean available;

   
    public Ticket(int filmID, String title, String showTime, double price, int seatNumber,
                  String showDate, boolean available) {
        this.filmID = filmID;
        this.title = title;
        this.showTime = showTime;
        this.price = price;
        this.seatNumber = seatNumber;
        this.showDate = showDate;
        this.available = available;
    }

   
    public static Ticket film1 = new Ticket(1, "Edge of Night", "17:00", 50.00, 14, "20-05-2025", true);
    public static Ticket film2 = new Ticket(2, "Silent Horizon", "18:00", 50.00, 14, "25-05-2025", false);
    public static Ticket film3 = new Ticket(3, "The Last Signal", "19:00", 50.00, 14, "30-05-2025", true);

   
    public int getFilmID() { return filmID; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getShowTime() { return showTime; }
    public void setShowTime(String showTime) { this.showTime = showTime; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public int getSeatNumber() { return seatNumber; }
    public void setSeatNumber(int seatNumber) { this.seatNumber = seatNumber; }

    public String getShowDate() { return showDate; }
    public void setShowDate(String showDate) { this.showDate = showDate; }

    public boolean isAvailable() { return available; }
    public void setAvailable(boolean available) { this.available = available; }

    public void displayTicketInfo() {
        System.out.println("Movie: " + title);
        System.out.println("Show Time: " + showTime);
        System.out.println("Seat: " + seatNumber);
        System.out.println("Price: " + price + " EUR");
        System.out.println("Available: " + (available ? "Yes" : "No"));
    }

    @Override
    public String toString() {
        return "Ticket [filmID=" + filmID + ", title=" + title + ", showTime=" + showTime
                + ", price=" + price + ", seatNumber=" + seatNumber + ", showDate=" + showDate
                + ", available=" + available + "]";
    }

public boolean ismovieAvailable(){
    if(available){
System.out.println("The movie tickets are available");
return true;
    }else{
        System.out.println("The movie tickets are not available");
        return false;
    }
}


}
