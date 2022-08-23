/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import AdminTask.Admindash;
import AdminTask.Retrieve;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Maa
 */
public class Adminlogin extends javax.swing.JPanel {

    
    public Adminlogin() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userlb = new javax.swing.JLabel();
        usrtxt = new javax.swing.JTextField();
        passlb = new javax.swing.JLabel();
        passtxt = new javax.swing.JPasswordField();
        checkbox1 = new javax.swing.JCheckBox();
        b1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(416, 339));
        setLayout(null);

        userlb.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        userlb.setText("Username");
        add(userlb);
        userlb.setBounds(110, 70, 220, 36);

        usrtxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        usrtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usrtxtActionPerformed(evt);
            }
        });
        add(usrtxt);
        usrtxt.setBounds(110, 110, 220, 40);

        passlb.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        passlb.setText("Password");
        add(passlb);
        passlb.setBounds(110, 160, 220, 34);

        passtxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        passtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passtxtActionPerformed(evt);
            }
        });
        add(passtxt);
        passtxt.setBounds(110, 200, 220, 40);

        checkbox1.setText("Show password");
        checkbox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkbox1ActionPerformed(evt);
            }
        });
        add(checkbox1);
        checkbox1.setBounds(110, 260, 120, 30);

        b1.setText("Login");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        add(b1);
        b1.setBounds(250, 260, 90, 30);

        jLabel1.setForeground(new java.awt.Color(0, 204, 0));
        jLabel1.setText("Forget Password");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });
        add(jLabel1);
        jLabel1.setBounds(270, 320, 95, 14);
    }// </editor-fold>//GEN-END:initComponents

    private void usrtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usrtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usrtxtActionPerformed

    private void passtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passtxtActionPerformed

    private void checkbox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkbox1ActionPerformed
        if(checkbox1.isSelected())
        {
            passtxt.setEchoChar((char)0);
        }
        else
        {
            passtxt.setEchoChar('*');
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_checkbox1ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        try{
            
           
            String pass=passtxt.getText();
            Database ob= new Database();
            Class.forName(ob.Driver);
            Connection con=DriverManager.getConnection(ob.Url+ob.Db,ob.Userid,ob.Password);
            Statement st=con.createStatement();
            
            String query="select *from Admin where username='"+ usrtxt.getText()+"' and password='"+pass+"'";
            ResultSet rs=st.executeQuery(query);
            if(rs.next()){
                JOptionPane.showMessageDialog(null,"Successful Login");
                 Admindash.Adminname=rs.getString(3);
                 setVisible(false);
                AdminTaskFrame ob1=new AdminTaskFrame();
                ob1.setVisible(true);
                
              
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Invalid userid or password");

            }
        }
        catch(Exception e)
        {JOptionPane.showMessageDialog(this, e);

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_b1ActionPerformed

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
Retrieve ob=new Retrieve();
ob.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JCheckBox checkbox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel passlb;
    private javax.swing.JPasswordField passtxt;
    private javax.swing.JLabel userlb;
    private javax.swing.JTextField usrtxt;
    // End of variables declaration//GEN-END:variables
}
