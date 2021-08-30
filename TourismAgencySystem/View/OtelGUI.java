package TourismAgencySystem.View;


import TourismAgencySystem.Model.Manager;
import TourismAgencySystem.Model.Otel;
import TourismAgencySystem.Helper.Config;
import TourismAgencySystem.Helper.Helper;


import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.util.Locale;

public class OtelGUI extends JFrame{
    private JPanel wrapper;
    private JPanel pnl_otel_list;
    private JLabel lbl_otel_name;
    private JLabel lbl_otel_star;
    private JLabel lbl_otel_city;
    private JLabel lbl_otel_type;
    private JLabel lbl_otel_address;
    private JLabel lbl_otel_mail;
    private JLabel lbl_otel_tel;
    private JLabel lbl_otel_servis;
    private JLabel lbl_otel_oto;
    private JLabel lbl_otel_spa;
    private JLabel lbl_otel_wifi;
    private JLabel lbl_otel_havuz;
    private JLabel lbl_otel_fitness;
    private JLabel lbl_otel_conc;
    private JLabel lbl_otel_sing_room;
    private JLabel lbl_otel_dou_room;
    private JLabel lbl_otel_suit_room;
    private JLabel lbl_room_bed;
    private JLabel lbl_otel_room_tv;
    private JLabel lbl_otel__room_mini;
    private JLabel lbl_otel_room_kasa;
    private JLabel lbl_otel_room_konsol;
    private JLabel lbl_single_priece;
    private JLabel lbl_double_price;
    private JLabel lbl_suit_price;
    private JLabel lbl_otel_man;
    private JButton Btn_add_otel;
    private JButton otelGüncelleButton;
    private final Manager manager;

    OtelGUI(Manager manager){
       this.manager = manager;
        add(wrapper);
        setSize(1000,500);
        setLocation(Helper.screenCenterPoint("x", getSize()),Helper.screenCenterPoint("y",getSize()));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle(Config.PROJECT_TITLE);
        setVisible(true);
        lbl_otel_man.setText("Hoşgeldiniz " + manager.getName().toUpperCase(Locale.ROOT));
        loadImageModel();

        Btn_add_otel.addActionListener(e -> {

            OtelAddGUI otelAddGUI = new OtelAddGUI();
        });
    }
    
    private void loadImageModel() {

        for(Otel obj : Otel.getList()) {

            lbl_otel_name.setText(obj.getName());
            lbl_otel_address.setText(obj.getAddress());
            lbl_otel_star.setText(String.valueOf(obj.getStar())+"yıldız");
            lbl_otel_city.setText(obj.getCity() + " / " + obj.getArea());
            lbl_otel_type.setText(obj.getType());
            lbl_otel_address.setText(obj.getAddress());
            lbl_otel_mail.setText(obj.getMail());
            lbl_otel_tel.setText(obj.getPhone());

           lbl_otel_oto.setText((obj.getOtelproperty()));
          }
    }
    public static void main(String[] args) {
        Manager op = new Manager();
        op.setId(1);
        op.setName("Yasemin ");
        op.setPass("123");
        op.setType("otel");
        op.setUname("yasemin");

        OtelGUI otelGUI = new OtelGUI(op);
    }
}
