package tollbothapplication;


public class Bus extends Vehicle {

    public Bus( String VehicleCategories,String Card) {
        super("Bus", VehicleCategories,Card);
    }

    @Override
    public double weight() {
       double weight = 15000;
        return weight;
    }
    
}
