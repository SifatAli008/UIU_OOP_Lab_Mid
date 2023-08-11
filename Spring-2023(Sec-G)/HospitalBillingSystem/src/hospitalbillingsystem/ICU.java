
package hospitalbillingsystem;

public class ICU extends Patient{
 
    public ICU(String Ward,int Days, String DiscountType) {
        super("ICU", Ward,Days, DiscountType);
    }

    @Override
    public double BedCharge() {
        double charge = 4000;
        return charge;
    }
}
