package Seminar1;

import java.util.Random;
 
public class BaseHero {
    protected static int number;
    protected static Random r;

    protected String name;
    protected int hp;
    protected int maxHp;
    protected int damage;

    static {
        BaseHero.number = 0;
        BaseHero.r = new Random();
    }

    public BaseHero(String name, int hp) {
        this.name = name;
        this.hp = hp;
        this.maxHp = hp;
    }

    public BaseHero() {
        this(String.format("Hero_Priest #%d", ++BaseHero.number),
                BaseHero.r.nextInt(100, 200));
    }

    public String getInfo() {
        return String.format("Name: %s  Hp: %d  Type: %s",
                this.name, this.hp, this.getClass().getSimpleName());
    }

    public void healed(BaseHero target) {
        int healed = r.nextInt(1, 4);
        System.out.println(this.name + " healed " + healed + " points " + target.name);
        System.out.println();
        target.hp += healed;
    }

    public void GetDamage(int damage) {
        if (this.hp - damage > 0) {
            this.hp -= damage;
        }
        else { this.hp = 0;}
    }

    public int Attack(BaseHero target) {
        int damage = BaseHero.r.nextInt(10, 20);
        System.out.println(this.name + " attak damage " + damage);
        System.out.println();
        target.GetDamage(damage);
        this.damage = damage;
        return this.damage;
    }
}
