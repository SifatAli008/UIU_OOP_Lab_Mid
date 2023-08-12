package tollbothapplication;

public abstract class Vehicle {

    String VehicleType;
    String VehicleCategories;
    String Card;

    public Vehicle(String VehicleType, String VehicleCategories, String Card) {
        this.VehicleType = VehicleType;
        this.VehicleCategories = VehicleCategories;
        this.Card = Card;
    }

    public abstract double weight();

    public double card() {
         double dis = 0;
        if (Card.equals("Platinum")) {
             dis= 10;
        }
        else if(Card.equals("Gold")){
               dis= 8;
        }
           else if(Card.equals("Silver")){
               dis= 5;
        }
        return dis;
    }

}
