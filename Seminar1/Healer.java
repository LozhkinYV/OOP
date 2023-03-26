package Seminar1;

public class Healer extends BaseHero{
    private int healerPoint;
    private int maxHealerPoint;

    public Healer() {
        super(String.format("Hero_Healer #%d", ++Magician.number),
                Magician.r.nextInt(100, 200));
        this.maxHealerPoint = Magician.r.nextInt(50, 150);
        this.healerPoint = maxHealerPoint;
    }
    
    public String getInfo() {
        return String.format("%s  healerPoint: %d", super.getInfo(), this.healerPoint);
    }
}

