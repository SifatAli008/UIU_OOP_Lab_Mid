package tollbothapplication;

public class TollBooth {

     double TotalToll;
    double Toll = .025;
    double discount;

    public void calculateToll(Vehicle v) {
        if (v.VehicleCategories.equals("Govt")) {
            TotalToll = 0;
            System.out.println(TotalToll);

        } else {
            if (v.VehicleType.equals("MotorBike")) {
                TotalToll = v.weight() * Toll;
                 discount =v.card()/100;
                System.out.println(TotalToll-(TotalToll*discount));
            } 
            
            else if (v.VehicleType.equals("Car")) {
                TotalToll = v.weight() * Toll;
                discount =v.card()/100;
                System.out.println(TotalToll-(TotalToll*discount));
            } 
            
            else if (v.VehicleType.equals("Bus")) {
                TotalToll = v.weight() * Toll;
                discount =v.card()/100;
                System.out.println(TotalToll-(TotalToll*discount));
            }
            
            else if (v.VehicleType.equals("Truck")) {
                TotalToll = v.weight() * Toll;
              discount =v.card()/100;
                System.out.println(TotalToll-(TotalToll*discount));
            }
        }
        
        
    }
}
