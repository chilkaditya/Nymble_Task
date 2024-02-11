import java.util.ArrayList;
import java.util.List;

class TravelPackage {
    private String name;
    private int passengerCapacity;
    private List<Destination> itinerary;
    private List<Passenger> passengers;

    public TravelPackage(String name, int passengerCapacity) {
        this.name = name;
        this.passengerCapacity = passengerCapacity;
        this.itinerary = new ArrayList<>();
        this.passengers = new ArrayList<>();
    }

    public void addPassenger(Passenger passenger) {
        if (passengers.size() < passengerCapacity) {
            passengers.add(passenger);
        } else {
            System.out.println("Cannot add passenger. Travel package is full.");
        }
    }

    public void removePassenger(Passenger passenger) {
        passengers.remove(passenger);
    }

    public void printItinerary() {
        System.out.println("Travel Package: " + name);
        for (Destination destination : itinerary) {
            System.out.println("Destination: " + destination.getName());
            destination.printDetails();
        }
    }

    public void printPassengerList() {
        System.out.println("Passenger List for Travel Package: " + name);
        System.out.println("Capacity: " + passengerCapacity);
        System.out.println("Number of Passengers Enrolled: " + passengers.size());
        for (Passenger passenger : passengers) {
            System.out.println(passenger.getName() + " - " + passenger.getPassengerNumber());
        }
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

}

class Destination {
    private String name;
    private List<Activity> activities;

    public Destination(String name) {
        this.name = name;
        this.activities = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addActivity(Activity activity) {
        activities.add(activity);
    }

    public void removeActivity(Activity activity) {
        activities.remove(activity);
    }

    public void printDetails() {
        System.out.println("Activities Available at " + name);
        for (Activity activity : activities) {
            activity.printDetails();
        }
    }

    public List<Activity> getActivities() {
        return activities;
    }
}

class Activity {
    private String name;
    private String description;
    private double cost;
    private int capacity;
    private Destination destination;
    private List<Passenger> signedUpPassengers;

    public Activity(String name, String description, double cost, int capacity, Destination destination) {
        this.name = name;
        this.description = description;
        this.cost = cost;
        this.capacity = capacity;
        this.destination = destination;
        this.signedUpPassengers = new ArrayList<>();
    }

    public void signUpPassenger(Passenger passenger) {
        if (signedUpPassengers.size() < capacity) {
            signedUpPassengers.add(passenger);
        } else {
            System.out.println("Cannot sign up passenger. Activity is full.");
        }
    }

    public void removePassenger(Passenger passenger) {
        signedUpPassengers.remove(passenger);
    }

    public boolean hasSpaceAvailable() {
        return signedUpPassengers.size() < capacity;
    }

    public void printDetails() {
        System.out.println("Activity: " + name);
        System.out.println("Description: " + description);
        System.out.println("Cost: " + cost);
        System.out.println("Capacity: " + capacity);
        System.out.println("Destination: " + destination.getName());
        System.out.println("Signed Up Passengers: " + signedUpPassengers.size() + "/" + capacity);
    }

    public List<Passenger> getSignedUpPassengers() {
        return signedUpPassengers;
    }
}

class Passenger {
    private String name;
    private int passengerNumber;

    public Passenger(String name, int passengerNumber) {
        this.name = name;
        this.passengerNumber = passengerNumber;
    }

    public String getName() {
        return name;
    }

    public int getPassengerNumber() {
        return passengerNumber;
    }
}





public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
