package TourismAgencySystem.Model;

import TourismAgencySystem.Helper.DBConnector;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class OtelProperty {
    private int id;
    private String property;

    public OtelProperty(int id, String property) {
        this.id = id;
        this.property = property;
    }


    public static ArrayList<OtelProperty> getList(){
        ArrayList<OtelProperty> otelPropertiesList = new ArrayList<>();
        OtelProperty obj;
        try {
            Statement st = DBConnector.getInstance().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM otelproperty");
            while (rs.next()){
                obj= new OtelProperty(rs.getInt("id"),
                        rs.getString("name")
                );
                otelPropertiesList.add(obj);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return otelPropertiesList;
    }

    public int getId() {
        return id;
    }
    public static OtelProperty getFetch(int id) {
        OtelProperty obj = null;
        String query = "SELECT * FROM otelproperty WHERE id = ? ";
        try {
            PreparedStatement pr = DBConnector.getInstance().prepareStatement(query);
            pr.setInt(1, id);
            ResultSet rs = pr.executeQuery();
            if (rs.next()) {
                obj = new OtelProperty(rs.getInt("id"),
                        rs.getString("property")
                );

            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return obj;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }
}
