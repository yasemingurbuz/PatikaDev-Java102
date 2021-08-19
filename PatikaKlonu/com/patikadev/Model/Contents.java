package com.patikadev.Model;

import com.patikadev.Helper.DBConnector;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Contents {
    private int id;
    private String title;
    private String exp;
    private int patika_id;
    private String youtube;
    private Patika patika;

    public Contents(int id, String title, String exp, int patika_id, String youtube) {
        this.id = id;
        this.title = title;
        this.exp = exp;
        this.patika_id=patika_id;
        this.youtube = youtube;
        this.patika = Patika.getFetch(patika_id);
    }

    public Patika getPatika() {
        return patika;
    }

    public void setPatika(Patika patika) {
        this.patika = patika;
    }

    public int getPatika_id() {
        return patika_id;
    }

    public void setPatika_id(int patika_id) {
        this.patika_id = patika_id;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    public String getYoutube() {
        return youtube;
    }

    public void setYoutube(String youtube) {
        this.youtube = youtube;
    }
    public static ArrayList<Contents> getList(){
        ArrayList<Contents> cntList = new ArrayList<>();
        Contents obj;
        try {
            Statement st = DBConnector.getInstance().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM contents");
            while (rs.next()){
                obj= new Contents(rs.getInt("id"),
                        rs.getString("title"),
                        rs.getString("exp"),
                        rs.getInt("patika_id"),
                        rs.getString("youtube"));
                cntList.add(obj);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return cntList;
    }
    public static boolean add(String title, String exp, int patika_id,String youtube){
        String query = "INSERT INTO contents ( title, exp, patika_id,youtube) VALUES (?,?,?,?)";
        try {
            PreparedStatement pr = DBConnector.getInstance().prepareStatement(query);

            pr.setString(1,title);
            pr.setString(2,exp);
            pr.setInt(3,patika_id);
            pr.setString(4,youtube);
            return pr.executeUpdate() != -1;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return true;
    }
    public static String searchQuery(String title, String patika) {
        String query = "SELECT * FROM contents WHERE title LIKE '%{{title}}%'"
                //" AND patika LIKE '%{{patika_id}}%'"
                ;
        query = query.replace("{{title}}",title);
//        query = query.replace("{{patika}}",patika);

        return query;
    }

    public static ArrayList<Contents> searchContentsList(String query) {
        ArrayList<Contents> cntList = new ArrayList<>();
        Contents obj;
        try {
            Statement st = DBConnector.getInstance().createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                obj= new Contents(rs.getInt("id"),
                        rs.getString("title"),
                        rs.getString("exp"),
                        rs.getInt("patika_id"),
                        rs.getString("youtube"));
                cntList.add(obj);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return cntList;
    }

}
