/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import AdminTask.Password;

import java.awt.*;
import java.awt.Color;
import java.sql.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.*;


/**
 *
 * @author Maa
 */
public class AdminTaskFrame extends javax.swing.JFrame {

    /**
     * Creates new form my
     */
    public AdminTaskFrame() {
        initComponents();
         container.removeAll();
        AdminTask.AddEmp_panel ob= new AdminTask.AddEmp_panel();
        container.setLayout(new CardLayout());
        container.add(ob);    
        container.repaint();
        container.validate();
     Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, 
        size.height/2 - getHeight()/2);
        Thred1 ob1;
        ob1 = new Thred1();
        ob1.start();
        
    }
    
    void setColor(JPanel panel)
    {
        panel.setBackground(new Color(102,0,102));
    }
    void resetColor(JPanel panel)
    {
        panel.setBackground(new Color(102,0,204));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        side = new javax.swing.JPanel();
        btn_add = new javax.swing.JPanel();
        Add = new javax.swing.JLabel();
        btn_edit = new javax.swing.JPanel();
        Add1 = new javax.swing.JLabel();
        btn_delete = new javax.swing.JPanel();
        Add2 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        container = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        lbl_date = new javax.swing.JMenu();
        lbl_time = new javax.swing.JMenu();
        Profile = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(910, 620));
        setPreferredSize(new java.awt.Dimension(910, 620));
        getContentPane().setLayout(null);

        side.setBackground(new java.awt.Color(102, 0, 204));
        side.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        side.setMinimumSize(new java.awt.Dimension(220, 570));

        btn_add.setBackground(new java.awt.Color(102, 0, 102));
        btn_add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_addMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_addMousePressed(evt);
            }
        });

        Add.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        Add.setForeground(new java.awt.Color(255, 255, 255));
        Add.setText("Add Employee");

        javax.swing.GroupLayout btn_addLayout = new javax.swing.GroupLayout(btn_add);
        btn_add.setLayout(btn_addLayout);
        btn_addLayout.setHorizontalGroup(
            btn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_addLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btn_addLayout.setVerticalGroup(
            btn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Add, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        btn_edit.setBackground(new java.awt.Color(102, 0, 255));
        btn_edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_editMousePressed(evt);
            }
        });

        Add1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        Add1.setForeground(new java.awt.Color(255, 255, 255));
        Add1.setText("Edit Employee");

        javax.swing.GroupLayout btn_editLayout = new javax.swing.GroupLayout(btn_edit);
        btn_edit.setLayout(btn_editLayout);
        btn_editLayout.setHorizontalGroup(
            btn_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_editLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(Add1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btn_editLayout.setVerticalGroup(
            btn_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Add1, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        btn_delete.setBackground(new java.awt.Color(102, 0, 255));
        btn_delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_deleteMousePressed(evt);
            }
        });

        Add2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        Add2.setForeground(new java.awt.Color(255, 255, 255));
        Add2.setText("Delete Employee");

        javax.swing.GroupLayout btn_deleteLayout = new javax.swing.GroupLayout(btn_delete);
        btn_delete.setLayout(btn_deleteLayout);
        btn_deleteLayout.setHorizontalGroup(
            btn_deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_deleteLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(Add2)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        btn_deleteLayout.setVerticalGroup(
            btn_deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Add2, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        jButton9.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logout.png"))); // NOI18N
        jButton9.setText("Log out");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sideLayout = new javax.swing.GroupLayout(side);
        side.setLayout(sideLayout);
        sideLayout.setHorizontalGroup(
            sideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_edit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sideLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton9)
                .addGap(58, 58, 58))
        );
        sideLayout.setVerticalGroup(
            sideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sideLayout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jButton9)
                .addContainerGap(167, Short.MAX_VALUE))
        );

        getContentPane().add(side);
        side.setBounds(0, 0, 220, 560);

        container.setBackground(new java.awt.Color(153, 51, 255));
        container.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        container.setMinimumSize(new java.awt.Dimension(680, 560));
        container.setPreferredSize(new java.awt.Dimension(700, 580));
        container.setLayout(new java.awt.CardLayout());
        getContentPane().add(container);
        container.setBounds(220, 0, 660, 560);

        jMenuBar1.setPreferredSize(new java.awt.Dimension(21, 21));

        lbl_date.setText("Date");
        jMenuBar1.add(lbl_date);

        lbl_time.setText("Time");
        jMenuBar1.add(lbl_time);

        Profile.setText("Profile");

        jMenuItem1.setText("About");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        Profile.add(jMenuItem1);

        jMenuItem2.setText("change password");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        Profile.add(jMenuItem2);

        jMenuBar1.add(Profile);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
      this.setVisible(false);
        Login ob=new Login();
       ob.setVisible(true);
// TODO addemp your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void btn_addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addMouseClicked
         // TODO addemp your handling code here:
    }//GEN-LAST:event_btn_addMouseClicked

    private void btn_addMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addMousePressed
      
        
        
       setColor(btn_add);
        resetColor(btn_edit);
        resetColor(btn_delete);
   container.removeAll();
         
        AdminTask.AddEmp_panel ob= new AdminTask.AddEmp_panel();
        container.setLayout(new CardLayout());


        container.add(ob);    
        container.repaint();
        container.validate();
        
    }//GEN-LAST:event_btn_addMousePressed

    private void btn_editMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editMousePressed
        container.removeAll();
        setColor(btn_edit);
        resetColor(btn_add);
        resetColor(btn_delete);  
        AdminTask.EditEmp_panel ob=new AdminTask.EditEmp_panel();
       container.setLayout(new CardLayout());
        container.add(ob);    
        container.repaint();
        container.validate();
        
    }//GEN-LAST:event_btn_editMousePressed

    private void btn_deleteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_deleteMousePressed
        container.removeAll();
        setColor(btn_delete);
        resetColor(btn_add); 
        resetColor(btn_edit);
        AdminTask.Delete ob=new AdminTask.Delete();
        container.setLayout(new CardLayout());
        container.add(ob);    
        container.repaint();
        container.validate();
    }//GEN-LAST:event_btn_deleteMousePressed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
     container.removeAll();
        AdminTask.About ob=new AdminTask.About();
        container.setLayout(new CardLayout());
        container.add(ob);    
        container.repaint();
        container.validate();// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Password ob=new Password();
       ob.setVisible(true);  // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed
   
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminTaskFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminTaskFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminTaskFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminTaskFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminTaskFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Add;
    private javax.swing.JLabel Add1;
    private javax.swing.JLabel Add2;
    private javax.swing.JMenu Profile;
    private javax.swing.JPanel btn_add;
    private javax.swing.JPanel btn_delete;
    private javax.swing.JPanel btn_edit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel container;
    private javax.swing.JButton jButton9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenu lbl_date;
    private javax.swing.JMenu lbl_time;
    private javax.swing.JPanel side;
    // End of variables declaration//GEN-END:variables
class Thred1 extends Thread{
        java.util.Date dt;
        public void run(){ 
          while(true) {
           dt=new java.util.Date();
           String t=""+dt.getHours()+":"+dt.getMinutes()+":"+dt.getSeconds();
           String d=""+dt.getDay()+"/"+(dt.getMonth()+1)+"/"+(dt.getYear()+1900);
           lbl_time.setText(t);
           lbl_date.setText(d);
          }
        }
    }
}
