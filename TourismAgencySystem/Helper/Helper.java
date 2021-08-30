package TourismAgencySystem.Helper;

import javax.swing.*;
import java.awt.*;

public class Helper {
    public static void setLayout(){
        for(UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()){
            if("Nimbus".equals(info.getName())){
                try {
                    UIManager.setLookAndFeel(info.getClassName());
                } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
                    e.printStackTrace();
                }
                break;
            }
        }

    }
    public  static int screenCenterPoint(String eksen , Dimension size){
      int point=0;
        switch (eksen){
            case "x":
                point = (Toolkit.getDefaultToolkit().getScreenSize().width - size.width) / 2;
                break;
            case "Y":
                point = (Toolkit.getDefaultToolkit().getScreenSize().height - size.height)/2;
                break;
            default:
                point = 0;
        }
        return point;
    }
    public static boolean isFieldEmpty(JTextField field) {
        return field.getText().trim().isEmpty();
    }
    public static boolean isAreaEmpty(JTextArea area) {
        return area.getText().trim().isEmpty();
    }

    public static void showMsh(String str){
        optionPaneTR();
        String msg;
        String title;
        switch(str){
            case "fill":
                msg = " Lütfen tüm alanları doldurunuz !";
                title =" Hata!";
                break;
            case "done":
                msg = "İşlem başarılı!";
                title ="Sonuç";
                break;
            case "error":
                msg = "Bir hata oluştu!";
                title="Hata";
                break;
            default:
                msg = str;
                title = "Hata";
        }

        JOptionPane.showMessageDialog(null , msg , title , JOptionPane.INFORMATION_MESSAGE);
    }
    public static boolean confirn(String str){
        optionPaneTR();
        String msg;
        switch (str){
            case "sure":
                msg = "Bu işlemi gerçekleştirmek istediğine emin misiniz?";
                break;
            default:
                msg =str;
        }
        return JOptionPane.showConfirmDialog(null, msg, "Son kararın mı?", JOptionPane.YES_NO_OPTION) == 0;
    }


    public static void optionPaneTR(){
        UIManager.put("OptionPane.okButtonText","Ok");
        UIManager.put("OptionPane.yesButtonText","Yes");
        UIManager.put("OptionPane.noButtonText","No");


    }

}
