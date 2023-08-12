package tollbothapplication2;

public class MotorCycle extends Vehicle {

    public MotorCycle(String VehicleCategories, String Card) {
        super("MotorCycle", VehicleCategories, Card);
    }

    @Override
    public double weight() {
        double weight = 250;
        return weight;
    }

}
