package AdventureGame;

import java.util.Scanner;

public abstract class Location {
    private Player player;
    private String name;
    private int id;
    public static Scanner input = new Scanner(System.in);

    public Location(Player player, int id, String name) {
        super();
        this.player = player;
        this.id = id;
        this.name = name;
    }
    public abstract boolean onLocation();

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
