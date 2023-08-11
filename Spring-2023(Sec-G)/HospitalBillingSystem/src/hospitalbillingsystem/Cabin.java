
package hospitalbillingsystem;


public class Cabin extends Patient {

   
    public Cabin(String Ward,int Days, String DiscountType) {
        super("Cabin", Ward,Days, DiscountType);
    }

    @Override
    public double BedCharge() {
        double charge = 1500;
        return charge;
    }
    
}
