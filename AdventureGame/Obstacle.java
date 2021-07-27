package AdventureGame;

import AdventureGame.Awards;

import java.util.Random;

public class Obstacle {
    private int id;
    private String name;
    private int damage;
    private int health;
    private Awards award;
    private int orjinalHealth;
    private int money;

    public Obstacle(int id, String name, int damage, int health, Awards award) {
        super();
        this.id = id;
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.orjinalHealth = health;
        this.award = award;
    }

    public static int awardMoney() {
        Random rnd = new Random();
        int i = rnd.nextInt(100);
        if(i<50) {
            return 1;
        }else if(i <80) {
            return 5;
        }else {
            return 10;
        }
    }

    public int getMoney() {


        if(this.getName().equals("Zombie")) {
            this.money = (award.getId()/10)*4;
        }else if(this.getName().equals("Bear")) {
            this.money = (award.getId()/10)*7;
        }else if (this.getName().equals("Vampire")){
            this.money = (award.getId()/10)*12;
        }else if (this.getName().equals("Snake")) {
            if(award.getId() == 10) {
                this.money =awardMoney();
            }
        }
        return money;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if(health<0) {
            health=0;
        }
        this.health = health;
    }


    public int getOrjinalHealth() {
        return orjinalHealth;
    }

    public void setOrjinalHealth(int orjinalHealth) {
        this.orjinalHealth = orjinalHealth;
    }

    public void setAward(Awards award) {
        this.award = award;
    }

    public Awards getAward() {
        return award;
    }

    public void setMoney(int money) {
        this.money = money;
    }

}

