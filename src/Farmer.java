import java.util.ArrayList;
import java.util.regex.Pattern;

public class Farmer {
    protected ArrayList<Flower> flowers;
    protected ArrayList<Animal> animals;
    protected ArrayList<Land> lands;
    protected double finances;

    public Farmer() {
        this.flowers = new ArrayList<>();
        this.animals = new ArrayList<>();
        this.lands = new ArrayList<>();
        this.finances = 1000.0;
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

    public void plantFlower(Flower flower) {
        System.out.println("Planting a flower: " + flower.name);
        System.out.println("Flower " + flower.name + " has been planted.");
    }

    public void waterFlowers(double watering) {
        for (Flower flower : flowers) {
            flower.water(watering);
        }
        System.out.println("Flowers have been watered.");
    }

    public void buyAnimal(Animal animal) {
        System.out.println("Buying an animal: " + animal.type + " - " + animal.name);
        System.out.println("Animal " + animal.type + " - " + animal.name + " has been bought.");
    }

    public void sellAnimal(Animal animal) {
        System.out.println("Selling an animal: " + animal.type + " - " + animal.name);
        System.out.println("Animal " + animal.type + " - " + animal.name + " has been sold.");
    }

    public void patAnimal(Animal animal) {
        System.out.println("Petting an animal: " + animal.type + " - " + animal.name);
        System.out.println("Animal " + animal.type + " - " + animal.name + " has been patted.");
    }

    public void addLand(Land land) {
        this.lands.add(land);
    }

    public void removeLand(Land land) {
        this.lands.remove(land);
    }

    public void buyLand(double priceForHectar, double size) {
        double price = priceForHectar * size;
        if (price <= this.finances) {
            this.finances -= price;
            this.addLand(new Land(size));
            System.out.println("The land has been bought.");
        } else {
            System.out.println("You don't have enough finances.");
        }
    }

    public void buyPlaceInBarn() {
        double priceForPlace = 500.0;
        if (this.finances >= priceForPlace) {
            this.finances -= priceForPlace;
            System.out.println("The place has been bought.");
        } else {
            System.out.println("You don't have enough finances.");
        }
    }
}
