package mock_test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RideBookingSystem {
	 private List<Customer> customers = new ArrayList<>();
	    private List<Driver> drivers = new ArrayList<>();
	    private List<Ride> rides = new ArrayList<>();

	    
	    public void registerCustomer(Customer customer) {
	        customers.add(customer);
	    }

	    
	    public void registerDriver(Driver driver) {
	        drivers.add(driver);
	    }
	    public Ride bookRide(Customer customer) throws InvalidRideException {
	        Driver availableDriver = drivers.stream()
	                .filter(Driver::isAvailable)
	                .findFirst()
	                .orElseThrow(() -> new InvalidRideException("No available drivers at the moment."));

	        availableDriver.setAvailable(false);
	        Ride ride = new Ride(customer, availableDriver, "Booked");
	        rides.add(ride);
	        System.out.println("Ride booked successfully: " );
	        return ride;

}
	    public void saveRides() {
	        try (BufferedWriter writer = new BufferedWriter(new FileWriter("rides.txt"))) {
	            for (Ride ride : rides) {
	                writer.write(ride.rideDetails());
	                writer.newLine();
	            }
	            System.out.println("Rides saved to rides.txt");
	        } catch (IOException e) {
	            System.out.println("Error saving rides: " + e.getMessage());
	        }
	    }
	    public void loadDriversFromFile() throws FileNotFoundException, IOException {
	        try (BufferedReader reader = new BufferedReader(new FileReader("drivers.txt"))) {
	            String line;
	            while ((line = reader.readLine()) != null) {
	                String[] parts = line.split(",");
	                if (parts.length >= 2) {
	                    String id = parts[0].trim();
	                    String name = parts[1].trim();
	                    Driver driver = new Driver(id, name,true);
	                    registerDriver(driver);
	                }
	            }
	            System.out.println("Drivers loaded from drivers.txt");
	        } catch (IOException e) {
	            System.out.println("Error loading drivers: " + e.getMessage());
	        }
	        }
	    
	    public void saveDriversToFile() {
	        try (BufferedWriter writer = new BufferedWriter(new FileWriter("drivers.txt"))) {
	            for (Driver driver : drivers) {
	                writer.write(driver.id + "," + driver.name);
	                writer.newLine();
	            }
	            System.out.println("Drivers saved to drivers.txt");
	        } catch (IOException e) {
	            System.out.println("Error saving drivers: " + e.getMessage());
	        }
	    }
	    public void showAllDrivers() {
	        if (drivers.isEmpty()) {
	            System.out.println("No drivers registered.");
	        } else {
	            for (Driver driver : drivers) {
	                driver.showProfile();
	            }
	        }
	    }
	    public List<Customer> getCustomers() {
	        return customers;
	    }

	    public void setCustomers(List<Customer> customers) {
	        this.customers = customers;
	    }
	    }
	    

