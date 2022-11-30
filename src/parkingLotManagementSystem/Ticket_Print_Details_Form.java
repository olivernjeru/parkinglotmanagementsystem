package parkingLotManagementSystem;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import javax.swing.JOptionPane;

public class Ticket_Print_Details_Form extends javax.swing.JFrame {

    Statement st;
    ResultSet rs = null;
    Connection conn;
    PreparedStatement ps = null;
    
    String numberplate;
    String time;
    String parkinglevel;
    String parkingspace;
    String ticketnumber;

    public String getTicketnumber() {
        return ticketnumber;
    }

    public void setTicketnumber(String ticketnumber) {
        this.ticketnumber = ticketnumber;
    }

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
    
    public Ticket_Print_Details_Form() {
       
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

        ticketNumberLabel = new javax.swing.JLabel();
        ticketNumber = new javax.swing.JLabel();
        parkingLevelDisplay = new javax.swing.JLabel();
        parkingSpaceDisplay = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        parkingLevelLabel = new javax.swing.JLabel();
        resetButton = new javax.swing.JButton();
        generateTicketNumberText = new javax.swing.JButton();
        nextButton = new javax.swing.JButton();
        generateTickettButton = new javax.swing.JButton();
        numberPlateLabel = new javax.swing.JLabel();
        numberPlateDisplay = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ticketNumberLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ticketNumberLabel.setText("Your Ticket Number Is:");

        ticketNumber.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        parkingLevelDisplay.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        parkingSpaceDisplay.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Your Parking Space Is:");

        parkingLevelLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        parkingLevelLabel.setText("Your Parking Level Is:");

        resetButton.setText("RESET");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        generateTicketNumberText.setText("GENERATE TICKET NUMBER");
        generateTicketNumberText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateTicketNumberTextActionPerformed(evt);
            }
        });

        nextButton.setText("NEXT");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        generateTickettButton.setText("GENERATE TICKET");
        generateTickettButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateTickettButtonActionPerformed(evt);
            }
        });

        numberPlateLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        numberPlateLabel.setText("Your Car's NumberPlate Is: ");

        numberPlateDisplay.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(generateTicketNumberText)
                        .addGap(28, 28, 28)
                        .addComponent(generateTickettButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(285, 285, 285)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(parkingSpaceDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                                        .addComponent(parkingLevelDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addComponent(parkingLevelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ticketNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(100, 100, 100)
                                .addComponent(ticketNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(numberPlateDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(numberPlateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ticketNumberLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    .addComponent(ticketNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numberPlateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numberPlateDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(parkingLevelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(parkingLevelDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(parkingSpaceDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(generateTicketNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(generateTickettButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        ticketNumber.setText(null);
    }//GEN-LAST:event_resetButtonActionPerformed

    private void generateTicketNumberTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateTicketNumberTextActionPerformed
        Random generator = new Random();
        int ticket_number = generator.nextInt(1000000) + 1;
        String val = String.valueOf(ticket_number);
        ticketNumber.setText(val);

        try {
            st.execute("INSERT INTO ticketnumber(ticketnumber)" + "VALUES('" + ticketNumber.getText() + "')");

            JOptionPane.showMessageDialog(null, "Record Has Been Added");

        } catch (HeadlessException | SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Record has not been Added");
            System.out.println("Error " + ex);
        }
    }//GEN-LAST:event_generateTicketNumberTextActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        ticketnumber=ticketNumber.getText();
        Check_Out_Details_Form popup4 = new Check_Out_Details_Form();
        popup4.setVisible(true);
        popup4.setNumberplate(numberplate);
        popup4.setTime(time);
        popup4.setParkinglevel(parkinglevel);
        popup4.setParkingspace(parkingspace);
        popup4.setTicketnumber(ticketnumber);
    }//GEN-LAST:event_nextButtonActionPerformed

    private void generateTickettButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateTickettButtonActionPerformed
        numberPlateDisplay.setText(numberplate);
        parkingLevelDisplay.setText(parkinglevel);
        parkingSpaceDisplay.setText(parkingspace);
    }//GEN-LAST:event_generateTickettButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Ticket_Print_Details_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ticket_Print_Details_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ticket_Print_Details_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ticket_Print_Details_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Ticket_Print_Details_Form().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton generateTicketNumberText;
    private javax.swing.JButton generateTickettButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton nextButton;
    private javax.swing.JLabel numberPlateDisplay;
    private javax.swing.JLabel numberPlateLabel;
    private javax.swing.JLabel parkingLevelDisplay;
    private javax.swing.JLabel parkingLevelLabel;
    private javax.swing.JLabel parkingSpaceDisplay;
    private javax.swing.JButton resetButton;
    private javax.swing.JLabel ticketNumber;
    private javax.swing.JLabel ticketNumberLabel;
    // End of variables declaration//GEN-END:variables
}
