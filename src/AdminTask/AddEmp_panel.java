/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdminTask;

import java.awt.CardLayout;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class AddEmp_panel extends javax.swing.JPanel {

   
    public AddEmp_panel() {
        initComponents();
        Adminlb.setText( Admindash.Adminname);
         for(int i=1;i<=31;i++){
        daycmb.addItem(""+i);
        }
        for(int i=1;i<=12;i++){
            monthcmb.addItem(""+i);
        }
        for(int i=1947;i<2013;i++){
            yearcmb.addItem(""+i);
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Addemp = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        addresstxt = new javax.swing.JTextArea();
        surnametxt = new javax.swing.JTextField();
        usernametxt = new javax.swing.JTextField();
        mobiletxt = new javax.swing.JTextField();
        emailidtxt = new javax.swing.JTextField();
        daycmb = new javax.swing.JComboBox<>();
        monthcmb = new javax.swing.JComboBox<>();
        yearcmb = new javax.swing.JComboBox<>();
        savebt = new javax.swing.JButton();
        resetbt = new javax.swing.JButton();
        maleradio = new javax.swing.JRadioButton();
        femaleradio = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        firstnametxt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        fathernametxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        statetxt = new javax.swing.JTextField();
        pintxt = new javax.swing.JTextField();
        citytxt = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel31 = new javax.swing.JLabel();
        Adminlb = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(700, 587));
        setLayout(new java.awt.CardLayout());

        Addemp.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Addemp.setForeground(new java.awt.Color(51, 204, 0));
        Addemp.setMinimumSize(new java.awt.Dimension(700, 580));
        Addemp.setPreferredSize(new java.awt.Dimension(700, 580));
        Addemp.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        jLabel3.setText("First Name");
        Addemp.add(jLabel3);
        jLabel3.setBounds(60, 120, 90, 30);

        jLabel4.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        jLabel4.setText("Father's Name");
        Addemp.add(jLabel4);
        jLabel4.setBounds(60, 240, 100, 30);

        jLabel5.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        jLabel5.setText("Gender");
        Addemp.add(jLabel5);
        jLabel5.setBounds(60, 270, 90, 30);

        jLabel6.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        jLabel6.setText("Mobile No.");
        Addemp.add(jLabel6);
        jLabel6.setBounds(60, 390, 80, 30);

        jLabel7.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        jLabel7.setText("Date of Birth");
        Addemp.add(jLabel7);
        jLabel7.setBounds(60, 310, 100, 30);

        jLabel8.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        jLabel8.setText("Email id");
        Addemp.add(jLabel8);
        jLabel8.setBounds(60, 350, 80, 30);

        jLabel9.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        jLabel9.setText("Address");
        Addemp.add(jLabel9);
        jLabel9.setBounds(60, 430, 90, 30);

        addresstxt.setColumns(20);
        addresstxt.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        addresstxt.setRows(5);
        addresstxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Addemp.add(addresstxt);
        addresstxt.setBounds(180, 430, 200, 70);

        surnametxt.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        surnametxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Addemp.add(surnametxt);
        surnametxt.setBounds(180, 160, 260, 30);

        usernametxt.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        usernametxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Addemp.add(usernametxt);
        usernametxt.setBounds(180, 200, 260, 30);

        mobiletxt.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        mobiletxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Addemp.add(mobiletxt);
        mobiletxt.setBounds(180, 390, 200, 30);

        emailidtxt.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        emailidtxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        emailidtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailidtxtActionPerformed(evt);
            }
        });
        Addemp.add(emailidtxt);
        emailidtxt.setBounds(180, 350, 310, 30);

        daycmb.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        daycmb.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Addemp.add(daycmb);
        daycmb.setBounds(180, 310, 70, 30);

        monthcmb.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        monthcmb.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Addemp.add(monthcmb);
        monthcmb.setBounds(270, 310, 70, 30);

        yearcmb.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        yearcmb.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        yearcmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearcmbActionPerformed(evt);
            }
        });
        Addemp.add(yearcmb);
        yearcmb.setBounds(360, 310, 100, 30);

        savebt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Save-icon.png"))); // NOI18N
        savebt.setText("Save");
        savebt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtActionPerformed(evt);
            }
        });
        Addemp.add(savebt);
        savebt.setBounds(500, 190, 90, 30);

        resetbt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/erase-128.png"))); // NOI18N
        resetbt.setText("Reset");
        resetbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetbtActionPerformed(evt);
            }
        });
        Addemp.add(resetbt);
        resetbt.setBounds(500, 250, 90, 30);

        maleradio.setText("Male");
        maleradio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleradioActionPerformed(evt);
            }
        });
        Addemp.add(maleradio);
        maleradio.setBounds(210, 270, 80, 30);

        femaleradio.setText("Female");
        femaleradio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleradioActionPerformed(evt);
            }
        });
        Addemp.add(femaleradio);
        femaleradio.setBounds(330, 270, 80, 30);

        jLabel11.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        jLabel11.setText("User id");
        Addemp.add(jLabel11);
        jLabel11.setBounds(60, 200, 90, 30);

        firstnametxt.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        firstnametxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        firstnametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstnametxtActionPerformed(evt);
            }
        });
        Addemp.add(firstnametxt);
        firstnametxt.setBounds(180, 120, 260, 30);

        jLabel12.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        jLabel12.setText("Sur Name");
        Addemp.add(jLabel12);
        jLabel12.setBounds(60, 160, 90, 30);

        fathernametxt.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        fathernametxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Addemp.add(fathernametxt);
        fathernametxt.setBounds(180, 240, 260, 30);

        jLabel2.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        jLabel2.setText("city");
        Addemp.add(jLabel2);
        jLabel2.setBounds(410, 390, 50, 30);

        jLabel10.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        jLabel10.setText("Pin");
        Addemp.add(jLabel10);
        jLabel10.setBounds(410, 470, 40, 30);

        jLabel13.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        jLabel13.setText("State");
        Addemp.add(jLabel13);
        jLabel13.setBounds(410, 430, 50, 30);

        statetxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Addemp.add(statetxt);
        statetxt.setBounds(470, 430, 120, 30);

        pintxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Addemp.add(pintxt);
        pintxt.setBounds(470, 470, 120, 30);

        citytxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Addemp.add(citytxt);
        citytxt.setBounds(470, 390, 120, 30);

        jPanel1.setBackground(new java.awt.Color(153, 102, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Century", 0, 36)); // NOI18N
        jLabel1.setText("Add Employee");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 241, 44);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(0, 40, 260, 10);

        Addemp.add(jPanel1);
        jPanel1.setBounds(0, 50, 680, 50);

        jLabel31.setText("Logged in As :");
        Addemp.add(jLabel31);
        jLabel31.setBounds(0, 0, 80, 14);

        Adminlb.setText("emp");
        Addemp.add(Adminlb);
        Adminlb.setBounds(80, 0, 170, 14);

        add(Addemp, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void emailidtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailidtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailidtxtActionPerformed

    private void yearcmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearcmbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearcmbActionPerformed

    private void savebtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebtActionPerformed
 int p = JOptionPane.showConfirmDialog(null, "Are you sure you want to add record?","Add Record",JOptionPane.YES_NO_OPTION);
        if(p==0){
        try{
            Main.Database ob=new Main.Database();
            Class.forName(ob.Driver);
            Connection con=DriverManager.getConnection(ob.Url+ob.Db,ob.Userid,ob.Password);

            String query="insert into Employee(Name,Username,Father_name,gender,dob,Mobile_no,Email_id,address,city,state,pin,password) values (?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst=con.prepareStatement(query);
            String name=null;
             name=firstnametxt.getText()+" "+surnametxt.getText();
            pst.setString(1,name);
            pst.setString(2,usernametxt.getText());
            pst.setString(3,fathernametxt.getText());
            String gender;
            if(femaleradio.isSelected()){
                gender="female";}
            else{
                gender="male"; }
            pst.setString(4,gender);
            String dob="";
            dob =""+yearcmb.getSelectedItem()+"-"+monthcmb.getSelectedItem()+"-"+daycmb.getSelectedItem();

            pst.setString(5,dob);
            System.out.println(""+dob);
            pst.setString(6,mobiletxt.getText());
            pst.setString(7,emailidtxt.getText());
            pst.setString(8,addresstxt.getText());
            pst.setString(9,citytxt.getText());
            pst.setString(10,statetxt.getText());
            pst.setString(11,pintxt.getText());
            pst.setString(12,dob);
            try{
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null,"Employee is Added");
                JOptionPane.showMessageDialog(null,"Employee user id is "+usernametxt.getText()+"and the password is employee date of birth(yyyy-mm-dd)");
            } catch( HeadlessException | SQLException e)
            {
                JOptionPane.showMessageDialog(null,e);
            }
        }
        catch( Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }}
    }//GEN-LAST:event_savebtActionPerformed

    private void resetbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetbtActionPerformed
        firstnametxt.setText("");
        surnametxt.setText("");
        fathernametxt.setText("");
        maleradio.setSelected(false);
        femaleradio.setSelected(false);
        daycmb.setSelectedIndex(0);
        monthcmb.setSelectedIndex(0);
        yearcmb.setSelectedIndex(0);
        usernametxt.setText("");
        mobiletxt.setText("");
        emailidtxt.setText("");
        addresstxt.setText("");
        citytxt.setText("");
        statetxt.setText("");
        pintxt.setText("");
    }//GEN-LAST:event_resetbtActionPerformed

    private void maleradioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleradioActionPerformed
        if(maleradio.isSelected())
        {
            femaleradio.setSelected(false); }
    }//GEN-LAST:event_maleradioActionPerformed

    private void femaleradioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleradioActionPerformed
        if(femaleradio.isSelected())
        {
            maleradio.setSelected(false); }
    }//GEN-LAST:event_femaleradioActionPerformed

    private void firstnametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstnametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstnametxtActionPerformed
/*public static void main(String[] arg){
    JFrame ob=new JFrame();
    AddEmp_panel ob1=new AddEmp_panel();
    ob.setLayout(new CardLayout());
    
    ob.add(ob1);
    ob.setVisible(true);
}
*/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Addemp;
    private javax.swing.JLabel Adminlb;
    private javax.swing.JTextArea addresstxt;
    private javax.swing.JTextField citytxt;
    private javax.swing.JComboBox<String> daycmb;
    private javax.swing.JTextField emailidtxt;
    private javax.swing.JTextField fathernametxt;
    private javax.swing.JRadioButton femaleradio;
    private javax.swing.JTextField firstnametxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton maleradio;
    private javax.swing.JTextField mobiletxt;
    private javax.swing.JComboBox<String> monthcmb;
    private javax.swing.JTextField pintxt;
    private javax.swing.JButton resetbt;
    private javax.swing.JButton savebt;
    private javax.swing.JTextField statetxt;
    private javax.swing.JTextField surnametxt;
    private javax.swing.JTextField usernametxt;
    private javax.swing.JComboBox<String> yearcmb;
    // End of variables declaration//GEN-END:variables
}
