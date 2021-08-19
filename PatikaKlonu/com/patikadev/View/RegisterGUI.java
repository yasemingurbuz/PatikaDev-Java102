package com.patikadev.View;

import com.patikadev.Helper.Config;
import com.patikadev.Helper.Helper;
import com.patikadev.Model.User;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class RegisterGUI extends JFrame{
    private JPanel wrapper;
    private JTextField fld_reg_name;
    private JTextField fld_reg_uname;
    private JTextField fld_reg_pass;
    private JButton btn_register;

    public RegisterGUI(){
        add(wrapper);
        setSize(300,200);
        setLocation(Helper.screenCenterPoint("x", getSize()),Helper.screenCenterPoint("y",getSize()));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle(Config.PROJECT_TITLE);
        setResizable(false);
        setVisible(true);


        btn_register.addActionListener(e -> {

            if(Helper.isFieldEmpty(fld_reg_name)|| Helper.isFieldEmpty(fld_reg_uname)|| Helper.isFieldEmpty(fld_reg_pass)){
                Helper.showMsh("fill");
            }else{
                String name = fld_reg_name.getText();
                String uname = fld_reg_uname.getText();
                String pass = fld_reg_uname.getText();
                String type= "student";
                if(User.add(name, uname, pass, type)){
                    Helper.showMsh("done");
                    StudentGUI stGUI = new StudentGUI();
                }
            }
        });
    }


}
