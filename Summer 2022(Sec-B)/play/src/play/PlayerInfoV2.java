package play;

public class PlayerInfoV2 extends PlayerInfo {

    public PlayerInfoV2(String pName, String pId, double pBalance, int pExperience) {
        super(pName, pId, pBalance, pExperience);
    }

    @Override
    void play() {
        double num = getpBalance();
        int ep = getpExperience();

        if (num > 150) {
            num = num - 150;
            setpExperience(ep + 10);
        } else {
            System.out.println("Insafecent balance");
        }
    }

    @Override
    public String getpName() {
        return pName;
    }

}
