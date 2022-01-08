import com.OnlineBankaSistemi.Helper.Helper;
import org.json.simple.JSONArray;
import org.json.simple.JSONParser;

import javax.swing.*;
import java.io.FileReader;

public class MainGUI extends JFrame{
    private JPanel wrapper;
    private JTextField fld_login_tcno;
    private JPasswordField fld_login_pass;
    private JButton btn_login;
    JSONArray jrr = new JSONArray();

    public MainGUI(){
        add(wrapper);
        setSize(400,300);
        setLocation(Helper.screenCenterPoint("x", getSize()),Helper.screenCenterPoint("y",getSize()));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle("Patika Dev Banka");
        setVisible(true);

        btn_login.addActionListener(e -> {

            Object ob = null;
            JSONParser Jp = new JSONParser();
            try{
                FileReader file = new FileReader("Users.json");
                ob= Jp.parse(file);
                jrr = (JSONArray) ob;
                file.close();
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null,"Error Occured While fetching");

            }
            JSONObject obj = new JSONObject();
            int size = jrr.size();

            obj.put("TcNo",fld_login_tcno.getText());
            obj.put("Password",fld_login_pass.getText());
            for(int i=0; i<size;i++){
                if(obj.equals(jrr.get(0))){
                    JOptionPane.showMessageDialog(null,"Password matched");
                    break;
                }else if(i==size-1){
                    JOptionPane.showMessageDialog(null,"Incorrect User/password!");
            }}
        });
    }

    public static void main(String[] args) {
        MainGUI mainGUI = new MainGUI();
    }
}
