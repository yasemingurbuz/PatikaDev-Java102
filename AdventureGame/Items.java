package AdventureGame;

import AdventureGame.Inventories.*;

public class Items {

    private int id;
    private String name;


    public Items(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public static Items[] items() {
        Items[] items = {new Gun(),new Sword(),new Rifle(),new HeavyArmor(),new LightArmor(),new MediumArmor()};
        return items;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
