
public class Cat {
    private String name;
    private double weight;
    public String getName() { //use getters to call the private variables in test drive
        return name;
    }

    public void setName(String newName) { //use setters to change private variable values in test drive
        name = newName;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double newWeight) {
        weight = newWeight;
    }

    void meow() { //method that just prints out meow
        System.out.println("Meow");
    }
}

