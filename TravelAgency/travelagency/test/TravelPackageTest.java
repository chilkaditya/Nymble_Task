import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
// import static org.junit.jupiter.api.Assertions.assertFalse;
// import static org.junit.jupiter.api.Assertions.assertTrue;

class TravelPackageTest {
    private TravelPackage travelPackage;

    @BeforeEach
    void setUp() {
        travelPackage = new TravelPackage("Test Package", 2);
    }

    @Test
    void addPassenger() {
        Passenger passenger = new Passenger("John", 1);
        travelPackage.addPassenger(passenger);
        assertEquals(1, ( travelPackage.getPassengers()).size());
    }

    @Test
    void removePassenger() {
        Passenger passenger = new Passenger("John", 1);
        travelPackage.addPassenger(passenger);
        travelPackage.removePassenger(passenger);
        assertEquals(0, travelPackage.getPassengers().size());
    }

    @Test
    void printItinerary() {
        travelPackage.printItinerary(); // Just checking if it prints without error
    }

    @Test
    void printPassengerList() {
        travelPackage.printPassengerList(); // Just checking if it prints without error
    }
}

