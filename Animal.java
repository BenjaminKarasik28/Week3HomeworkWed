package GA.homework;

public class Animal {
   private int numLegs;
   private int topSpeed;
   private boolean isEndangered;
   private String name;

   public String introduction(){
       return "My name is: " + name + " and I have " + numLegs + " legs";
   }

   public String topSpeedStatement(){
       return "The " + name + " has a speed of: " + topSpeed + " MPH";
   }

   Animal(){}

   public Animal(int numLegs, int topSpeed, boolean isEndangered, String name){
       this.numLegs = numLegs;
       this.topSpeed = topSpeed;
       this.isEndangered = isEndangered;
       this.name=name;
   }


    public int getNumLegs() {
        return numLegs;
    }

    public void setNumLegs(int numLegs) {
        this.numLegs = numLegs;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public boolean isEndangered() {
        return isEndangered;
    }

    public void setEndangered(boolean endangered) {
        isEndangered = endangered;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




}
