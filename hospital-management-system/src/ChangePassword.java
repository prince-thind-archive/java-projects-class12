
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.Statement;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Raj
 */
public class ChangePassword extends javax.swing.JFrame {
Connection con=null;
ResultSet rs=null;

    /**
     * Creates new form ChangePassword
     */
    public ChangePassword() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnChangePassword = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtOldPassword = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        txtNewPassword = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        txtConfirmPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Change Password");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btnChangePassword.setFont(new java.awt.Font("Palatino Linotype", 1, 12)); // NOI18N
        btnChangePassword.setText("Change Password");
        btnChangePassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnChangePasswordMouseClicked(evt);
            }
        });
        btnChangePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangePasswordActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));

        jLabel1.setFont(new java.awt.Font("Castellar", 1, 12));
        jLabel1.setText("User Name");

        jLabel2.setFont(new java.awt.Font("Castellar", 1, 12));
        jLabel2.setText("Old Password");

        jLabel3.setFont(new java.awt.Font("Castellar", 1, 12));
        jLabel3.setText("New Password");

        jLabel4.setFont(new java.awt.Font("Castellar", 1, 12));
        jLabel4.setText("Confirm Password");

        txtConfirmPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtConfirmPasswordKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtOldPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                            .addComponent(txtNewPassword)
                            .addComponent(txtConfirmPassword))))
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtConfirmPassword, txtNewPassword, txtOldPassword, txtUsername});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(153, Short.MAX_VALUE)
                .addComponent(btnChangePassword)
                .addGap(145, 145, 145))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnChangePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnChangePasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnChangePasswordMouseClicked
       
    }//GEN-LAST:event_btnChangePasswordMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
      
    }//GEN-LAST:event_formWindowOpened

    private void btnChangePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangePasswordActionPerformed
        try{
         String Newpass=String.valueOf(txtNewPassword.getPassword());
         String ConfPass=String.valueOf(txtConfirmPassword.getPassword());
         String OldPass=String.valueOf(txtOldPassword.getPassword());
         String uName=txtUsername.getText();
        if (uName.equals("")) {
              
                JOptionPane.showMessageDialog( this, "Please enter a username",
                                          "Error", JOptionPane.ERROR_MESSAGE);
                return;
               
            } else if (OldPass.equals("")) {
            
                JOptionPane.showMessageDialog( this, "Please enter a old password",
                                          "Error", JOptionPane.ERROR_MESSAGE);
                return;
               
            } else if (Newpass.equals("")) {
              
                JOptionPane.showMessageDialog( this, "Please enter a new password",
                                          "Error", JOptionPane.ERROR_MESSAGE);
                return;
                
            } else if (ConfPass.equals("")) {
               
                JOptionPane.showMessageDialog( this, "Please enter a confirmed password",
                                          "Error", JOptionPane.ERROR_MESSAGE);
                return;
            } 
               else if (Newpass.length()< 5) {
               
                JOptionPane.showMessageDialog(this,
                                         "The New Password Should be of Atleast 5 Characters",
                                         "Error", JOptionPane.ERROR_MESSAGE);
                return;
               }
            
           
            
            else if ((Newpass).equals(OldPass)) {
                
               JOptionPane.showMessageDialog(this,
                                         "Password is same..Re-enter new password","Error", JOptionPane.ERROR_MESSAGE);
               return;
            }
    else if (!(Newpass).equals(ConfPass)) {
               
                JOptionPane.showMessageDialog(this,
                                         "New Password doesn't match with Confirmed Password",
                                         "Error", JOptionPane.ERROR_MESSAGE);
                return;
                                  }
       
      con=Connect.ConnectDB();
      String sql= "select Username,User_Password from users where Username='"+uName+"' and User_Password= '"+OldPass+"'";
      Statement stmt1 = con.createStatement();
             rs= stmt1.executeQuery(sql);
      if(rs.next())        {
            String usrname = (rs.getString("username")).trim();
            String passwd = (rs.getString("user_password")).trim();
            if(uName.equals(usrname) && OldPass.equals(passwd))    {
                con=Connect.ConnectDB();
                 String sql1= "update users set User_password= '" + Newpass + "' " +
                 "where Username= '" + uName + "' and User_password = '" + OldPass + "'";
                 Statement stmt = con.createStatement();
                 stmt.execute(sql1);
                 stmt.close();
                 JOptionPane.showMessageDialog(this,"Password Successfully Changed");
                 this.dispose();
                 return;
              }
          }
        else   {        
             JOptionPane.showMessageDialog(this,"invalid user name or password","Error", JOptionPane.ERROR_MESSAGE);
             txtUsername.setText("");
             txtOldPassword.setText("");
             txtNewPassword.setText("");
             txtConfirmPassword.setText("");
             return;
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
    }//GEN-LAST:event_btnChangePasswordActionPerformed

    private void txtConfirmPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConfirmPasswordKeyPressed
        
    }//GEN-LAST:event_txtConfirmPasswordKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ChangePassword().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChangePassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtConfirmPassword;
    private javax.swing.JPasswordField txtNewPassword;
    private javax.swing.JPasswordField txtOldPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}