package tollbothapplication2;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Vehicle c;
        TollBoth t = new TollBoth();
        char ch;
        Scanner in = new Scanner(System.in);

        do {

            System.out.print("\n\n");
            System.out.println("Enter 'M' for MotorCycle.");
            System.out.println("Enter 'C' for Car.");
            System.out.println("Enter 'B' for Bus.");
            System.out.println("Enter 'T' for Truck.");

            System.out.println("Enter your 'q' to close the programe.");
            ch = in.next().charAt(0);

            if (ch == 'M') {
                System.out.print("Enter VehicleCategories : ");
                String vc = in.next();
                System.out.print("Enter Card Type : ");

                String card = in.next();

                c = new MotorCycle(vc, card);
                System.out.println("-----------------------------");
                System.out.println(c.getVehicleType());
                System.out.println(c.getVehicleCategories());
              System.out.println(c.card()+"% Discount");
                System.out.print("Toll Amount : ");
                t.calculateToll(c);
                System.out.println("-----------------------------");
            } else if (ch == 'C') {
                System.out.print("Enter VehicleCategories : ");
                String vc = in.next();
                System.out.print("Enter Card Type : ");
                String card = in.next();

                c = new Car(vc, card);
                System.out.println("-----------------------------");
                System.out.println(c.getVehicleType());
                System.out.println(c.getVehicleCategories());
                System.out.println(c.card()+"% Discount");
                System.out.print("Toll Amount : ");
                t.calculateToll(c);
                System.out.println("-----------------------------");
            } else if (ch == 'B') {
                System.out.print("Enter VehicleCategories : ");
                String vc = in.next();
                System.out.print("Enter Card Type : ");
                String card = in.next();

                c = new Bus(vc, card);
                System.out.println("-----------------------------");
                System.out.println(c.getVehicleType());
                System.out.println(c.getVehicleCategories());
              System.out.println(c.card()+"% Discount");
                System.out.print("Toll Amount : ");
                t.calculateToll(c);
                System.out.println("-----------------------------");
            } else if (ch == 'T') {
                System.out.print("Enter VehicleCategories : ");
                String vc = in.next();
                System.out.print("Enter Card Type : ");
                String card = in.next();
                c = new Truck(vc, card);

                System.out.println("-----------------------------");
                System.out.println(c.getVehicleType());
                System.out.println(c.getVehicleCategories());
                 System.out.println(c.card()+"% Discount");
                System.out.print("Toll Amount : ");
                t.calculateToll(c);
                System.out.println("-----------------------------");
            } else if (ch == 'q') {
                System.out.println("Exited from Program");

            }
                    else {
                System.out.println("Invalid inPut.");
            }

        } while (ch != 'q');

    }

}
