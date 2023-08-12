package tollbothapplication2;

public class Truck extends Vehicle {

    public Truck(String VehicleCategories, String Card) {
        super("Truck", VehicleCategories, Card);
    }

    @Override
    public double weight() {
        double weight = 35000;
        return weight;
    }

}
