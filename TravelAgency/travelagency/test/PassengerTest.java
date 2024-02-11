import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
// import static org.junit.jupiter.api.Assertions.assertFalse;
// import static org.junit.jupiter.api.Assertions.assertTrue;


class PassengerTest {
    private Passenger passenger;

    @BeforeEach
    void setUp() {
        passenger = new Passenger("John", 1);
    }

    @Test
    void getName() {
        assertEquals("John", passenger.getName());
    }

    @Test
    void getPassengerNumber() {
        assertEquals(1, passenger.getPassengerNumber());
    }
}