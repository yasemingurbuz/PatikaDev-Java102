package AdventureGame;

import AdventureGame.Characters.Archer;
import AdventureGame.Characters.Knight;
import AdventureGame.Characters.Samurai;

import java.util.Scanner;

public class Player {
    private int damage;
    private int health;
    private int orjinalHealth;
    private int money;
    private String charName;
    private String name;

    Scanner input = new Scanner(System.in);
    private Inventory inventory;

    public Player(String name) {
        this.name = name;
        this.inventory=new Inventory();
    }


    public void selectChar(){
        Samurai samurai = new Samurai();
        Archer archer = new Archer();
        Knight knight=new Knight();
        GameChar[] charList = {new Samurai(), new Archer(),new Knight()};
        System.out.println("Characters");
        System.out.println("-----------------------------------------------------------------");

        for(GameChar gameChar : charList){
            System.out.println("ID : "+gameChar.getId()+
                            "\t Character:" +gameChar.getName()+
                            "\t Damage   : "+gameChar.getDamage()+
                            "\t Health   :"+gameChar.getHealth()+
                            "\t Money    : "+gameChar.getMoney());
        }
        System.out.println("-----------------------------------------------------------------");
        System.out.print("Please select a character : ");

        int selectChar= input.nextInt();
        switch (selectChar){
            case 1:
                initPlayer(new Samurai());
                break;
            case 2:
                initPlayer(new Archer());
                break;
            case 3:
                initPlayer(new Knight());
                break;
            default:
                initPlayer(new Samurai());
        }
        System.out.println("-----------------------------------------------------------------");


    }


    public void initPlayer(GameChar gameChar){
        this.setDamage(gameChar.getDamage());
        this.setHealth(gameChar.getHealth());
        this.setOrjinalHealth(gameChar.getHealth());
        this.setMoney(gameChar.getMoney());
        this.setCharName(gameChar.getName());
    }
    public void printInfo(){
        System.out.println(
                "Weapon : " +this.getInventory().getWeapon().getName()+
                        ", Armor : " +this.getInventory().getArmor().getName()+
                        ", Block : " +this.getInventory().getArmor().getBlock()+
                        ", Damage : " + this.getTotalDamage()+
                        ", Health : " + this.getHealth()+
                        ",  Balance : " + this.getMoney());


    }
    public int getTotalDamage(){
        return damage + this.getInventory().getWeapon().getDamage();
    }
    public int getDamage() {
        return damage + this.getInventory().getWeapon().getDamage();
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if(health<0) {
            health = 0;
        }
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public int getOrjinalHealth() {
        return orjinalHealth;
    }

    public void setOrjinalHealth(int orjinalHealth) {
        this.orjinalHealth = orjinalHealth;
    }
    public Weapons getWeapon() {
        return this.getInventory().getWeapon();
    }

    public Armors getArmor() {
        return this.getInventory().getArmor();
    }

}
