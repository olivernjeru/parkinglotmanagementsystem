package parkingLotManagementSystem;

import java.awt.HeadlessException;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

public class Check_In_Details_Form extends javax.swing.JFrame {
    private static Statement st;
    private static Connection conn;

    Calendar cal=new GregorianCalendar();
    int hours=cal.get(Calendar.HOUR);
    int minutes=cal.get(Calendar.MINUTE);
    int sec=cal.get(Calendar.SECOND);
    String time=hours+":"+minutes +":"+sec;
    String numberplate;

    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public String getNumberplate() {
        return numberplate;
    }
    public void setNumberplate(String numberplate) {
        this.numberplate = numberplate;
    }

    public Check_In_Details_Form() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/object oriented project?useTimezone=true&serverTimezone=UTC","root","");
            st=conn.createStatement();  
        }
        catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error:" +e);
        }
            initComponents();
        } 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        numberPlateLabel = new javax.swing.JLabel();
        numberPlateText = new javax.swing.JTextField();
        resetButton = new javax.swing.JButton();
        checkInButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        numberPlateLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        numberPlateLabel.setText("Enter Your Car's Number Plate:");

        resetButton.setText("Reset");
        resetButton.setToolTipText("Click To Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        checkInButton.setText("CHECK IN");
        checkInButton.setToolTipText("Click To Go To The Next Step");
        checkInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkInButtonActionPerformed(evt);
            }
        });
        checkInButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                checkInButtonKeyPressed(evt);
            }
        });

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(numberPlateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(70, 70, 70)
                            .addComponent(numberPlateText, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(32, 32, 32)
                            .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(114, 114, 114)
                            .addComponent(checkInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(95, 95, 95)
                            .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(numberPlateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(numberPlateText, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(165, 165, 165)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(checkInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        numberPlateText.setText(null);       
    }//GEN-LAST:event_resetButtonActionPerformed

    private void checkInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkInButtonActionPerformed
        numberplate=numberPlateText.getText();  
        try{        
            st.execute("INSERT INTO checkintime(checkintime)"+"VALUES('"+time+"')");
            //JOptionPane.showMessageDialog(null,"Record Has Been Added");                  
        }
        catch(SQLException ex){
            //JOptionPane.showMessageDialog(null, "Record has not been Added");
            System.out.println("Error " +ex);
        }
        try{        
            st.execute("INSERT INTO `numberplate`(`numberplate`)" + " VALUES('"+numberplate+"')");
            JOptionPane.showMessageDialog(null,"Record Has Been Added");           
        }
        catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(null, "Record has not been Added");
            System.out.println("Error " +ex);
        }
        Parking_Level_Details_Form popup10= new Parking_Level_Details_Form();
        popup10.setVisible(true);
        popup10.setNumberplate(numberplate);
        popup10.setTime(time);
    }//GEN-LAST:event_checkInButtonActionPerformed

    
    private void checkInButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_checkInButtonKeyPressed

    }//GEN-LAST:event_checkInButtonKeyPressed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);   
    }//GEN-LAST:event_exitButtonActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Check_In_Details_Form().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkInButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel numberPlateLabel;
    private javax.swing.JTextField numberPlateText;
    private javax.swing.JButton resetButton;
    // End of variables declaration//GEN-END:variables
}
