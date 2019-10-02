package GA.homework.Test;
import GA.homework.Animal;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class AnimalTest {
    Animal animal = new Animal(4, 31, false, "Lion");

    @Test
    public void checkSpeed(){
        assertEquals("The Lion has a speed of: 31 MPH", animal.topSpeedStatement());
    }

}

