package OnlineBankaSistemi.src.main.java;

public class Users {
    private int user_id;
    private String user_name;
    private String tcno;
    private int pass;
    private String user_address;
    private String user_phone;
    private String password;


    public Users(int user_id, String user_name,  String tcno, int pass,String user_address, String user_phone, String password) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.tcno = tcno;
        this.pass = pass;
        this.user_address = user_address;
        this.user_phone = user_phone;
        this.password = password;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getuser_name() {
        return user_name;
    }

    public void setuser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getTcno() {
        return tcno;
    }

    public void setTcno(String tcno) {
        this.tcno = tcno;
    }

    public int getPass() {
        return pass;
    }

    public void setPass(int pass) {
        this.pass = pass;
    }
    public String getUser_address() {
        return user_address;
    }

    public void setUser_address(String user_address) {
        this.user_address = user_address;
    }

    public String getUser_phone() {
        return user_phone;
    }

    public void setUser_phone(String user_phone) {
        this.user_phone = user_phone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



}
