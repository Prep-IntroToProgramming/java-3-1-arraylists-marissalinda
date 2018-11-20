
public class Cat {
    private String name;
    private double weight;
    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }
    
    public double getWeight() {
        return weight;
    }
    
    public void setWeight(double newWeight) {
        weight = newWeight;
    }
    void meow() {
        System.out.println("Meow");
    }
}

