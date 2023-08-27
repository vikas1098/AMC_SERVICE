
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class empdetails extends javax.swing.JFrame {
Connection con;
Statement st;
  String s;
    public empdetails(String a) {
        initComponents();
        s=a;
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");       
            Connection con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=service;user=sa;password=1234");
            ;
            st= con.createStatement();
            
            ResultSet rs = st.executeQuery("SELECT  login.Id, employee.name, employee.datejoin, employee.datebirth, employee.address, employee.ahare, employee.email, employee.phone , login.username, login.password FROM login INNER JOIN  employee ON login.Id = employee.eid WHERE login.username = '"+s+"' ");
            while(rs.next())
            {
                lblid.setText(rs.getString(1));
                lblname.setText(rs.getString(2));
                lbldoj.setText(rs.getString(3));
                lbldob.setText(rs.getString(4));
                lbladd.setText(rs.getString(5));
                lbladhar.setText(rs.getString(6));
                lblemail.setText(rs.getString(7));
                lblph.setText(rs.getString(8));
                lbllogin.setText(rs.getString(9));
                lblpwd.setText(rs.getString(10));
            }
            
           
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this,ex.getMessage());
        }
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        back3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        panel2 = new javax.swing.JPanel();
        lblname = new javax.swing.JLabel();
        code2 = new javax.swing.JLabel();
        phone2 = new javax.swing.JLabel();
        email2 = new javax.swing.JLabel();
        area2 = new javax.swing.JLabel();
        city2 = new javax.swing.JLabel();
        acode2 = new javax.swing.JLabel();
        code3 = new javax.swing.JLabel();
        code4 = new javax.swing.JLabel();
        lbldoj = new javax.swing.JLabel();
        lbldob = new javax.swing.JLabel();
        lbladd = new javax.swing.JLabel();
        lbladhar = new javax.swing.JLabel();
        lblemail = new javax.swing.JLabel();
        lblph = new javax.swing.JLabel();
        lbllogin = new javax.swing.JLabel();
        lblpwd = new javax.swing.JLabel();
        name3 = new javax.swing.JLabel();
        name4 = new javax.swing.JLabel();
        lblid = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(600, 600));
        setUndecorated(true);

        jPanel5.setBackground(new java.awt.Color(51, 255, 255));

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 153));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Employee Details");

        back3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aw.png"))); // NOI18N
        back3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                back3MouseClicked(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/close-file.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(back3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 221, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(204, 204, 204)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(back3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panel2.setBackground(new java.awt.Color(255, 255, 255));

        lblname.setBackground(new java.awt.Color(255, 255, 255));
        lblname.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblname.setText("Name :");
        lblname.setOpaque(true);

        code2.setBackground(new java.awt.Color(255, 255, 255));
        code2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        code2.setText("Phone No. :");
        code2.setOpaque(true);

        phone2.setBackground(new java.awt.Color(255, 255, 255));
        phone2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        phone2.setText("Date Of Joining :");
        phone2.setOpaque(true);

        email2.setBackground(new java.awt.Color(255, 255, 255));
        email2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        email2.setText("Date Of Birth :");
        email2.setOpaque(true);

        area2.setBackground(new java.awt.Color(255, 255, 255));
        area2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        area2.setText("Address :");
        area2.setOpaque(true);

        city2.setBackground(new java.awt.Color(255, 255, 255));
        city2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        city2.setText("Adhar Card No. :");
        city2.setOpaque(true);

        acode2.setBackground(new java.awt.Color(255, 255, 255));
        acode2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        acode2.setText("Email Address :");
        acode2.setOpaque(true);

        code3.setBackground(new java.awt.Color(255, 255, 255));
        code3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        code3.setText("Log In ID :");
        code3.setOpaque(true);

        code4.setBackground(new java.awt.Color(255, 255, 255));
        code4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        code4.setText("Log In Password :");
        code4.setOpaque(true);

        lbldoj.setBackground(new java.awt.Color(255, 255, 255));
        lbldoj.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lbldoj.setText("Date Of Joining :");
        lbldoj.setOpaque(true);

        lbldob.setBackground(new java.awt.Color(255, 255, 255));
        lbldob.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lbldob.setText("Date Of Birth :");
        lbldob.setOpaque(true);

        lbladd.setBackground(new java.awt.Color(255, 255, 255));
        lbladd.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lbladd.setText("Address :");
        lbladd.setOpaque(true);

        lbladhar.setBackground(new java.awt.Color(255, 255, 255));
        lbladhar.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lbladhar.setText("Adhar Card No. :");
        lbladhar.setOpaque(true);

        lblemail.setBackground(new java.awt.Color(255, 255, 255));
        lblemail.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblemail.setText("Email Address :");
        lblemail.setOpaque(true);

        lblph.setBackground(new java.awt.Color(255, 255, 255));
        lblph.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblph.setText("Phone No. :");
        lblph.setOpaque(true);

        lbllogin.setBackground(new java.awt.Color(255, 255, 255));
        lbllogin.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lbllogin.setText("Log In ID :");
        lbllogin.setOpaque(true);

        lblpwd.setBackground(new java.awt.Color(255, 255, 255));
        lblpwd.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblpwd.setText("Log In Password :");
        lblpwd.setOpaque(true);

        name3.setBackground(new java.awt.Color(255, 255, 255));
        name3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        name3.setText("Name :");
        name3.setOpaque(true);

        name4.setBackground(new java.awt.Color(255, 255, 255));
        name4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        name4.setText("Employee ID");
        name4.setOpaque(true);

        lblid.setBackground(new java.awt.Color(255, 255, 255));
        lblid.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblid.setText("ID");
        lblid.setOpaque(true);

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(area2)
                                    .addComponent(phone2)
                                    .addComponent(city2)
                                    .addComponent(email2)
                                    .addComponent(code2)
                                    .addComponent(code3)
                                    .addComponent(code4)
                                    .addComponent(acode2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbladd)
                                    .addComponent(lbldoj)
                                    .addComponent(lbladhar)
                                    .addComponent(lbldob)
                                    .addComponent(lblph)
                                    .addComponent(lbllogin)
                                    .addComponent(lblpwd)
                                    .addComponent(lblemail)
                                    .addComponent(lblname, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(167, 167, 167))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addComponent(name4, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblid, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(255, 255, 255))))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(name4)
                    .addComponent(lblid, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name3)
                    .addComponent(lblname))
                .addGap(18, 18, 18)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addComponent(phone2)
                        .addGap(18, 18, 18)
                        .addComponent(email2)
                        .addGap(18, 18, 18)
                        .addComponent(area2)
                        .addGap(18, 18, 18)
                        .addComponent(city2)
                        .addGap(18, 18, 18)
                        .addComponent(acode2)
                        .addGap(18, 18, 18)
                        .addComponent(code2)
                        .addGap(18, 18, 18)
                        .addComponent(code3)
                        .addGap(18, 18, 18)
                        .addComponent(code4))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addComponent(lbldoj)
                        .addGap(18, 18, 18)
                        .addComponent(lbldob)
                        .addGap(18, 18, 18)
                        .addComponent(lbladd)
                        .addGap(18, 18, 18)
                        .addComponent(lbladhar)
                        .addGap(18, 18, 18)
                        .addComponent(lblemail)
                        .addGap(18, 18, 18)
                        .addComponent(lblph)
                        .addGap(18, 18, 18)
                        .addComponent(lbllogin)
                        .addGap(18, 18, 18)
                        .addComponent(lblpwd)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 424, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 50, Short.MAX_VALUE)
                    .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void back3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back3MouseClicked
        new dash1(s).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_back3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel4MouseClicked

    
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
            java.util.logging.Logger.getLogger(empdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(empdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(empdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(empdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new empdetails("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acode2;
    private javax.swing.JLabel area2;
    private javax.swing.JLabel back3;
    private javax.swing.JLabel city2;
    private javax.swing.JLabel code2;
    private javax.swing.JLabel code3;
    private javax.swing.JLabel code4;
    private javax.swing.JLabel email2;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lbladd;
    private javax.swing.JLabel lbladhar;
    private javax.swing.JLabel lbldob;
    private javax.swing.JLabel lbldoj;
    private javax.swing.JLabel lblemail;
    private javax.swing.JLabel lblid;
    private javax.swing.JLabel lbllogin;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lblph;
    private javax.swing.JLabel lblpwd;
    private javax.swing.JLabel name3;
    private javax.swing.JLabel name4;
    private javax.swing.JPanel panel2;
    private javax.swing.JLabel phone2;
    // End of variables declaration//GEN-END:variables
}
