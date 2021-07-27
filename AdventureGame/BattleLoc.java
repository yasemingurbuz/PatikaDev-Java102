package AdventureGame;

import java.util.Random;

public abstract class BattleLoc extends Location{
    private Obstacle obstacle;
    private Awards award;
    private int maxObstacle;

    public BattleLoc(Player player, int id, String name, Obstacle obstacle, Awards award, int maxObstacle) {
        super(player,id, name);
        this.obstacle=obstacle;
        this.award = award;
        this.maxObstacle = maxObstacle;
    }

    @Override
    public boolean onLocation() {
        int obsNumber = this.randomObstacleNumber();
        System.out.println("You're here now : " + this.getName());
        System.out.println("Be careful ! " +obsNumber+" piece "+this.getObstacle().getName()+" live hear. ");
        System.out.println("<W>ar  or <R>un : ");
        String selectCase = input.nextLine();
        selectCase = selectCase.toUpperCase();
        if(selectCase.equals("W")){
            System.out.println("Let the War Begin !");
            System.out.println("-----------------------");
            if(combat(obsNumber)){
                System.out.print(this.getName() + " you defeated all the enemies ! ");
                System.out.println(" You have won " + this.getAward().getName());
                if(this.getObstacle().getAward().getName() == "Money") {
                    this.getPlayer().setMoney(this.getPlayer().getMoney() + this.getObstacle().getMoney());
                    System.out.println("YOur balance : " + this.getPlayer().getMoney());

                }
                if(this.getAward().getName() != "Money") {
                    this.getPlayer().getInventory().inventoryBox(this.getAward().getName());
                }else {
                    this.getPlayer().setMoney(this.getPlayer().getMoney() + this.getObstacle().getMoney());
                    System.out.println("Your balance : " + this.getPlayer().getMoney());
                }

                System.out.println("Inventories : ");
                for(int j = 0; j < Inventory.inventoryBox.length ; j++) {
                    System.out.print(Inventory.inventoryBox[j] + " ");
                }
                return true;
            }
        }
        if(this.getPlayer().getHealth() <= 0){
            System.out.print("You died !");
            return false;
        }
        return true;
    }

    // Begin War
    public boolean combat(int obsNumber){
        int start = randomStart();
        for( int i = 1; i <= obsNumber; i++){
            this.getObstacle().setHealth(this.getObstacle().getOrjinalHealth());
            playerStats();
            obstacleStats(i);
            System.out.println("------------------------------------------------------------------ \n");
            if(start==0) {
                while(this.getPlayer().getHealth()>0 && this.getObstacle().getHealth()>0) {
                    System.out.println();
                    System.out.println("\nShot" + this.getObstacle().getName());

                    int monsterDamage = this.getObstacle().getDamage() - this.getPlayer().getArmor().getBlock();
                    if(monsterDamage < 0 ) {
                        monsterDamage = 0;
                    }
                    this.getPlayer().setHealth(this.getPlayer().getHealth() - monsterDamage);
                    afterHit(i);
                    if(this.getPlayer().getHealth()>0) {
                        if(this.getObstacle().getHealth()>0) {
                            System.out.println("\n 1 - Hit \n 2 - Run  \n!! IF THE VALUE ENTERED IS WRONG, YOU WILL BE QUALIFIED !! ");
                            int selectCase= input.nextInt();
                            if(selectCase == 1) {
                                System.out.println("You shot\n");
                                this.getObstacle().setHealth(this.getObstacle().getHealth() - this.getPlayer().getTotalDamage());
                                afterHit(i);
                            }else if(selectCase !=1 && selectCase != 2){
                                return false;
                            }
                            else if(selectCase == 2) {
                                return false;
                            }
                        }else {
                            System.out.println("You defeated the enemy !");
                            System.out.println("You have won "+this.getObstacle().getMoney() + " , " + this.getObstacle().getAward().getName());
                            if(this.getObstacle().getAward().getName() == "Money") {
                                this.getPlayer().setMoney(this.getPlayer().getMoney() + this.getObstacle().getMoney());
                                System.out.println("Your balance : " + this.getPlayer().getMoney());
                            }

                        }
                    }else {
                        System.out.print("You dead.");
                        return false;
                    }

                }

            }else if(start == 1) {
                while(this.getPlayer().getHealth()>0 && this.getObstacle().getHealth()>0) {
                    System.out.println();

                    if(this.getPlayer().getHealth()>0) {
                        System.out.println("\n 1 - Hit \n 2 - Run  \n!! IF THE VALUE ENTERED IS WRONG, YOU WILL BE QUALIFIED !! ");
                        int selectCase= input.nextInt();

                        if(selectCase == 1) {
                            System.out.println("You shot\n");
                            this.getObstacle().setHealth(this.getObstacle().getHealth() - this.getPlayer().getTotalDamage());
                            afterHit(i);
                            if(this.getObstacle().getHealth()>0) {
                                System.out.println("\nShot" + this.getObstacle().getName());
                                int monsterDamage = this.getObstacle().getDamage() - this.getPlayer().getArmor().getBlock();
                                if(monsterDamage < 0 ) {
                                    monsterDamage = 0;
                                }
                                this.getPlayer().setHealth(this.getPlayer().getHealth() - monsterDamage);
                                afterHit(i);
                                if(this.getPlayer().getHealth() <= 0) {
                                    System.out.print("You died!");
                                    return false;
                                }
                            }else {
                                System.out.println("You defeated the enemy !");
                                System.out.println("You have won "+this.getObstacle().getMoney() +" , "+ this.getObstacle().getAward().getName());
                                if(this.getObstacle().getAward().getName() == "Money") {
                                    this.getPlayer().setMoney(this.getPlayer().getMoney() + this.getObstacle().getMoney());
                                    System.out.println("Your balance : " + this.getPlayer().getMoney());
                                }

                            }
                        }else if(selectCase !=1 && selectCase != 2){
                            return false;
                        }
                        else if(selectCase == 2) {
                            return false;
                        }
                    }
                    else {
                        System.out.print("You died! ");
                        return false;
                    }

                }

            }
        }

        if(this.getPlayer().getHealth() > 0) {
            return true;
        }

        System.out.println("------------------------------------------------------------------ \n");
        return false;
    }
    public boolean escape() {
        return true;
    }
    public void afterHit(int i){
        System.out.println("Your life : " + this.getPlayer().getHealth());
        System.out.println(this.getObstacle().getName() + " life : " + this.getObstacle().getHealth() );
        System.out.println("------------------------");

    }
    public void playerStats(){
        System.out.println("Player Values");
        System.out.println("------------------------------------");
        System.out.println("Health  : "+ this.getPlayer().getHealth());
        System.out.println("Weapon  : "+ this.getPlayer().getInventory().getWeapon().getName());
        System.out.println("Damage  : "+ this.getPlayer().getTotalDamage());
        System.out.println("Armor   : "+ this.getPlayer().getInventory().getArmor().getName());
        System.out.println("Block   : "+ this.getPlayer().getInventory().getArmor().getBlock());
        System.out.println("Balance : " + this.getPlayer().getMoney());
        System.out.println("Inventories : ");
        for(int j = 0 ; j <Inventory.inventoryBox.length ; j++) {
            System.out.print(Inventory.inventoryBox[j] + " ");
        }
        System.out.println();
    }
    public void obstacleStats(int i){
        System.out.println(i + " . " +this.getObstacle().getName()+ " Values ");
        System.out.println("------------------------------------");
        System.out.println("Health : "+ this.getObstacle().getHealth());
        System.out.println("Damage : "+ this.getObstacle().getDamage());
        System.out.println("Prize  : "+ this.getObstacle().getAward());

    }
    public int randomObstacleNumber(){
        Random r = new Random();
        return r.nextInt(this.getMaxObstacle())+1;
    }
    public int randomStart() {
        Random rnd = new Random();
        return rnd.nextInt(2);
    }

    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public Awards getAward() {
        return award;
    }


    public void setAward(Awards award) {
        this.award = award;
    }

    public int getMaxObstacle() {
        return maxObstacle;
    }

    public void setMaxObstacle(int maxObstacle) {
        this.maxObstacle = maxObstacle;
    }
}
