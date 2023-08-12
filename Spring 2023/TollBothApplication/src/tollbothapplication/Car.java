package tollbothapplication;

public class Car extends Vehicle {

    public Car( String VehicleCategories,String Card) {
        super("Car", VehicleCategories,Card);
    }

    @Override
    public double weight() {
        double weight = 3500;
        return weight;
    }

}
