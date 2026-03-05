import java.util.Scanner;

class Flight {
    // Attributes
    String destination;
    double price;
    int seatsAvailable;
    
    // Constructor to initialize flight details
    public Flight(String destination, double price, int seatsAvailable) {
        this.destination = destination;
        this.price = price;
        this.seatsAvailable = seatsAvailable;
    }
    
    // Method to book a seat
    public void bookSeat() {
        if (seatsAvailable > 0) {
            seatsAvailable--;
            System.out.println("Booking Successful!");
        } else {
            System.out.println("Seat not Available");
        }
    }
    
    // Method to display flight information
    public void getFlightInfo() {
        System.out.println("Destination: " + destination);
        System.out.println("Price: " + price);
        System.out.println("Seats Available: " + seatsAvailable);
    }
    
    // Main method to run the program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input
        String destination = scanner.nextLine();
        double price = scanner.nextDouble();
        int seatsAvailable = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        String bookingChoice = scanner.nextLine();
        
        // Create Flight object
        Flight flight = new Flight(destination, price, seatsAvailable);
        
        // Display initial flight details
        System.out.println("Flight Details:");
        flight.getFlightInfo();
        
        // Book seat if user chooses "yes"
        if (bookingChoice.equalsIgnoreCase("yes")) {
            flight.bookSeat();
        }
        
        // Display updated flight details
        System.out.println("Updated Flight Details:");
        flight.getFlightInfo();
        
        scanner.close();
    }
}
