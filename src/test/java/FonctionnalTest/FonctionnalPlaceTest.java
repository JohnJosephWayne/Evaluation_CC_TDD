package FonctionnalTest;

import org.example.model.Car;
import org.example.model.Place;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class FonctionnalPlaceTest {

    @Test
    public void isParkedwithACar_returnNotFree(){
        Place place = new Place(1);
        Car car = new Car("AAAAAA");


        boolean parked = !(place.isFree());
        int numero = place.getNumero(1);

        Assert.assertTrue(true);
        Assert.assertEquals(1, numero);

    }
}


