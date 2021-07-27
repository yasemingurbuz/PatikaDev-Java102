package AdventureGame;

public class Inventory {

    private Weapons weapon;
    private Armors armor;
    private Awards award;

    public Inventory() {
        this.weapon = new Weapons(-1, "Fist", 0,0);
        this.armor = new Armors(0,"Rag",0,0);

    }
    int count=0;
    static String[] inventoryBox = {"","","","","","","","","","",""};

    public  String[] inventoryBox(String award) {

        inventoryBox[count] = award;
        count++;
        return inventoryBox;
    }

    public Weapons getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapons weapon) {
        this.weapon = weapon;
    }

    public Armors getArmor() {
        return armor;
    }

    public void setArmor(Armors armor) {
        this.armor = armor;
    }

    public Awards getAward() {
        return award;
    }

    public void setAward(Awards award) {
        this.award = award;
    }
}
