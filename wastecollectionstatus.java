import java.util.Scanner;

public class wastecollectionstatus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reading waste collected from the user
        System.out.print("Enter the amount of waste collected (in kg): ");
        double wasteCollected = sc.nextDouble();

                if (wasteCollected >= 50.0) {
            System.out.println(" Target Achieved");
        } else {
            System.out.println("Waste Collection Required");
        }
      
        sc.close();
    }
}