package TourismAgencySystem.View;

import TourismAgencySystem.Helper.Config;
import TourismAgencySystem.Helper.Helper;

import TourismAgencySystem.Model.Manager;
import TourismAgencySystem.Model.User;



import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainGUI extends JFrame{
    private JPanel wrapper;
    private JTextField fld_login_uname;
    private JPasswordField fld_login_pass;
    private JButton girişYapButton;

    public MainGUI(){
        add(wrapper);
        setSize(500,400);
        setLocation(Helper.screenCenterPoint("x", getSize()), Helper.screenCenterPoint("y",getSize()));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle(Config.PROJECT_TITLE);
        setVisible(true);
        girişYapButton.addActionListener(e -> {
            if(Helper.isFieldEmpty(fld_login_uname) || Helper.isFieldEmpty(fld_login_pass)){
                Helper.showMsh("fill");
            }else{

                User u = User.getFetch(fld_login_uname.getText(),fld_login_pass.getText());
                if(u == null){
                    Helper.showMsh("User not found !");
                }else{

                 switch(u.getType()){
                        /*case "acente" :
                            OperatorGUI opGUI = new OperatorGUI((Operator) u);
                            break;
*/
                    case "otel" :
                            OtelManagerLoginGUI otelManagerLoginGUI = new OtelManagerLoginGUI((Manager) u);
                            break;

                    }
                    dispose();

                }
            }
        });

    }
    public static void main(String[] args) {
        MainGUI mainGUI = new MainGUI();
    }
}
