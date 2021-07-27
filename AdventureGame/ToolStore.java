package AdventureGame;

public class ToolStore extends NormalLoc{
    public ToolStore(Player player) {
        super(player,2, "Tool Store");
    }
    @Override
    public boolean onLocation(){
        System.out.println("---------------------- Weolcome to Tool Store ! -------------------------");
     boolean showMenu = true;
       while (showMenu) {
           System.out.println("1- Weapons");
           System.out.println("2- Armors");
           System.out.println("3- Exit");
           System.out.print("Your choice : ");
           int selectCase=Location.input.nextInt();
           while (selectCase < 1 || selectCase > 3){
               System.out.println("You entered an invalid value! ");
               selectCase = input.nextInt();
           }
           switch (selectCase){
               case 1:
                   printWeapon();
                   buyWeapon();
                   break;
               case 2:
                   printArmor();
                   buyArmor();
                   break;
               case 3:
                   System.out.println("We look forward to seeing you again! ");
                   showMenu = false;
                   break;
           }

       }
        return true;
    }
    public void printWeapon(){
        System.out.println("---------- Weapons ----------");
        for(Weapons w: Weapons.weapons()){
            System.out.println(w.getId()+" - "+w.getName()+ " < Balance : " + w.getPrice()+ ", Damage :" + w.getDamage()+" >");
        }
        System.out.println("0- Exit");

    }


    public void buyWeapon(){
        System.out.print("Choose a weapon : ");
        int selectWeaponID = input.nextInt();
        while (selectWeaponID < 0 || selectWeaponID > Weapons.weapons().length) {
            System.out.println("You entered an invalid value! ");
            selectWeaponID = input.nextInt();
        }
        if(selectWeaponID != 0){
            Weapons selectedWeapon = Weapons.getWeaponObjById(selectWeaponID);

            if(selectedWeapon != null){
                if(selectedWeapon.getPrice()>this.getPlayer().getMoney()){
                    System.out.println("You do not have enough money ! ");
                }else {
                    //Satın alınmanın gerçekleştirdiği yer
                    System.out.println("You bought the"+selectedWeapon.getName());
                    int balance =this.getPlayer().getMoney()- selectedWeapon.getPrice();
                    this.getPlayer().setMoney(balance);
                    System.out.println("Your remaining balance : " + this.getPlayer().getMoney());
                    System.out.println("your previous weapon : " + this.getPlayer().getInventory().getWeapon().getName());
                    this.getPlayer().getInventory().setWeapon(selectedWeapon);
                    System.out.println("Your new weapon : " + this.getPlayer().getInventory().getWeapon().getName());

                }

            }

        }
    }
    public void printArmor(){
        System.out.println("------------ Armors ------------------");
        for(Armors a: Armors.armors()){
            System.out.println(a.getId()+" - "+a.getName()+
                    " < Money : " + a.getPrice()+
                    ", Block :" + a.getBlock()+" >");
            System.out.println("0 - Exit");
        }

    }
    public void buyArmor() {
        System.out.print("Choose an armor : ");
        int selectArmorID = input.nextInt();
        while (selectArmorID < 0 || selectArmorID > Armors.armors().length) {
            System.out.println("You entered an invalid value!");
            selectArmorID = input.nextInt();
        }
    if(selectArmorID!=0){
        Armors selectedArmor = Armors.getArmorById(selectArmorID);
        if(selectedArmor != null){
            if(selectedArmor.getPrice()>this.getPlayer().getMoney()){
                System.out.println("You do not have enough money ! ");
            }else {
                //Satın alınmanın gerçekleştirdiği yer
                System.out.println("You bought the"+selectedArmor.getName());
                int balance =this.getPlayer().getMoney()- selectedArmor.getPrice();
                this.getPlayer().setMoney(balance);
                System.out.println("Your remaining balance : " + this.getPlayer().getMoney());
                System.out.println("your previous armor : " + this.getPlayer().getInventory().getWeapon().getName());
                this.getPlayer().getInventory().setArmor(selectedArmor);
                System.out.println("Your new armor : " + this.getPlayer().getInventory().getWeapon().getName());

            }
    }

        }
    }
}
