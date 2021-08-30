package TourismAgencySystem.View;

import TourismAgencySystem.Model.Manager;
import TourismAgencySystem.Model.Otel;
import TourismAgencySystem.Helper.Config;
import TourismAgencySystem.Helper.Helper;
import com.patikadev.Model.Patika;
import com.patikadev.View.UpdatePatikaGUI;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Locale;

public class OtelManagerLoginGUI extends JFrame{
    private JPanel wrapper;
    private JLabel lbl_otel_man;
    private JTable tbl_otel_list;
    private DefaultTableModel mdl_otel_list;
    private Object[] row_otel_list;
    private JPopupMenu otelMenu;

    private Manager manager;
    OtelManagerLoginGUI(Manager manager){
        this.manager = manager;
        add(wrapper);
        setSize(1000,500);
        setLocation(Helper.screenCenterPoint("x", getSize()),Helper.screenCenterPoint("y",getSize()));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle(Config.PROJECT_TITLE);
        setVisible(true);

        lbl_otel_man.setText("Hoşgeldiniz " + manager.getName().toUpperCase(Locale.ROOT));

        tbl_otel_list.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                Point point  = e.getPoint();
                int selected_row = tbl_otel_list.rowAtPoint(point);
                tbl_otel_list.setRowSelectionInterval(selected_row , selected_row);

            }
        });

        mdl_otel_list = new DefaultTableModel();
        Object[] col_otel_list = {"ID", "Otel Adı","Şehir","Bölge"};
        mdl_otel_list.setColumnIdentifiers(col_otel_list);
        row_otel_list = new Object[col_otel_list.length];
        loadOtelModel();
      //  loadPatikaCombo();
        tbl_otel_list.setModel(mdl_otel_list);
       // tbl_otel_list.setComponentPopupMenu(patikaMenu);
        tbl_otel_list.getTableHeader().setReorderingAllowed(false);
        tbl_otel_list.getColumnModel().getColumn(0).setMaxWidth(75);




    }

    private void loadOtelModel() {
        DefaultTableModel clearModel = (DefaultTableModel) tbl_otel_list.getModel();
        clearModel.setRowCount(0);
        int i= 0;
        for(Otel obj : Otel.getList()){
            i=0;
            row_otel_list[i++] = obj.getId();
            row_otel_list[i++] = obj.getName();
            row_otel_list[i++] = obj.getCity();
            row_otel_list[i++] = obj.getArea();
            mdl_otel_list.addRow(row_otel_list);
        }
    }

    public static void main(String[] args) {
        Manager op = new Manager();
        op.setId(1);
        op.setName("Onur Gürbüz");
        op.setPass("123");
        op.setType("otel");
        op.setUname("onurg");

        OtelManagerLoginGUI otelManagerLoginGUI = new OtelManagerLoginGUI(op);
    }
}
