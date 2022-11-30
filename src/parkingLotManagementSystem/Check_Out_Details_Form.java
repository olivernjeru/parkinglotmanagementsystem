package parkingLotManagementSystem;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

public class Check_Out_Details_Form extends javax.swing.JFrame {

    Statement st;
    ResultSet rs = null;
    Connection conn;
    PreparedStatement ps = null;

    String numberplate;
    String time;
    String parkinglevel;
    String parkingspace;
    String ticketnumber;
    String ticketnumberconfirmation;
    
    Calendar cal = new GregorianCalendar();
    int hours = cal.get(Calendar.HOUR);
    int minutes = cal.get(Calendar.MINUTE);
    int sec = cal.get(Calendar.SECOND);
    String time1 = hours + ":" + minutes + ":" + sec;


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
    String parkingspacegetter = getParkingspace();

    public Check_Out_Details_Form() {
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
        ticketNumberConfirmationText = new javax.swing.JTextField();
        checkOutButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Enter Your Ticket Number:");

        checkOutButton.setText("CHECK OUT");
        checkOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkOutButtonActionPerformed(evt);
            }
        });

        resetButton.setText("RESET");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(ticketNumberConfirmationText, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(checkOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ticketNumberConfirmationText, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(114, 114, 114)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void checkOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkOutButtonActionPerformed
        try {
            ps = conn.prepareStatement("INSERT INTO objectorientedprojectdatabase(numberplate, checkintime, parkinglevel, parkingspace, ticketnumber, checkouttime )" + " VALUES(?,?,?,?,?,?)");
            ps.setString(1, getNumberplate());
            ps.setString(2, getTime()); 
            ps.setString(3, getParkinglevel());
            ps.setString(4, getParkingspace());
            ps.setString(5, getTicketnumber());
            ps.setString(6, getTime1());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Record Has Been Added");

        } catch (HeadlessException | SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Record has not been Added");
            System.out.println("Error " + ex);
        }
        Receipt_Details_Form popup5 = new Receipt_Details_Form();
        popup5.setVisible(true);
        popup5.setNumberplate(numberplate);
        popup5.setTime(time);
        popup5.setParkinglevel(parkinglevel);
        popup5.setParkingspace(parkingspace);
        popup5.setTicketnumber(ticketnumber);
        popup5.setTime1(time1);
        popup5.setTicketnumberconfirmation(ticketnumberconfirmation);
    }//GEN-LAST:event_checkOutButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Check_Out_Details_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Check_Out_Details_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Check_Out_Details_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Check_Out_Details_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Check_Out_Details_Form().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkOutButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton resetButton;
    private javax.swing.JTextField ticketNumberConfirmationText;
    // End of variables declaration//GEN-END:variables
}
