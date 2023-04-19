public class Caramel implements AddOnDecorator {
    Beverage beverage;
    public Caramel(Beverage beverage) {
        this.beverage = beverage;
    }
    public String getDescription() {
        return beverage.getDescription() + ", Caramel";
    }
    public double cost() {
        return beverage.cost() + 0.20;
    }
}
