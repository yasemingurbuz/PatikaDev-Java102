package AdventureGame.place;

import AdventureGame.Award.Firewood;
import AdventureGame.BattleLoc;
import AdventureGame.Monster.Zombie;
import AdventureGame.Player;

public class Forest extends BattleLoc {
    public Forest(Player player) {
        super(player, 3,"Forest",new Zombie(),new Firewood(),3);
    }}
