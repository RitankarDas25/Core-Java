package inheritance;

public class Driver {
public static void main(String[] args) {
Bike b = new Bike("WB35654","Honda","splender", 500, false, true);
Car c = new Car("WB39769","BMW","M12", 1500, true, 4);
b.displayDetails();
b.rentVehicle(false);
c.displayDetails();
c.rentVehicle(true);
}
}
