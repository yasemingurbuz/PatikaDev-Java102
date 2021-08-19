package com.patikadev.View;

import com.patikadev.Helper.Config;
import com.patikadev.Helper.Helper;
import com.patikadev.Model.Operator;
import com.patikadev.Model.User;

import javax.swing.*;


public class LoginGUI extends  JFrame{
    private JPanel wrapper;
    private JPanel wtop;
    private JTextField fld_user_name;
    private JPasswordField fld_user_pass;
    private JButton btn_login;
    private JButton registerButton;

    public LoginGUI(){
        add(wrapper);
        setSize(500,800);
        setLocation(Helper.screenCenterPoint("x", getSize()),Helper.screenCenterPoint("y",getSize()));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle(Config.PROJECT_TITLE);
        setResizable(false);
        setVisible(true);


        btn_login.addActionListener(e -> {
            if(Helper.isFieldEmpty(fld_user_name) || Helper.isFieldEmpty(fld_user_pass)){
                Helper.showMsh("fill");
            }else{

                User u = User.getFetch(fld_user_name.getText(),fld_user_pass.getText());
                if(u == null){
                    Helper.showMsh("User not found !");
                }else{
                    switch(u.getType()){
                        case "operator" :
                            OperatorGUI opGUI = new OperatorGUI((Operator) u);
                            break;
                        case "educator" :
                            EducatorGUI edGUI = new EducatorGUI();
                            break;
                        case "student" :
                            StudentGUI stGUI = new StudentGUI();
                            break;

                    }
                    dispose();

                }
            }
        });
        registerButton.addActionListener(e -> {
            Helper.setLayout();
            RegisterGUI registerGUI = new RegisterGUI();
        });
    }

    public static void main(String[] args) {
        Helper.setLayout();
        LoginGUI loginGUI = new LoginGUI();    }

}
