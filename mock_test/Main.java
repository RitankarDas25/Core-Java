package mock_test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Optional;
import java.util.Scanner;

public class Main {
public static void main(String args[]) throws FileNotFoundException, IOException {
	RideBookingSystem ob = new RideBookingSystem();
	ob.loadDriversFromFile();
	Scanner sc = new Scanner(System.in);
	boolean exit = false;
	while(!exit){
	
	System.out.println("Enter 1 to register a customer, 2 to register a driver , 3 to book a ride, 4 to show all drivers , 5 to save data and exit" );
	int ch = sc.nextInt();
	  try {
          switch (ch) {
              case 1:
                  // Register a customer
                  System.out.print("Enter Customer ID: ");
                  String customerId = sc.nextLine();
                  System.out.print("Enter Customer Name: ");
                  String customerName = sc.nextLine();
                  Customer customer = new Customer(customerId, customerName);
                  ob.registerCustomer(customer);
                  System.out.println("Customer registered successfully.");
                  break;

              case 2:
                  // Register a driver
                  System.out.print("Enter Driver ID: ");
                  String driverId = sc.nextLine();
                  System.out.print("Enter Driver Name: ");
                  String driverName = sc.nextLine();
                  Driver driver = new Driver(driverId, driverName,true);
                  ob.registerDriver(driver);
                  System.out.println("Driver registered successfully.");
                  break;

              case 3:
                  // Book a ride
                  System.out.print("Enter Customer ID to book a ride: ");
                  String customerIdToBook = sc.nextLine();

                  // Search for the customer using Stream API
                  Optional<Customer> customerOpt = ob.getCustomers().stream()
                          .filter(c -> c.id.equals(customerIdToBook))
                          .findFirst();

                  if (customerOpt.isPresent()) {
                      Customer customerForRide = customerOpt.get();
                      Ride ride = ob.bookRide(customerForRide);
                      System.out.println("Ride booked successfully: " + ride.rideDetails());
                  } else {
                      System.out.println("Invalid Customer ID entered.");
                  }
                  break;

              case 4:
                  // Show all drivers
            	  ob.showAllDrivers();
                  break;

              case 5:
                  // Save Data and Exit
                  ob.saveRides();
                  ob.saveDriversToFile();
                  System.out.println("Data saved. Exiting...");
                  exit = true;
                  break;

              default:
                  System.out.println("Invalid option. Please try again.");
                  break;
          }
      } catch (InvalidRideException e) {
          System.out.println("Error: " + e.getMessage());
      } catch (Exception e) {
          System.out.println("Unexpected error: " + e.getMessage());
      }
  }

  // Close scanner
  sc.close();
}
	}


