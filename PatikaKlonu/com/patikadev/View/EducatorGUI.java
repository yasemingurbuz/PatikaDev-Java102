package com.patikadev.View;

import com.patikadev.Helper.Config;
import com.patikadev.Helper.Helper;
import com.patikadev.Helper.Item;
import com.patikadev.Model.Contents;
import com.patikadev.Model.Course;
import com.patikadev.Model.Patika;
import com.patikadev.Model.User;

import javax.jws.soap.SOAPBinding;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Objects;

public class EducatorGUI extends JFrame{
    private JPanel wrapper;
    private JTabbedPane pnl_contents;
    private JTable tbl_edu_course_list;
    private JScrollPane scr_edu_courses;
    private JPanel pnl_edu_courses;
    private JPanel pnl_edu_contents;
    private JTable tbl_edu_cnt_list;
    private JTextField fld_cnt_title;
    private JTextArea fld_cnt_exp;
    private JComboBox cmb_cnt_patika;
    private JTextField fld_cnt_youtube;
    private JButton btn_cnt_add;
    private JTextField fld_cnt_src_title;
    private JTextField fld_cnt_src_patika;
    private JButton btn_cnt_search;
    private DefaultTableModel mdl_edu_course_list;
    private Object[] row_edu_course_list;

    private DefaultTableModel mdl_edu_cnt_list;
    private Object[] row_edu_cnt_list;


    public EducatorGUI(){
        add(wrapper);
        setSize(1000,700);
        setLocation(Helper.screenCenterPoint("x", getSize()),Helper.screenCenterPoint("y",getSize()));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle(Config.PROJECT_TITLE);
        setResizable(false);
        setVisible(true);

        // --------------COURSE ----------------------------
        mdl_edu_course_list = new DefaultTableModel();
        Object[] col_edu_courseList={"ID","Course Name","Programme Language","Patika","Educator"};
        mdl_edu_course_list.setColumnIdentifiers(col_edu_courseList);
        row_edu_course_list = new Object[col_edu_courseList.length];
        loadEduCourseModel();
        tbl_edu_course_list.setModel(mdl_edu_course_list);
        tbl_edu_course_list.getColumnModel().getColumn(0).setMaxWidth(75);
        tbl_edu_course_list.getTableHeader().setReorderingAllowed(false);

        //--------------CONTETS -----------------------------
        mdl_edu_cnt_list = new DefaultTableModel();
        Object[] col_edu_cntList={"ID","Title","Explanation","Patika","Youtube"};
        mdl_edu_cnt_list.setColumnIdentifiers(col_edu_cntList);
        row_edu_cnt_list = new Object[col_edu_cntList.length];
        loadEduContentsModel();
        tbl_edu_cnt_list.setModel(mdl_edu_cnt_list);
        tbl_edu_cnt_list.getColumnModel().getColumn(0).setMaxWidth(75);
        tbl_edu_cnt_list.getTableHeader().setReorderingAllowed(false);

       loadPatikaCombo();

        btn_cnt_add.addActionListener(e -> {
            Item patikaItem = (Item) cmb_cnt_patika.getSelectedItem();
            if(Helper.isFieldEmpty(fld_cnt_title)|| Helper.isAreaEmpty(fld_cnt_exp)|| Helper.isFieldEmpty(fld_cnt_youtube)){
                Helper.showMsh("fill");
            }else{
                String title = fld_cnt_title.getText();
                String exp = fld_cnt_exp.getText();
                String youtube = fld_cnt_youtube.getText();

                if(Contents.add(title, exp, patikaItem.getKey(),youtube)){
                    Helper.showMsh("done");
                    loadEduContentsModel();
                    loadPatikaCombo();
                    fld_cnt_title.setText(null);
                    fld_cnt_exp.setText(null);
                    fld_cnt_youtube.setText(null);
                }
            }
        });
        btn_cnt_search.addActionListener(e -> {
            String title = fld_cnt_src_title.getText();
            String patika = fld_cnt_src_patika.getText();
            String query = Contents.searchQuery(title, patika);
            ArrayList<Contents> searchingContents = Contents.searchContentsList(query);
            loadContentsModel(Contents.searchContentsList(query));
        });
    }

    private void loadEduCourseModel(){
     //   for(User obj : User.getList()){
            ///if(obj.getUname()==
        DefaultTableModel clearModel = (DefaultTableModel) tbl_edu_course_list.getModel();
        clearModel.setRowCount(0);
        int i= 0;
        for(Course c : Course.getList()){
            i=0;
            row_edu_course_list[i++] = c.getId();
            row_edu_course_list[i++] = c.getName();
            row_edu_course_list[i++] = c.getLang();
            row_edu_course_list[i++] = c.getPatika().getName();
            row_edu_course_list[i++] = c.getEducator().getName();
            mdl_edu_course_list.addRow(row_edu_course_list);
//        }}
}}
    private void loadEduContentsModel(){

        DefaultTableModel clearModel = (DefaultTableModel) tbl_edu_cnt_list.getModel();
        clearModel.setRowCount(0);
        int i= 0;
        for(Contents c : Contents.getList()){
            i=0;
            row_edu_cnt_list[i++] = c.getId();
            row_edu_cnt_list[i++] = c.getTitle();
            row_edu_cnt_list[i++] = c.getExp();
            row_edu_cnt_list[i++] = c.getPatika().getName();
            row_edu_cnt_list[i++] = c.getYoutube();
  //          row_edu_course_list[i++] = c.getEducator().getName();
            mdl_edu_cnt_list.addRow(row_edu_cnt_list);

        }}

    public void loadPatikaCombo(){
        cmb_cnt_patika.removeAllItems();
        for(Patika obj : Patika.getList()){
            cmb_cnt_patika.addItem(new Item(obj.getId(),obj.getName()));
        }
    }
    public void loadContentsModel(ArrayList<Contents> list){

        DefaultTableModel clearModel = (DefaultTableModel) tbl_edu_cnt_list.getModel();
        clearModel.setRowCount(0);

        for(Contents c : list){
            int i = 0;
            row_edu_cnt_list[i++] = c.getId();
            row_edu_cnt_list[i++] = c.getTitle();
            row_edu_cnt_list[i++] = c.getExp();
            row_edu_cnt_list[i++] = c.getPatika().getName();
            row_edu_cnt_list[i++] = c.getYoutube();
            mdl_edu_cnt_list.addRow(row_edu_cnt_list);}
    }


    public static void main(String[] args) {
        EducatorGUI educatorGUI = new EducatorGUI();
    }
}
