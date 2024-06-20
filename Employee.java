import java.util.ArrayList;
import java.util.List;

public class Employee {
    public String firstName;
    public String lastName;
    public Position position;
    public List<Animal> animals = new ArrayList<>();

    public Employee(String firstName, String lastName, Position position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
    }

    public void assignAnimal(Animal animal) throws Exception {
        if ((animals.size() < 10 && position == Position.PartTime) ||
                (animals.size() < 50 && position == Position.FullTime)) {
            animals.add(animal);
        } else {
            throw new Exception("No more animals could be assigned");
        }
    }

    public void removeAnimal(Animal animal) throws Exception {
        if (animals.contains(animal)) {
            animals.remove(animal);
        } else {
            throw new Exception("No such animal assignd");
        }
    }

    public void feedAnimal(Animal animal, int foodAmount, boolean isLiquid) {
        if (animals.contains(animal)) {
            animal.feed(foodAmount, isLiquid);
        }
    }
}
