public class Rose extends Flower{
    public Rose() {
        super("Rose", 5, 1.5, 0.6);
    }

    @Override
    public void water(double watering) {
        this.chanceOfGrowth += watering * 0.1;
    }
}
