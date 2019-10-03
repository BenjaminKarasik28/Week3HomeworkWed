package GA.homework.AnimalHW.Test;
import GA.homework.AnimalHW.Animal;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

public class AnimalTest {

    Animal animal = new Animal(4, 31, false, "Lion");

    @Test
    public void checkSpeed(){
        assertEquals("The Lion has a speed of: 31 MPH", animal.topSpeedStatement());
    }


    @Test
    public void checkGetEndangered(){
        assertEquals(false, animal.getIsEndangered());
    }

    @Test
    public void checkIsEndangered(){
        animal.setEndangered(true);
        assertTrue(animal.getIsEndangered());
    }

    @Test
    public void checkGetNumLegs(){
        assertEquals(4, animal.getNumLegs());
    }

    @Test
    public void checkSetNumLegs(){
        animal.setNumLegs(5);
        assertEquals(5, animal.getNumLegs());
    }

    @Test
    public void checkGetName(){
        assertEquals("Lion", animal.getName());
    }

    @Test
    public void checkSetName(){
        animal.setName("Pig");
        assertEquals("Pig", animal.getName());
    }

    @Test
    public void checGetTopSpeed(){
        assertEquals(31, animal.getTopSpeed());
    }

    @Test
    public void checkSetTopSpeed(){
        animal.setTopSpeed(100);
        assertEquals(100, animal.getTopSpeed());
    }



}

