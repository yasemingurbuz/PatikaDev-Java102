package AdventureGame.place;

import AdventureGame.BattleLoc;
import AdventureGame.Monster.Snake;
import AdventureGame.Player;
import AdventureGame.Inventories.RandomItem;

public class Mine extends BattleLoc {
    public Mine(Player player) {
        super(player, 6, "Mine", new Snake(), new RandomItem(), 5);

    }

}
