package AdventureGame.Monster;

import AdventureGame.Inventories.RandomItem;
import AdventureGame.Obstacle;

import java.util.Random;

public class Snake extends Obstacle {


    public Snake() {
        super(4,"Snake",randomDamage(),12,new RandomItem());
    }

    private static Random rnd = new Random();
    public static int randomDamage() {

        return rnd.nextInt(4)+3;
    }


}
