package reminder;

import com.github.lgooddatepicker.components.DatePicker;
import com.github.lgooddatepicker.components.TimePicker;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Abin Varghese 17/12/2018
 */
public class AddReminder extends javax.swing.JFrame {

    /**
     *form which creates reminders 
     */
    Connection con = dbcon.dbConnector();//create a database connection

    public AddReminder() {

        initComponents();

    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        dateTimePicker1 = new com.github.lgooddatepicker.components.DateTimePicker();
        jButton2 = new javax.swing.JButton();
        r1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setTitle("Add Reminder");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(dateTimePicker1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 280, 30));

        jButton2.setText("Add");
        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 100, 30));
        jPanel1.add(r1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 280, 30));

        jLabel2.setText("Remainder");
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, -1, -1));

        jLabel3.setText("Data and time");
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 100, -1));

        jButton1.setText("Cancel");
        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 110, -1));

        jLabel4.setText("Use arrow key after selecting time adjust time to minute");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 350, -1));

        jPanel2.setBackground(new java.awt.Color(153, 0, 255));
        jPanel2.setForeground(new java.awt.Color(51, 0, 255));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Home_55px.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);

        jLabel5.setText("Home");
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jLabel5);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Calendar_Plus_55px.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Add Remainder");
        jPanel2.add(jLabel1);

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Eye_55px.png"))); // NOI18N
        jButton5.setMaximumSize(new java.awt.Dimension(139, 115));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("View Remainder");
        jPanel2.add(jLabel6);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 480));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/iStock-612235546-750x500.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 620, 430));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Data is inserted into the table
        try {
            
            String remainder = r1.getText();
            DatePicker dt = dateTimePicker1.getDatePicker();
            TimePicker ti = dateTimePicker1.getTimePicker();
            String d = dt.toString();
            String t = ti.toString();
            boolean flag = DateTimeValidator.validator(d, t,remainder);// calling date time validator fuction
            if (flag == true) {
                System.out.println(remainder);
                System.out.println(d);
                System.out.println(t);
                String query = "INSERT INTO `rem`(`Reminder`, `Reminder_date`, `Reminder_time`) VALUES (?,?,?)";
                PreparedStatement pst = con.prepareStatement(query);
                pst.setString(1, remainder);
                pst.setString(2, d);
                pst.setString(3, t);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Reminder Added");
                this.dispose();
                new AddReminder().setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Enter Valid Remainder");
                this.dispose();
                new AddReminder().setVisible(true);
            }
        } catch (HeadlessException | SQLException e) {
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        new AddReminder().setVisible(true);        // code to go back to the previous form when an action is performed by button

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new Home().setVisible(true);
        this.dispose();  // code to go back to the Home form when an action is performed by button
    }//GEN-LAST:event_jButton4ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened


    }//GEN-LAST:event_formWindowOpened

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new AddReminder().setVisible(true);
        this.setVisible(false);     // code to go back to the Add remainder form when an action is performed by button
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        new ViewReminder().setVisible(true);
        this.setVisible(false);
        // code to go back to the view remainder form when an action is performed by button
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddReminder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.github.lgooddatepicker.components.DateTimePicker dateTimePicker1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField r1;
    // End of variables declaration//GEN-END:variables
}
