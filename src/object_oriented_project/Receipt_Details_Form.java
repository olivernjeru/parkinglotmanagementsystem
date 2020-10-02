package object_oriented_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Receipt_Details_Form extends javax.swing.JFrame {

    Statement st;
    ResultSet rs = null;
    Connection conn;
    PreparedStatement ps = null;
    
    String numberplate;
    String time;
    String parkinglevel;
    String parkingspace;
    String ticketnumberconfirmation;
    String time1;
   

    public String getTicketnumberconfirmation() {
        return ticketnumberconfirmation;
    }

    public void setTicketnumberconfirmation(String ticketnumberconfirmation) {
        this.ticketnumberconfirmation = ticketnumberconfirmation;
    }

    public String getTime1() {
        return time1;
    }

    public void setTime1(String time1) {
        this.time1 = time1;
    }

    public String getTicketnumber() {
        return ticketnumber;
    }

    public void setTicketnumber(String ticketnumber) {
        this.ticketnumber = ticketnumber;
    }
    String ticketnumber;

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

    public String getParkinglevel() {
        return parkinglevel;
    }

    public void setParkinglevel(String parkinglevel) {
        this.parkinglevel = parkinglevel;
    }

    public String getParkingspace() {
        return parkingspace;
    }

    public void setParkingspace(String parkingspace) {
        this.parkingspace = parkingspace;
    }
    
    public Receipt_Details_Form() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/object oriented project?useTimezone=true&serverTimezone=UTC", "root", "");
            st = conn.createStatement();

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error:" + e);
        }
        initComponents();
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        numberPlateLabel = new javax.swing.JLabel();
        ticketNumberLabel = new javax.swing.JLabel();
        timeCheckedInLabel = new javax.swing.JLabel();
        amountToPayLabel = new javax.swing.JLabel();
        timeCheckedOutLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        generateReceiptButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        amountToPayLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        timeSpentLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Your Car's Number Plate:");

        numberPlateLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        ticketNumberLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        timeCheckedInLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        amountToPayLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        timeCheckedOutLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Amount To Pay Is:");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Time Checked Out:");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Time Checked In:");

        generateReceiptButton.setText("GENERATE RECEIPT");
        generateReceiptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateReceiptButtonActionPerformed(evt);
            }
        });

        jButton2.setText("EXIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Your Ticket Number:");

        amountToPayLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        amountToPayLabel1.setText("Ksh:");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("Time Spent(In Hours):");

        timeSpentLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(generateReceiptButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ticketNumberLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                                    .addComponent(numberPlateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(timeCheckedInLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(timeCheckedOutLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(timeSpentLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(amountToPayLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(amountToPayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(209, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numberPlateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ticketNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(timeCheckedInLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(timeCheckedOutLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(timeSpentLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(amountToPayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(generateReceiptButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(amountToPayLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void generateReceiptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateReceiptButtonActionPerformed
        String ticketnumber1=null;
        String numberplate1=null;
        
        String checkintime= null;
        String checkintimeselector = "SELECT * FROM `objectorientedprojectdatabase` WHERE `ticketnumber`=ticketnumber";
        try {

            ps = conn.prepareStatement(checkintimeselector);
            rs = ps.executeQuery(checkintimeselector);
            while (rs.next()) {
                ticketnumber1 = (rs.getString("ticketnumber"));
                        numberplate1 = (rs.getString("numberplate"));
                        
                                
                        checkintime = (rs.getString("checkintime"));
            }
            numberPlateLabel.setText(ticketnumber);
            timeCheckedInLabel.setText(checkintime);
            numberPlateLabel.setText(numberplate);
        } catch (Exception e) {
            System.out.println("Error:" + e);
        }
        
        String ticketnumberselector = "SELECT * FROM `objectorientedprojectdatabase` WHERE `ticketnumber`=ticketnumber";
        try {

            ps = conn.prepareStatement(ticketnumberselector);
            rs = ps.executeQuery(ticketnumberselector);
            while (rs.next()) {
                ticketnumber1 = (rs.getString("ticketnumber"));
                        
            }
            ticketNumberLabel.setText(ticketnumber);

        } catch (Exception e) {
            System.out.println("Error:" + e);
        }
        
        String checkouttime = null;
        String checkouttimeselector = "SELECT * FROM `objectorientedprojectdatabase` WHERE `ticketnumber`=ticketnumber";
        try {

            ps = conn.prepareStatement(checkouttimeselector);
            rs = ps.executeQuery(checkouttimeselector);
            while (rs.next()) {
                checkouttime = (rs.getString("checkouttime"));
            }
            timeCheckedOutLabel.setText(checkouttime);
        } catch (Exception e) {
            System.out.println("Error:" + e);
        }
        try {
            SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");

            Date date1 = format.parse(checkintime);
            Date date2 = format.parse(checkouttime);
            long difference = date2.getTime() - date1.getTime();
            long diffHours = difference / (60 * 60 * 1000) % 24;
            String timedifference = Long.toString(diffHours);
            timeSpentLabel.setText(timedifference);

            double amount;

            if (diffHours <= 1) {
                amount = 50;
                amountToPayLabel.setText(Double.toString(amount));

            } else {
                if (diffHours >= 2 && diffHours <= 3) {
                    amount = 150;
                    amountToPayLabel.setText(Double.toString(amount));
                } else {
                    if (diffHours >= 3 && diffHours <= 4) {
                        amount = 250;
                        amountToPayLabel.setText(Double.toString(amount));
                    } else {
                        if (diffHours >= 4 && diffHours <= 5) {
                            amount = 350;
                            amountToPayLabel.setText(Double.toString(amount));
                        } else {
                            if (diffHours >= 5 && diffHours <= 6) {
                                amount = 450;
                                amountToPayLabel.setText(Double.toString(amount));
                            } else {
                                if (diffHours >= 6 && diffHours <= 7) {
                                    amount = 550;
                                    amountToPayLabel.setText(Double.toString(amount));
                                } else {
                                    if (diffHours >= 7 && diffHours <= 8) {
                                        amount = 650;
                                        amountToPayLabel.setText(Double.toString(amount));
                                    } else {
                                        if (diffHours >= 8) {
                                            amount = 2000;
                                            amountToPayLabel.setText(Double.toString(amount));
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }

        } catch (Exception e) {
            System.out.println("Error:" + e);
        }

    }//GEN-LAST:event_generateReceiptButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Receipt_Details_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Receipt_Details_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Receipt_Details_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Receipt_Details_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Receipt_Details_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amountToPayLabel;
    private javax.swing.JLabel amountToPayLabel1;
    private javax.swing.JButton generateReceiptButton;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel numberPlateLabel;
    private javax.swing.JLabel ticketNumberLabel;
    private javax.swing.JLabel timeCheckedInLabel;
    private javax.swing.JLabel timeCheckedOutLabel;
    private javax.swing.JLabel timeSpentLabel;
    // End of variables declaration//GEN-END:variables
}
