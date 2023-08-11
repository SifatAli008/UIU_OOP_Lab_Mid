package hospitalbillingsystem;

public class CCU extends Patient {

    public CCU(String Ward,int Days, String DiscountType) {
        super("CCU", Ward,Days, DiscountType);
    }

    @Override
    public double BedCharge() {
        double charge = 6000;
        return charge;
    }
}
