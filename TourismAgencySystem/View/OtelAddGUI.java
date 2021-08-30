package TourismAgencySystem.View;


import TourismAgencySystem.Helper.Config;
import TourismAgencySystem.Helper.Helper;
import TourismAgencySystem.Model.Otel;
import com.sun.org.apache.xml.internal.security.algorithms.JCEMapper;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class OtelAddGUI extends JFrame{
    private JPanel wrapper;
    private JTextField fld_double_fiyat;
    private JTextField fld_otel_name;
    private JComboBox cmb_otel_type;
    private JTextField fld_otel_star;
    private JComboBox cmb_otel_area;
    private JTextField fld_otel_address;
    private JTextField fld_otel_mail;
    private JTextField fld_otel_phone;
    private JCheckBox chb_oto;
    private JButton btn_add_otel;
    private JTextField fld_otel_city;
    private JTextField fld_otel_area;
    private JComboBox cmb_otel_city;
    private String otelproperty;
    private JCheckBox chb_havuz;
    private JCheckBox chb_wifi;
    private JCheckBox chb_servis;
    private JCheckBox chb_fitness;
    private JCheckBox chb_conc;
    private JCheckBox chb_spa;
    private JTextField fld_single_nbr;
    private JTextField fld_double_nbr;
    private JTextField fld_suit_nbr;
    private JCheckBox chb_tv;
    private JCheckBox chb_mini;
    private JCheckBox chb_konsol;
    private JCheckBox chb_kasa;
    private JTextField fld_single_fiyat;
    private JTextField fld_suit_fiyat;




    public OtelAddGUI(){

        add(wrapper);
        setSize(700,1000);
        setLocation(Helper.screenCenterPoint("x", getSize()),Helper.screenCenterPoint("y",getSize()));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle(Config.PROJECT_TITLE);
        setVisible(true);

        btn_add_otel.addActionListener(e -> {

            if(Helper.isFieldEmpty(fld_otel_name)|| Helper.isFieldEmpty(fld_otel_address)|| Helper.isFieldEmpty(fld_otel_mail)
                    || Helper.isFieldEmpty(fld_otel_phone)|| Helper.isFieldEmpty(fld_otel_star)|| Helper.isFieldEmpty(fld_otel_mail)){
                Helper.showMsh("fill");
            }else{
                String name = fld_otel_name.getText();
                String address = fld_otel_address.getText();
                String mail = fld_otel_mail.getText();
                String phone = fld_otel_phone.getText();
                String star = fld_otel_star.getText();
                String type= cmb_otel_type.getSelectedItem().toString();
                String area = fld_otel_area.getText();
                String city = fld_otel_city.getText();
                String otelproperty = null;
                if(chb_oto.isSelected()){
                    otelproperty = "Ücretsiz Otopark";
                }

                if(Otel.add(name, city, area, type,phone, address, mail, star, otelproperty)){
                    Helper.showMsh("done");
                  /*  loadUserModel();
                    fld_user_name.setText(null);
                    fld_user_pass.setText(null);
                    fld_user_uname.setText(null);
*/
                }}});


        chb_oto.addActionListener(e -> {
            otelproperty ="Ücretsiz Otopark";
        });
    }


}
