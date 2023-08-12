package tollbothapplication;

public class Test {

    public static void main(String[] args) {
        Vehicle c;
        TollBooth t = new TollBooth();

        c = new MotorBike("Personal", "Silver");
        System.out.println(c.VehicleType);
        System.out.println(c.VehicleCategories);
        t.calculateToll(c);

        c = new Car("private", "Gold");
        t.calculateToll(c);

         c = new Bus("Public","Platinum");
          t.calculateToll(c);
        
        
        c = new Truck("Govt","Gold");
        t.calculateToll(c);
        

        //   char ch = 0;
//  do {
//      
//      
//  }  while (ch != 'q');
    }

}
