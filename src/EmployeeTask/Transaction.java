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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Maa
 */
public class Transaction extends javax.swing.JPanel {

    /**
     * Creates new form Transaction
     */
    public Transaction() {
        initComponents();
        empnamelb.setText(Employeedash.Empname);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        acnotxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        avlbaltxt = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jt = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        namelb = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel38 = new javax.swing.JLabel();
        empnamelb = new javax.swing.JLabel();

        setLayout(null);

        jPanel2.setLayout(null);

        acnotxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(acnotxt);
        acnotxt.setBounds(60, 90, 180, 31);

        jLabel3.setFont(new java.awt.Font("Century", 0, 24)); // NOI18N
        jLabel3.setText("Account No");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(60, 50, 140, 26);

        jLabel4.setText("Available Balance");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(280, 380, 100, 31);

        avlbaltxt.setEditable(false);
        avlbaltxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(avlbaltxt);
        avlbaltxt.setBounds(400, 380, 210, 29);

        jt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        jt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jt);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(60, 130, 550, 230);

        jButton1.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        jButton1.setText("check");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(270, 90, 100, 30);

        jLabel5.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        jLabel5.setText("Name");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(390, 50, 60, 30);

        namelb.setMinimumSize(new java.awt.Dimension(70, 120));
        jPanel2.add(namelb);
        namelb.setBounds(390, 90, 190, 30);

        add(jPanel2);
        jPanel2.setBounds(0, 130, 680, 440);

        jPanel3.setBackground(new java.awt.Color(153, 102, 255));

        jLabel2.setFont(new java.awt.Font("Century", 0, 36)); // NOI18N
        jLabel2.setText("Transaction");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(442, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel3);
        jPanel3.setBounds(0, 58, 686, 60);

        jLabel38.setFont(new java.awt.Font("Century", 0, 11)); // NOI18N
        jLabel38.setText("Logged in As :");
        add(jLabel38);
        jLabel38.setBounds(0, 0, 80, 20);

        empnamelb.setFont(new java.awt.Font("Century", 0, 11)); // NOI18N
        empnamelb.setText("emp");
        add(empnamelb);
        empnamelb.setBounds(90, 0, 200, 20);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         Statement st=null;
        try {
      Main.Database ob= new Main.Database();
       try{
            Class.forName(ob.Driver);
            }
            catch(Exception ex){
                 JOptionPane.showMessageDialog(null, ex);
            }
            Connection con=DriverManager.getConnection(ob.Url+ob.Db,ob.Userid,ob.Password);
           st=con.createStatement();
     
      String query="select * from emptransaction where Ac_no='"+acnotxt.getText()
              +"'  order by tid desc limit 10";
      ResultSet rs=st.executeQuery(query);
      String heading[]={"Date","Amount","Withdrawal/Deposite"};
      Object val[][]=new Object[1000][3];
      int i=0;
      while(rs.next())
      {
        val[i][0]=rs.getString(2);
        val[i][1]=rs.getString(6);
        val[i][2]=rs.getString(4);
        i++;
        
      }
      jt.setModel(new DefaultTableModel(val,heading));
      
    } catch (Exception e) {
       JOptionPane.showMessageDialog(null, "Error "+e);
    }      
         try{
            Main.Database ob= new Main.Database();
            Connection con=DriverManager.getConnection(ob.Url+ob.Db,ob.Userid,ob.Password);
            st=con.createStatement();
            String query="Select *from customer where Ac_no='"+acnotxt.getText()+"'";

            ResultSet rs=st.executeQuery(query);
            while(rs.next()){
                namelb.setText(rs.getString(2));
           }
        }catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        } 
         try{
           String query = "select sum(amount) from Emptransaction where Ac_no='"
              + acnotxt.getText() + "' and ttype='d'";
      ResultSet rs = st.executeQuery(query);
      int dep = 0;
      if (rs.next()) {
        if (rs.getString(1) != null) {
            try
            {
          dep = Integer.parseInt(rs.getString(1));
            }catch(Exception ex){}
          query = "select sum(amount) from emptransaction where ac_no='"
                  + acnotxt.getText() + "' and ttype='w'";
          rs = st.executeQuery(query);
          int with = 0;
          if (rs.next()) {
              try
              {
            with = Integer.parseInt(rs.getString(1));
              }
              catch(Exception ex){}
          }
          
          int bal = dep - with;
          avlbaltxt.setText("" + bal);
        }
       
      } 
    } catch (Exception e) {
      JOptionPane.showMessageDialog(null, "Error " + e);
    }// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField acnotxt;
    private javax.swing.JTextField avlbaltxt;
    private javax.swing.JLabel empnamelb;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jt;
    private javax.swing.JLabel namelb;
    // End of variables declaration//GEN-END:variables
}