package unitTest;

import org.example.model.Parking;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ParkingTest {
    @Test
    public void createParking_returnFreePlaceNumber() {
        Parking parking = new Parking(10);
        assertEquals(10, parking.getFreePlaces());
    }

    @Test
    public void getFreePlaces_returnNumberOfPlaces(){

        Parking parking = new Parking(10);

        int result = parking.getFreePlaces();
        assertEquals(10, result);
    }
}
