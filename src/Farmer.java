import java.util.ArrayList;

public class Farmer {
    protected ArrayList<Flower> flowers;
    protected ArrayList<Animal> animals;

    public Farmer() {
        this.flowers = new ArrayList<>();
        this.animals = new ArrayList<>();
    }

    public void addFlower(Flower flower) {
        if (this.flowers.size() < 5) {
            this.flowers.add(flower);
        } else {
            System.out.println("The farm is full of flowers.");
        }
    }

    public void removeFlower(Flower flower) {
        this.flowers.remove(flower);
    }

    public void addAnimal(Animal animal) {
        if (this.animals.size() < 20) {
            this.animals.add(animal);
        } else {
            System.out.println("The farm is full of animals.");
        }
    }

    public void removeAnimal(Animal animal) {
        this.animals.remove(animal);
    }
}
