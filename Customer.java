

public class Customer {
    private final int customerId;
    private String name;
    private int age;
    private String email;
    private String phoneNumber;
    private Ticket ticket;
   
    


    public Customer(int customerId, String name, int age, String email, String phoneNumber, Ticket ticket) {
        this.customerId = customerId;
        this.name = name;
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.ticket = ticket;
    }

public static Customer Customer1=new Customer(1,"Alan",20,"Alan21@gmail.com","122345678",Ticket.film1);
public static  Customer Customer2=new Customer(2,"Jake",25,"Jake@gmail.com","876454538",Ticket.film2);
public static  Customer Customer3=new Customer(3,"Elira",40,"Elira.r@gmail.com","266524526",Ticket.film3);

    public int getCustomerId() {
        return customerId;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }


    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public Ticket getTicket() {
        return ticket;
    }


    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }


    public void printProfile() {
        System.out.println("\n Customer Profile:");
        System.out.println("ID: " + customerId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phoneNumber);
        System.out.println("Ticket: " + ticket.toString());
       }


    @Override
    public String toString() {
        return "Customer [customerId=" + customerId + ", name=" + name + ", age=" + age + ", email=" + email
                + ", phoneNumber=" + phoneNumber + ", ticket=" + ticket + "]";
    }

   

    

 
}