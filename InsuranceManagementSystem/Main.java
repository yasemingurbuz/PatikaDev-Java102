package InsuranceManagementSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("Sigorta Yönetim Sistemine Hoşgeldiniz \n");
        System.out.println("Kullanıcı Girişi");

        Scanner input = new Scanner(System.in);
        System.out.print("E mail : ");
        String mail = input.nextLine();

        System.out.print("Şifre : ");
        String password = input.nextLine();

        AccountManager accountManager = new AccountManager();
        accountManager.login(mail, password);


    }
}
