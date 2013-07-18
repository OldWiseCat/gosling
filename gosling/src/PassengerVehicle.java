import java.util.Vector;

/**
 * Created with IntelliJ IDEA.
 * User: kuraev
 * Date: 18.07.13
 * Time: 17:31
 * To change this template use File | Settings | File Templates.
 */
public class PassengerVehicle extends Vehicle {
    private Integer seats;
    private Integer occupiedSeats;

    PassengerVehicle(int Seats, String driverName) {
        super(driverName);
        if (Seats < 1) {
            throw new IndexOutOfBoundsException();
        }
        seats = Seats;
    }

    public Integer getFreeSeats() {
        return (seats - occupiedSeats);
    }

    public Integer getSeats() {
        return seats;
    }

    public static void main(String[] args) {
        Vector<Vehicle> cars = new Vector<Vehicle>();
        for (String driverName: args) {
            cars.add(new PassengerVehicle(4, driverName));
        }
        for (Vehicle car: cars) {
            System.out.println("car "+ car.getId() + " drived by " + car.getDriverName());
        }
    }
}
