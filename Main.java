package GA.homework;
import GA.homework.Animal;

public class Main {
    public static void main(String[] args) {
        Animal elephant = new Animal(4, 25, false, "Elephant");
        elephant.introduction();
        elephant.topSpeedStatement();

        Animal lion = new Animal();
        lion.setName("Lion");
        lion.setNumLegs(4);
        lion.setTopSpeed(50);
        lion.setEndangered(false);

        lion.introduction();
        lion.topSpeedStatement();

    }
}
