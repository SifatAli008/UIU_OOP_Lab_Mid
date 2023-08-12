package tollbothapplication2;

import java.util.Scanner;

public class TollBoth {

    double Toll;
    double Cost = .025;
    double discount;

    public void calculateToll(Vehicle v) {
        if (v.getVehicleCategories().equals("Govt")) {
            Scanner in = new Scanner(System.in);
            int type = in.nextInt();
            if (type == 1) {
                Toll = 0;
            }

        } else {
            if (v.getVehicleType().equals("MotorCycle")) {
                Toll = Cost * v.weight();
                discount = v.card() / 100;
                System.out.println(Toll - (Toll * discount));
            } else if (v.getVehicleType().equals("Car")) {
                Toll = Cost * v.weight();
                discount = v.card() / 100;
                System.out.println(Toll - (Toll * discount));
            } else if (v.getVehicleType().equals("Bus")) {
                Toll = Cost * v.weight();
                discount = v.card() / 100;
                System.out.println(Toll - (Toll * discount));
            } else if (v.getVehicleType().equals("Truck")) {
                Toll = Cost * v.weight();
                discount = v.card() / 100;
                System.out.println(Toll - (Toll * discount));
            }
        }

    }
}
