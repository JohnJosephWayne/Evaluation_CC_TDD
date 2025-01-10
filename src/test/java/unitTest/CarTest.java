package unitTest;

import org.example.model.Car;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarTest {
    @Test
    public void testCreationVoitureValide_ReturnTrue() {
    Car car = new Car("AAAAAA");
    assertTrue(true);
    }

    @Test
    public void testCreationVoitureInvalide_ThrowException() {
        assertThrows(IllegalArgumentException.class, () -> new Car(""));
    }
}
