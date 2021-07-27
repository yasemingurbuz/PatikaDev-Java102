package AdventureGame;

public class SafeHouse extends NormalLoc{
    public SafeHouse(Player player) {
        super(player,1,"Safe House");
    }

    @Override
    public boolean onLocation() {
        System.out.println("You're in Safe House ! \n");
        int i = 0;
        for(String inventory : Inventory.inventoryBox) {
            if(inventory.equals("Food")) {
                i++;
            }else if(inventory.equals("Water")) {
                i++;
            }else if (inventory.equals("Firewood")) {
                i++;
            }
        }
        if(i == 3) {
            System.out.println("Congratulations !! You won the game .");
            return false;
        }else {
            System.out.println("Required items are missing!!\n\nYour soul is renewed \n\nYou can continue the game");
            this.getPlayer().setHealth(this.getPlayer().getOrjinalHealth());
            return true;
        }
    }
}
