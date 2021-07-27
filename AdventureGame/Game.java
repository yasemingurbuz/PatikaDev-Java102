package AdventureGame;

import AdventureGame.place.Cave;
import AdventureGame.place.Forest;
import AdventureGame.place.Mine;
import AdventureGame.place.River;

import java.util.Scanner;

public class Game {
    private Scanner input = new Scanner(System.in);

    public void start(){
        System.out.println("Macera Oyununa Hoşgeldiniz \n");
        System.out.print("Lütfen isminizi giriniz : \n");
        String playerName = input.nextLine();

        Player player = new Player(playerName);
        System.out.println(player.getName()+ " Weolcome :) \n");

        player.selectChar();
        Location currentLocation = null;
        while(true) {
            player.printInfo();
            Location[] locations = {new SafeHouse(player),new ToolStore(player),new Forest(player),new Cave(player),new River(player),new Mine(player)};


            System.out.println("\n------------------------------------------------------------------ \n");
            System.out.println("Locations \n");
            for(Location location : locations) {
                System.out.println(location.getId() + " - " + location.getName());
            }
            System.out.println();
            System.out.println("------------------------------------------------------------------ \n");
            System.out.println("Please select the region you want to go to : ");

            int selectLocation = input.nextInt();
            for(Location location : locations) {
                if(selectLocation < 0 || selectLocation> locations.length) {
                    while(selectLocation < 0 || selectLocation> locations.length) {
                        System.out.println("Invalid Value Entered ! Re-enter !! ");
                        System.out.print("Entered Value : ");
                        selectLocation = input.nextInt();
                    }
                }

                if(selectLocation == location.getId()) {
                    for(int i = 0; i < Inventory.inventoryBox.length ; i++) {
                        if(location.getName().equals("Cave") && Inventory.inventoryBox[i] == "Food"){
                            System.out.println("You've completed this here before. You can't re-enter !!");
                            System.out.println("You're being sent to the safe house !! ");
                            currentLocation = locations[0];
                            break;
                        }
                        else if(location.getName().equals("River") && Inventory.inventoryBox[i] == "Water"){
                            System.out.println("You've completed this here before. You can't re-enter !!");
                            System.out.println("You're being sent to the safe house !! ");
                            currentLocation = locations[0];
                            break;
                        }
                        else if(location.getName().equals("Forest") && Inventory.inventoryBox[i] == "Firewood"){
                            System.out.println("You've completed this here before. You can't re-enter !!");
                            System.out.println("You're being sent to the safe house !! ");
                            currentLocation = locations[0];
                            break;
                        }

                        else {
                            currentLocation = location;
                        }
                    }

                }
            }
            System.out.println();
            if(!currentLocation.onLocation()) {
                System.out.println("You lost the game !");
                break;
            }
        }

    }

}