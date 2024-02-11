import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
// import static org.junit.jupiter.api.Assertions.assertFalse;
// import static org.junit.jupiter.api.Assertions.assertTrue;


class DestinationTest {
    private Destination destination;

    @BeforeEach
    void setUp() {
        destination = new Destination("Test Destination");
    }

    @Test
    void getName() {
        assertEquals("Test Destination", destination.getName());
    }

    @Test
    void addActivity() {
        Activity activity = new Activity("Test Activity", "Description", 100.0, 5, destination);
        destination.addActivity(activity);
        assertEquals(1, destination.getActivities().size());
    }

    @Test
    void removeActivity() {
        Activity activity = new Activity("Test Activity", "Description", 100.0, 5, destination);
        destination.addActivity(activity);
        destination.removeActivity(activity);
        assertEquals(0, destination.getActivities().size());
    }

    @Test
    void printDetails() {
        destination.printDetails(); // Just checking if it prints without error
    }
}