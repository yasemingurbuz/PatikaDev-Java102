package TourismAgencySystem.Model;

import TourismAgencySystem.Helper.DBConnector;
import TourismAgencySystem.Helper.Helper;


import java.sql.*;
import java.util.ArrayList;

public class Otel {
    private int id;
    private int user_id;
    private String name;
    private String city;
    private String area;
    private String type;
    private String  phone;
    private String address;
    private String mail;
    private String star;
    private String otelproperty;
    private User manager;

    public Otel(int id, int user_id, String name, String city,
                String area, String type, String phone, String address,
                String mail, String star,String otelproperty
                ) {

        this.id = id;
        this.user_id = user_id;
        this.name = name;
        this.city = city;
        this.area = area;
        this.type = type;
        this.phone = phone;
        this.address = address;
        this.mail = mail;
        this.star = star;
        this.otelproperty=otelproperty;
        this.manager = User.getFetch(user_id);
    }



    public static ArrayList<Otel> getList(){
        ArrayList<Otel> otelList = new ArrayList<>();
        Otel obj;
        try {
            Statement st = DBConnector.getInstance().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM otel");
            while (rs.next()){
                obj= new Otel(rs.getInt("id"),
                        rs.getInt("user_id"),
                        rs.getString("name"),
                        rs.getString("city"),
                        rs.getString("area"),
                        rs.getString("type"),
                        rs.getString("phone"),
                        rs.getString("address"),
                        rs.getString("mail"),
                        rs.getString("star"),
                    rs.getString("otelproperty")

                );
                otelList.add(obj);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return otelList;
    }

    public static Otel getFetch(int id) {
        Otel obj = null;
        String query = "SELECT * FROM otel WHERE id = ? ";
        try {
            PreparedStatement pr = DBConnector.getInstance().prepareStatement(query);
            pr.setInt(1, id);
            ResultSet rs = pr.executeQuery();
            if (rs.next()) {
                obj = new Otel(rs.getInt("id"),
                        rs.getInt("user_id"),
                        rs.getString("name"),
                        rs.getString("city"),
                        rs.getString("area"),
                        rs.getString("phone"),
                        rs.getString("type"),
                        rs.getString("address"),
                        rs.getString("mail"),
                       rs.getString("star"),
                        rs.getString("otelproperty")

                );


            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return obj;
    }

    public static boolean add(String name, String city,
                              String area, String type, String phone, String address,
                              String mail, String star, String otelproperty
                              ) {


        String query = "INSERT INTO otel (name, city, area, type, phone, address, mail, star, otelproperty) VALUES (? ,? ,? ,? ,? ,? ,? ,? ,? ,?  )";

        try {
            PreparedStatement pr = DBConnector.getInstance().prepareStatement(query);
            pr.setString(1, name);
            pr.setString(2, city);
            pr.setString(3, area);
            pr.setString(4, type);
            pr.setString(5, phone);
            pr.setString(6, address);
            pr.setString(7, mail);
            pr.setString(8, star);
            pr.setString(9,otelproperty);


            int response = pr.executeUpdate();

            if (response == -1) {
                Helper.showMsh("error");
            }
            return response != -1;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return true;
    }
    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public User getManager() {
        return manager;
    }

    public void setManager(User manager) {
        this.manager = manager;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String  getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getStar() {
        return star;
    }

    public void setStar(String star) {
        this.star = star;
    }
   public String getType() { return type; }

    public void setType(String type) {
        this.type = type;
    }

    public String getOtelproperty() {
        return otelproperty;
    }

    public void setOtelproperty(String otelproperty) {
        this.otelproperty = otelproperty;
    }
}
