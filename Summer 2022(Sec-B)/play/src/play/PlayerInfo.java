package play;

public class PlayerInfo {

    String pName;
    String pId;
    private double pBalance;
    private int pExperience;

    public void setpBalance(double pBalance) {
        this.pBalance = pBalance;
    }

    public void setpExperience(int pExperience) {
        this.pExperience = pExperience;
    }

    public double getpBalance() {
        return pBalance;
    }

    public int getpExperience() {
        return pExperience;
    }

    public String getpName() {
        return pName;
    }

    public PlayerInfo(String pName, String pId, double pBalance, int pExperience) {
        this.pName = pName;
        this.pId = pId;
        this.pBalance = pBalance;
        this.pExperience = pExperience;
    }

    void play() {
        if (pBalance > 100) {
            pBalance = pBalance - 100;
            pExperience = pExperience + 5;
        } else {
            System.out.println("Insstant");
        }
    }

    void updateId(String id) {
        this.pId = id;
    }

    void updateName(String name) {
        this.pName = name;
    }
}
