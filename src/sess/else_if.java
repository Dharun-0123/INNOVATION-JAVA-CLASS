package sess;

public class else_if {
public static void main(String[] args) {
	 
	 int age = 25; // Example: Customer's age
   
     double ticketPrice;

     if (age < 12) {
         ticketPrice = 5.0; // Child price
     } else if (age >= 12 && age <= 18) {
         ticketPrice = 7.0; // Teen price
     } else if (age > 60) {
         ticketPrice = 6.0; // Senior citizen discount
     } else {
         ticketPrice = 10.0; // Standard price
     }
     System.out.println("Your ticket price is: $" + ticketPrice);
}
}
