package AdventureGame;

import AdventureGame.Inventories.Gun;
import AdventureGame.Inventories.Rifle;
import AdventureGame.Inventories.Sword;

public class Weapons extends Items {
    private String name;
    private int id;
    private int damage;
    private int price;

    public Weapons(int id, String name, int damage, int price) {
        super(id,name);
        this.damage = damage;
        this.price = price;
    }

    public static Weapons[] weapons() {
        Weapons[] weapons = {new Gun(),new Sword(),new Rifle()};
        return weapons;
    }


    public static Weapons getWeaponObjById(int id) {
        for(Weapons weapon : Weapons.weapons()) {
            if(weapon.getId() == id) {
                return weapon;
            }
        }
        return null;
    }


    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


}