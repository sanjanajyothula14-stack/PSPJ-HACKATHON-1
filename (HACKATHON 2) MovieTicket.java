import java.util.Scanner;

class MovieTicket {
   
    String movieName;
    double ticketPrice;
    int numberOfTickets;
    double totalAmount;
    double discount;
    double finalAmount;
        MovieTicket(String movieName, double ticketPrice, int numberOfTickets) {
        this.movieName = movieName;
        this.ticketPrice = ticketPrice;
        this.numberOfTickets = numberOfTickets;
    }
        void calculateTotal() {
        totalAmount = ticketPrice * numberOfTickets;
    }
        void calculateDiscount() {
        if (numberOfTickets >= 5) {
            discount = totalAmount * 0.10;
        } else {
            discount = 0.0;
        }
    }
        void calculateFinalAmount() {
        finalAmount = totalAmount - discount;
    }
      void displayBill() {
        System.out.println("\n===== CINEMA TICKET BILL =====");
        System.out.println("Movie Name       : " + movieName);
        System.out.printf("Ticket Price     : ", ticketPrice);
        System.out.println("Number of Tickets: " + numberOfTickets);
        System.out.printf("Total Amount     : ", totalAmount);
        System.out.printf("Discount         :", discount);
        System.out.printf("Final Amount     : ", finalAmount);
            }
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter movie name: ");
        String movieName = sc.nextLine();
        System.out.print("Enter ticket price: ");
        double ticketPrice = sc.nextDouble();
        System.out.print("Enter number of tickets: ");
        int numberOfTickets = sc.nextInt();
        MovieTicket ticket = new MovieTicket(
        movieName, ticketPrice, numberOfTickets
        );
        ticket.calculateTotal();
        ticket.calculateDiscount();
        ticket.calculateFinalAmount();
        ticket.displayBill();
        sc.close();
    }
}
