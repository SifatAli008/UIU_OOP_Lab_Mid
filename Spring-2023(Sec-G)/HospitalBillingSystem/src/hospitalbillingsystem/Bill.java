package hospitalbillingsystem;

public class Bill {

    double Totalbill;
    double days;
    double cost;

    public void calculeBill(Patient p) {
        if (p.DiscountType.equals("Employee")) {
            Totalbill = 0;
        }

        if (p.getBedType().equals("Genreal")) {
            cost = p.BedCharge() * p.DAYS;
            Totalbill = cost * p.Discountpercentage();
            System.out.println("Total : " + Totalbill);
        }
        
        if (p.getBedType().equals("Cabin")) {
            cost = p.BedCharge() * p.DAYS;

            Totalbill = cost * p.Discountpercentage();
            System.out.println("Total : " + Totalbill);
        }
        
        if (p.getBedType().equals("ICU")) {
            cost = p.BedCharge() * p.DAYS;
            Totalbill = cost * p.Discountpercentage();
            System.out.println("Total : " + Totalbill);
        }
        
        if (p.getBedType().equals("CCU")) {
            cost = p.BedCharge() * p.DAYS;
            Totalbill = cost * p.Discountpercentage();
            System.out.println("Total : " + Totalbill);
        }

    }

}
