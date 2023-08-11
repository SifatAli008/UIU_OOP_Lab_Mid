
package hospitalbillingsystem;

public class Test {
    

    public static void main(String[] args) {
       Patient p;
       Bill b = new Bill();
       
       p = new Cabin ("General-Word",5,"Family");
       b.calculeBill(p);
    }
    
}
