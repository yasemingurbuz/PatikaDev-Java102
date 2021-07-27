package AdventureGame.place;

import AdventureGame.Award.Food;
import AdventureGame.BattleLoc;
import AdventureGame.Monster.Vampire;
import AdventureGame.Player;

public class Cave extends BattleLoc {

public Cave(Player player) {
            super(player, 4,"Cave",new Vampire(),new Food(),3);

            }
}
