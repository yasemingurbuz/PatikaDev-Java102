package AdventureGame;

import AdventureGame.Inventories.HeavyArmor;
import AdventureGame.Inventories.LightArmor;
import AdventureGame.Inventories.MediumArmor;

public class Armors extends Items {


    private int block;
    private int price;

    public Armors(int id, String name, int block, int price) {
        super(id,name);
        this.block = block;
        this.price = price;
    }

    public static Armors[] armors() {
        Armors[] armors = {new LightArmor(),new MediumArmor(),new HeavyArmor()};
        return armors;
    }


    public static Armors getArmorById(int id) {
        for(Armors armor: Armors.armors()) {
            if(armor.getId() == id) {
                return armor;
            }
        }
        return null;
    }

    public int getBlock() {
        return block;
    }

    public void setBlock(int block) {
        this.block = block;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }



}