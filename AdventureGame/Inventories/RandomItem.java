package AdventureGame.Inventories;

import AdventureGame.Awards;
import AdventureGame.Award.Money;
import AdventureGame.Items;

import java.util.Random;

public class RandomItem extends Awards {

    public RandomItem() {
        super(randomAward(),name());

    }

    public static int  randomAward() {

        Random rnd = new Random();
        int item = rnd.nextInt(100);
        int award = rnd.nextInt(100);
        if(item<45) {
            return 0;
        }else if(item<70) {
            return new Money().getId();

        }else if(item <85) {
            if(award<20) {
                return new Rifle().getId();
            }else if(award <50) {
                return new Sword().getId();
            }else {
                return new Gun().getId();
            }

        }else {
            if(award<20) {
                return new HeavyArmor().getId();
            }else if(award <50) {
                return new MediumArmor().getId();
            }else {
                return new HeavyArmor().getId();
            }
        }

    }

    public static String name() {

        for(Items item : items()) {
            if(item.getId() == randomAward()){
                return item.getName();
            }
        }
        return "Para";
    }

}