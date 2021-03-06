
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.*;
import java.util.logging.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MANISH
 */
public class Login extends javax.swing.JFrame {
    
    Connection con;
    PreparedStatement pst1,pst2;
    Statement st;
    ResultSet rs;
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);   // Allign form to the centre
        try{
           Class.forName("com.mysql.jdbc.Driver");
           con=DriverManager.getConnection("jdbc:mysql://localhost:3306/type","root","root");
           JOptionPane.showMessageDialog(null,"DataBase Connected");
        }catch(ClassNotFoundException e){
           Logger.getLogger(Rooms.class.getName()).log(Level.SEVERE, null, e); 
        }catch(SQLException e){
            Logger.getLogger(Rooms.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        luser = new javax.swing.JLabel();
        lpass = new javax.swing.JLabel();
        tuser = new javax.swing.JTextField();
        blog = new javax.swing.JButton();
        bexit = new javax.swing.JButton();
        tpass = new javax.swing.JPasswordField();
        Rlink = new javax.swing.JLabel();
        lb1 = new javax.swing.JLabel();
        lb2 = new javax.swing.JLabel();
        vcb = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 255, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("USER LogIn");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        luser.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        luser.setText("UserName");

        lpass.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lpass.setText("Password");

        tuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tuserActionPerformed(evt);
            }
        });
        tuser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tuserKeyReleased(evt);
            }
        });

        blog.setBackground(new java.awt.Color(102, 255, 102));
        blog.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        blog.setText("LogIn");
        blog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                blogMouseClicked(evt);
            }
        });
        blog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blogActionPerformed(evt);
            }
        });

        bexit.setBackground(new java.awt.Color(255, 51, 51));
        bexit.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bexit.setText("Exit");
        bexit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bexitMouseClicked(evt);
            }
        });

        tpass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tpassKeyReleased(evt);
            }
        });

        Rlink.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Rlink.setText("Click here to Create Your New Account");
        Rlink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RlinkMouseClicked(evt);
            }
        });

        vcb.setText("View");
        vcb.setToolTipText("See your Password");
        vcb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vcbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Rlink)
                .addGap(59, 59, 59))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lpass)
                    .addComponent(luser))
                .addGap(83, 83, 83)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(blog)
                                .addGap(28, 28, 28)
                                .addComponent(bexit)
                                .addGap(11, 11, 11))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lb2)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tuser, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                                    .addComponent(tpass))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(vcb)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(luser))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb1)
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lpass)
                    .addComponent(vcb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(Rlink, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(blog)
                            .addComponent(bexit))
                        .addGap(68, 68, 68))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tuserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tuserActionPerformed

    private void bexitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bexitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_bexitMouseClicked

    private void RlinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RlinkMouseClicked
        Registration r=new Registration();
        r.setVisible(true);
        r.pack();
        r.setLocationRelativeTo(null);
        r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_RlinkMouseClicked

    private void blogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_blogMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_blogMouseClicked

    private void blogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blogActionPerformed
        String u=tuser.getText();
        String p=String.valueOf(tpass.getPassword());
        if(tuser.getText().trim().isEmpty() && tpass.getText().trim().isEmpty()){
            lb1.setText("Please enter your USERNAME");
            lb2.setText("Please enter your PASSWORD");
            }
        else if(tuser.getText().trim().isEmpty()){
            lb1.setText("Please enter your USERNAME");
        }
        else if(tpass.getText().trim().isEmpty()){
            lb2.setText("Please enter your PASSWORD");
        }

        try{
            String query = "select username,password from accounts where USERNAME=? AND PASSWORD=?";
            pst1 = con.prepareStatement(query);
            pst1.setString(1,u);
            pst1.setString(2,p);
            rs =pst1.executeQuery();
            if(rs.next()){
                JOptionPane.showMessageDialog(null,"Login Successfull");
                HomePage r1=new HomePage();
                r1.setVisible(true);
                r1.pack();
                r1.setLocationRelativeTo(null);
                r1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.dispose();
                
            }
            else{
                JOptionPane.showMessageDialog(null,"Your USERNAME or PASSWORD may be incorrect");
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_blogActionPerformed

    private void tuserKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tuserKeyReleased
        lb1.setText(null);
    }//GEN-LAST:event_tuserKeyReleased

    private void tpassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tpassKeyReleased
        lb2.setText(null);
    }//GEN-LAST:event_tpassKeyReleased

    private void vcbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vcbActionPerformed
        if(vcb.isSelected()){
            tpass.setEchoChar((char) 0);
        }
        else{
            tpass.setEchoChar('*');
        }
    }//GEN-LAST:event_vcbActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Rlink;
    private javax.swing.JButton bexit;
    private javax.swing.JButton blog;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lpass;
    private javax.swing.JLabel luser;
    private javax.swing.JPasswordField tpass;
    private javax.swing.JTextField tuser;
    private javax.swing.JCheckBox vcb;
    // End of variables declaration//GEN-END:variables
}
