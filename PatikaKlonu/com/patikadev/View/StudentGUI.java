package com.patikadev.View;

import com.patikadev.Helper.Config;
import com.patikadev.Helper.Helper;
import com.patikadev.Model.Patika;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class StudentGUI extends JFrame{
    private JPanel wrapper;
    private JTabbedPane tabbedPane1;
    private JTable tbl_st_patika_list;
    private JScrollPane scr_st;
    private DefaultTableModel mdl_st_patika_list;
    private Object[] row_st_patika_list;

    public StudentGUI(){
        add(wrapper);
        setSize(400,400);
        setLocation(Helper.screenCenterPoint("x", getSize()),Helper.screenCenterPoint("y",getSize()));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle(Config.PROJECT_TITLE);
        setResizable(false);
        setVisible(true);


        mdl_st_patika_list = new DefaultTableModel();
        Object[] col_patika_list = {"ID", "Patika Name"};
        mdl_st_patika_list.setColumnIdentifiers(col_patika_list);
        row_st_patika_list = new Object[col_patika_list.length];
        loadPatikaModel();

        tbl_st_patika_list.setModel(mdl_st_patika_list);

        tbl_st_patika_list.getTableHeader().setReorderingAllowed(false);
        tbl_st_patika_list.getColumnModel().getColumn(0).setMaxWidth(75);



    }
    private void loadPatikaModel() {
        DefaultTableModel clearModel = (DefaultTableModel) tbl_st_patika_list.getModel();
        clearModel.setRowCount(0);
        int i= 0;
        for(Patika obj : Patika.getList()){
            i=0;
            row_st_patika_list[i++] = obj.getId();
            row_st_patika_list[i++] = obj.getName();
            mdl_st_patika_list.addRow(row_st_patika_list);
        }
    }

    public static void main(String[] args) {
        StudentGUI studentGUI = new StudentGUI();
    }
}
