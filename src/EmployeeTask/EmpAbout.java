/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmployeeTask;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Maa
 */
public class EmpAbout extends javax.swing.JPanel {

    /**
     * Creates new form About
     */
    public EmpAbout() {
        initComponents();
        CustomerTask.User user =new CustomerTask.User();
        fullnametxt.setText(Employeedash.Empname);
         employeelb.setText(Employeedash.Empname);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        delete1 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        pinlb = new javax.swing.JLabel();
        fathernamelb = new javax.swing.JLabel();
        doblb = new javax.swing.JLabel();
        emaillb = new javax.swing.JLabel();
        mobilelb = new javax.swing.JLabel();
        addresslb = new javax.swing.JLabel();
        citylb = new javax.swing.JLabel();
        statelb = new javax.swing.JLabel();
        del_find = new javax.swing.JButton();
        useridlb = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        fullnametxt = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        employeelb = new javax.swing.JLabel();

        delete1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        delete1.setMinimumSize(new java.awt.Dimension(680, 560));
        delete1.setLayout(null);

        jLabel21.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        jLabel21.setText("Father's Name");
        delete1.add(jLabel21);
        jLabel21.setBounds(80, 220, 100, 30);

        jLabel22.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        jLabel22.setText("Gender");
        delete1.add(jLabel22);
        jLabel22.setBounds(80, 260, 90, 30);

        jLabel23.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        jLabel23.setText("Mobile No.");
        delete1.add(jLabel23);
        jLabel23.setBounds(80, 380, 80, 30);

        jLabel24.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        jLabel24.setText("Date of Birth");
        delete1.add(jLabel24);
        jLabel24.setBounds(80, 300, 100, 30);

        jLabel25.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        jLabel25.setText("Email id");
        delete1.add(jLabel25);
        jLabel25.setBounds(80, 340, 110, 30);

        jLabel26.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        jLabel26.setText("Address");
        delete1.add(jLabel26);
        jLabel26.setBounds(80, 420, 90, 30);

        male.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        male.setText("Male");
        male.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        delete1.add(male);
        male.setBounds(210, 260, 70, 30);

        female.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        female.setText("Female");
        female.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        delete1.add(female);
        female.setBounds(320, 260, 90, 30);

        jPanel5.setBackground(new java.awt.Color(153, 102, 255));
        jPanel5.setLayout(null);

        jLabel27.setFont(new java.awt.Font("Century", 0, 36)); // NOI18N
        jLabel27.setText("User Profile");
        jPanel5.add(jLabel27);
        jLabel27.setBounds(60, 0, 210, 44);
        jPanel5.add(jSeparator3);
        jSeparator3.setBounds(60, 40, 200, 10);

        delete1.add(jPanel5);
        jPanel5.setBounds(0, 50, 680, 60);

        jLabel40.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        jLabel40.setText("city");
        delete1.add(jLabel40);
        jLabel40.setBounds(400, 390, 50, 30);

        jLabel41.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        jLabel41.setText("State");
        delete1.add(jLabel41);
        jLabel41.setBounds(400, 430, 50, 30);

        jLabel42.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        jLabel42.setText("Pin");
        delete1.add(jLabel42);
        jLabel42.setBounds(400, 470, 40, 30);

        pinlb.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        delete1.add(pinlb);
        pinlb.setBounds(460, 470, 140, 30);

        fathernamelb.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        delete1.add(fathernamelb);
        fathernamelb.setBounds(200, 220, 260, 30);

        doblb.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        delete1.add(doblb);
        doblb.setBounds(200, 300, 260, 30);

        emaillb.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        delete1.add(emaillb);
        emaillb.setBounds(200, 340, 260, 30);

        mobilelb.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        delete1.add(mobilelb);
        mobilelb.setBounds(200, 380, 180, 30);

        addresslb.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        delete1.add(addresslb);
        addresslb.setBounds(200, 430, 180, 70);

        citylb.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        delete1.add(citylb);
        citylb.setBounds(460, 390, 140, 30);

        statelb.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        delete1.add(statelb);
        statelb.setBounds(460, 430, 140, 30);

        del_find.setFont(new java.awt.Font("Century", 0, 16)); // NOI18N
        del_find.setText("Find");
        del_find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                del_findActionPerformed(evt);
            }
        });
        delete1.add(del_find);
        del_find.setBounds(500, 170, 90, 30);

        useridlb.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        delete1.add(useridlb);
        useridlb.setBounds(200, 170, 260, 30);

        jLabel29.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        jLabel29.setText("Full Name*");
        delete1.add(jLabel29);
        jLabel29.setBounds(80, 130, 100, 30);

        jLabel30.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        jLabel30.setText("User id");
        delete1.add(jLabel30);
        jLabel30.setBounds(80, 170, 100, 30);

        fullnametxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        delete1.add(fullnametxt);
        fullnametxt.setBounds(200, 130, 260, 30);

        jLabel31.setText("Logged in As :");
        delete1.add(jLabel31);
        jLabel31.setBounds(0, 0, 80, 14);

        employeelb.setText("emp");
        delete1.add(employeelb);
        employeelb.setBounds(80, 0, 170, 14);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(delete1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(delete1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void del_findActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_del_findActionPerformed
        try{
            Main.Database ob= new Main.Database();
             try{
            Class.forName(ob.Driver);
            }
            catch(Exception ex){
                 JOptionPane.showMessageDialog(null, ex);
            }
            Connection con=DriverManager.getConnection(ob.Url+ob.Db,ob.Userid,ob.Password);
            Statement st=con.createStatement();
             CustomerTask.User user =new CustomerTask.User();
           
            String query="Select *from employee where name='"+Employeedash.Empname+"'";
            ResultSet rs=st.executeQuery(query);
            while(rs.next()){
                useridlb.setText(rs.getString(2));
                fathernamelb.setText(rs.getString(3));
                doblb.setText(rs.getString(5));

                String gender=rs.getString(4);
                if(gender.equals("male")){
                    male.setSelected(true);
                }else{
                    female.setSelected(true);
                }
                mobilelb.setText(rs.getString(6));
                emaillb.setText(rs.getString(7));
                addresslb.setText(rs.getString(8));
                citylb.setText(rs.getString(9));
                statelb.setText(rs.getString(10));
                pinlb.setText(rs.getString(11));
            }

        }catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_del_findActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addresslb;
    private javax.swing.JLabel citylb;
    private javax.swing.JButton del_find;
    private javax.swing.JPanel delete1;
    private javax.swing.JLabel doblb;
    private javax.swing.JLabel emaillb;
    private javax.swing.JLabel employeelb;
    private javax.swing.JLabel fathernamelb;
    private javax.swing.JRadioButton female;
    private javax.swing.JLabel fullnametxt;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JRadioButton male;
    private javax.swing.JLabel mobilelb;
    private javax.swing.JLabel pinlb;
    private javax.swing.JLabel statelb;
    private javax.swing.JLabel useridlb;
    // End of variables declaration//GEN-END:variables
}
