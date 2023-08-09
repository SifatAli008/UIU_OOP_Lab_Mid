package play;

public class Test {

    public static void main(String[] args) {

        PlayerInfoV2[] players = new PlayerInfoV2[3];
        players[0] = new PlayerInfoV2("John", "1", 500, 20);
        players[1] = new PlayerInfoV2("David", "2", 300, 15);
        players[2] = new PlayerInfoV2("Mike", " 3", 200, 25);

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        String name = " ";

        for (int i = 0; i < 3; i++) {
            players[i].play();
            int exp = players[i].getpExperience();

            if (exp > max1) {
                max2 = max1;
                max1 = exp;
                System.out.println(exp);
                name = players[i].getpName();
            } else if (exp > max2) {
                max2 = exp;
            }
        }
        System.out.println("Player with second maximum experience: " + name);
        System.out.println(" ");
    }
}
