package tollbothapplication;

public class MotorBike  extends Vehicle {

    public MotorBike(String VehicleCategories,String Card) {
        super("MotorBike", VehicleCategories,Card);
    }

    @Override
    public double weight() {
      double weight = 250;
        return weight;
    }
    
}
