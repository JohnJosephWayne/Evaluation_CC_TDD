package unitTest;

import org.example.model.Car;
import org.example.model.Place;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class PlaceTest {
    @Test
    public void CreateAPlace_isFree_returnOneFreePlace() {
        Place place = new Place(1);
        assertTrue(place.isFree());
    }

    @Test
    public void parkedPlace_returnNotFreePlace() {
        Place place = new Place(1);
        Car car = new Car("ABC123");

        place.parkedPlace(car);

        assertFalse(place.isFree());
    }

    @Test
    public void unparkedPlace_ReturnFreePlace() {
        Place place = new Place(1);
        Car parkedCar = new Car("AAAAAA");

        place.isFree();
        parkedCar = null;

        assertTrue(place.isFree());
    }

    @Test
    public void paidPlace_ReturnMoneyToPay(){
        Place place = new Place(1);
        Car car = new Car("AAAAA");

        place.unparkedPlace(new Car("AAAAA"), new Place(1));
        place.isFree();

        LocalDateTime hourEnd = LocalDateTime.now();
        LocalDateTime debuthour = LocalDateTime.now().minusHours(2);
        double time = java.time.Duration.between(debuthour, hourEnd).toMinutes() / 60.0;

        double hourPay = 0.75;

        double toPay = time * hourPay;

        assertEquals(1.5, toPay);
    }
}
