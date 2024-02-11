import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

// import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ActivityTest {
    private Activity activity;
    private Destination destination;

    @BeforeEach
    void setUp() {
        destination = new Destination("Test Destination");
        activity = new Activity("Test Activity", "Description", 100.0, 5, destination);
    }

    @Test
    void signUpPassenger() {
        Passenger passenger = new Passenger("John", 1);
        activity.signUpPassenger(passenger);
        assertTrue(activity.getSignedUpPassengers().contains(passenger));
    }

    @Test
    void removePassenger() {
        Passenger passenger = new Passenger("John", 1);
        activity.signUpPassenger(passenger);
        activity.removePassenger(passenger);
        assertFalse(activity.getSignedUpPassengers().contains(passenger));
    }

    @Test
    void hasSpaceAvailable() {
        assertTrue(activity.hasSpaceAvailable());
        for (int i = 0; i < 5; i++) {
            Passenger passenger = new Passenger("Passenger " + i, i);
            activity.signUpPassenger(passenger);
        }
        assertFalse(activity.hasSpaceAvailable());
    }

    @Test
    void printDetails() {
        activity.printDetails(); // Just checking if it prints without error
    }
}