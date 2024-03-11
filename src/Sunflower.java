public class Sunflower extends Flower {
    public Sunflower() {
        super("Sunflower", 10, 3, 0.7);
    }

    @Override
    public void water(double watering) {
        this.chanceOfGrowth += watering * 0.15;
    }
}
