package InsuranceManagementSystem;

import java.util.ArrayList;
import java.util.TreeSet;

public class AccountManager {

         TreeSet<Account> dataList = new TreeSet<Account>();

        public void login(String mail,String password) {

        for(User user : list()) {
        try {
                   Account.AuthenticationStatus(user.getEmail(),user.getPassword(),mail,password);
           } catch (InvalidAuthenticationException e) {
        // TODO Auto-generated catch block
           e.printStackTrace();
                  }
                 }
        }

        public ArrayList<User> list() {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User(1, "Yasemin", "Gürbüz", "ad@gmail.com", "123", "Bilgisayar Mühendisi", 24, null, null));
        return users;

}

        }