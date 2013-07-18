import java.util.Vector;

/**
 * Created with IntelliJ IDEA.
 * User: kuraev
 * Date: 18.07.13
 * Time: 12:03
 * To change this template use File | Settings | File Templates.
 */
public class Vehicle {
    private Integer direction = 0;
    private Integer speed = 0;
    private String driverName;
    private Integer angleBuffer;
    private Integer id = 0;
    private static Integer maxID = 0;

    public static enum turn {
        TURN_LEFT, TURN_RIGHT;
    }


    Vehicle (String driverName) {
        this.driverName = driverName;
        id = maxID;
        maxID++;
    }
    Vehicle () {
        this.driverName = "";
        id = maxID;
        maxID++;
    }

    public void setDirection(Integer direction)
    /**
     * Direction setter
     */
            throws IndexOutOfBoundsException
    {
        if (direction < 0 || direction > 360) {
            throw new IndexOutOfBoundsException("direction cannot be lesser than 0 ir greater than 360");
        } else {
            this.direction = direction;
        }
    }
    public void setSpeed(Integer speed)
            throws IndexOutOfBoundsException
    /**
     * Speed setter
     */
    {
        if (speed < 0 || speed > 360) {
            throw new IndexOutOfBoundsException("direction cannot be lesser than 0 ir greater than 360");
        } else {
            this.speed = speed;
        }
    }
    public Integer getSpeed() {
        return this.speed;
    }

    public Integer getDirection() {
        return this.speed;
    }

    public void turn(Integer angle) {
        if (angle < 0 || angle > 360) {
            throw new IndexOutOfBoundsException("direction cannot be lesser than 0 ir greater than 360");
        } else {
            this.angleBuffer = angle;
        }
    }

    public void turnDirection(turn direction) {
        if (direction == turn.TURN_LEFT) {
            this.direction -= angleBuffer;
        }
    }

    public static Integer getMaxID() {
        return maxID;
    }

    public Integer getId() {
        return id;
    }

    public String getDriverName() {
        return driverName;
    }

    public static void main(String[] args) {
        Vector<Vehicle>cars = new Vector<Vehicle>();
        for (String driverName: args) {
            cars.add(new Vehicle(driverName));
        }
        for (Vehicle car: cars) {
            System.out.println("car "+ car.getId() + " drived by " + car.getDriverName());
        }
    }

    public String toString() {
        return id.toString();
    }

}
