package Seminar1;

import java.util.Random;


public class Program {
    public static void main(String[] args) {
        
        Random rand = new Random();
        
        BaseHero hero1 = new Magician();
        System.out.println(hero1.getInfo());
        
        BaseHero hero2 = new Priest();
        System.out.println(hero2.getInfo());

        BaseHero hero3 = new Healer();
        System.out.println(hero3.getInfo());

        while(true){
            
            System.out.println("***************************");
            hero1.Attack(hero2);
            if (hero2.hp > 0){
                System.out.println(hero1.getInfo());
                System.out.println(hero2.getInfo());
                }
                else {
                    System.out.println(hero1.getInfo());
                    System.out.println(hero2.getInfo());
                    break;
                }
            hero2.Attack(hero1);
            if (hero1.hp > 0){
                System.out.println(hero1.getInfo());
                System.out.println(hero2.getInfo());
                }
                else {
                    System.out.println(hero1.getInfo());
                    System.out.println(hero2.getInfo());
                    break;
                } 
            if (rand.nextInt(2) == 0){
                hero3.healed(hero1);
            } else {hero3.healed(hero2);}
            System.out.println(hero1.getInfo());
            System.out.println(hero2.getInfo());
        }
        if (hero1.hp == 0){
            System.out.println("hero2 win!");
        }
        else {
            System.out.println("hero1 win!");
        }
        
    }
}