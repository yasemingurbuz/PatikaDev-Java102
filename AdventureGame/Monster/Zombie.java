package AdventureGame.Monster;

import AdventureGame.Award.Money;
import AdventureGame.Obstacle;

public class Zombie extends Obstacle {
    public Zombie() {
        super(1,"Zombie",3,10,new Money());
    }
}
