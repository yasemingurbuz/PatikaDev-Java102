package AdventureGame.place;

import AdventureGame.Award.Water;
import AdventureGame.BattleLoc;
import AdventureGame.Monster.Bear;
import AdventureGame.Player;

public class River extends BattleLoc {
    public River(Player player) {
        super(player,5,"River",new Bear(),new Water(),3);
    }
}
