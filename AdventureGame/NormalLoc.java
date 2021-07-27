package AdventureGame;

public class NormalLoc extends Location {
    public NormalLoc(Player player, int id, String name) {
        super(player,id, name);
    }

    @Override
    public boolean onLocation(){
        return true;
    }
}
