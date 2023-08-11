
package hospitalbillingsystem;


public class General extends Patient {
 
    public General(String Ward,int Days, String DiscountType) {
        super("General", Ward,Days, DiscountType);
    }

    @Override
    public double BedCharge() {
        double charge = 500;
        return charge;
    }
    
}
