
package hospitalbillingsystem;

public abstract class Patient {
    
    private String bedType;
    private String Ward;
    int DAYS;
    String DiscountType;

     Patient(String bedType, String Ward,int DAYS, String DiscountType) {
        this.bedType = bedType;
        this.Ward = Ward;
        this.DAYS=DAYS;
        this.DiscountType = DiscountType;  
    }
    
    public abstract double BedCharge();

    public String getBedType() {
        return bedType;
    }

    public String getWard() {
        return Ward;
    }

    public double Discountpercentage(){
     double percentage = 0;
     if(DiscountType.equals("Family")){
      percentage=.75;
     }
     else if(DiscountType.equals("Relative")){
       percentage=.90;
     }
     
     return percentage;
    }
}
