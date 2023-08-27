
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;



public class dash1 extends javax.swing.JFrame {
 Connection con;
    Statement st;
   String s;
    public dash1(String a) {
            s=a;
        initComponents();
        id.setText(a);
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");       
             con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=service;user=sa;password=1234");
            //Class.forName("oracle.jdbc.driver.OracleDriver");
            //con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","jindalneha1999");
            st= con.createStatement();
            
            ResultSet rs=st.executeQuery("select *from permission where name='"+s+"'");
            if(rs.next())
            {
               
                if( rs.getString(5).equals("1"))
                {
                    btncustomer.setEnabled(true);
                }
                else
                {
                   btncustomer.setEnabled(false); 
                }
                
                 
                if(rs.getString(3).equals("1"))
                {
                    btnservice.setEnabled(true);
                }
                else
                {
                   btnservice.setEnabled(false);
                }
                
                
                if(rs.getString(4).equals("1"))
                {
                    btncservice.setEnabled(true);
                }
                else
                {
                    btncservice.setEnabled(false); 
                }
                
                
                if(rs.getString(6).equals("1"))
                {
                    btnempldetails.setEnabled(true);
                }
                else
                {
                    btnempldetails.setEnabled(false); 
                }
                
                
                if(rs.getString(7).equals("1"))
                {
                    btncard.setEnabled(true);
                }
                else
                {
                    btncard.setEnabled(false); 
                }
                
                
                if(rs.getString(8).equals("1"))
                {
                    btnelog.setEnabled(true);
                }
                else
                {
                    btnelog.setEnabled(false); 
                }
                
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

        jPanel1 = new javax.swing.JPanel();
        btnservice = new javax.swing.JButton();
        btncservice = new javax.swing.JButton();
        btncustomer = new javax.swing.JButton();
        btnempldetails = new javax.swing.JButton();
        btncard = new javax.swing.JButton();
        btnelog = new javax.swing.JButton();
        front = new javax.swing.JPanel();
        id = new javax.swing.JLabel();
        img = new javax.swing.JLabel();
        text = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnservice.setBackground(new java.awt.Color(153, 153, 153));
        btnservice.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnservice.setForeground(new java.awt.Color(102, 102, 102));
        btnservice.setText(" Services");
        btnservice.setFocusPainted(false);
        btnservice.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnservice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnserviceActionPerformed(evt);
            }
        });

        btncservice.setBackground(new java.awt.Color(153, 153, 153));
        btncservice.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btncservice.setForeground(new java.awt.Color(102, 102, 102));
        btncservice.setText("Customer Service");
        btncservice.setFocusPainted(false);
        btncservice.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btncservice.setMaximumSize(new java.awt.Dimension(136, 37));
        btncservice.setMinimumSize(new java.awt.Dimension(136, 37));
        btncservice.setPreferredSize(new java.awt.Dimension(136, 37));
        btncservice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncserviceActionPerformed(evt);
            }
        });

        btncustomer.setBackground(new java.awt.Color(153, 153, 153));
        btncustomer.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btncustomer.setForeground(new java.awt.Color(102, 102, 102));
        btncustomer.setText("Customer");
        btncustomer.setFocusPainted(false);
        btncustomer.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btncustomer.setMaximumSize(new java.awt.Dimension(136, 37));
        btncustomer.setMinimumSize(new java.awt.Dimension(136, 37));
        btncustomer.setPreferredSize(new java.awt.Dimension(136, 37));
        btncustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncustomerMouseClicked(evt);
            }
        });
        btncustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncustomerActionPerformed(evt);
            }
        });

        btnempldetails.setBackground(new java.awt.Color(153, 153, 153));
        btnempldetails.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnempldetails.setForeground(new java.awt.Color(102, 102, 102));
        btnempldetails.setText("Emlpoyee Details");
        btnempldetails.setFocusPainted(false);
        btnempldetails.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnempldetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnempldetailsActionPerformed(evt);
            }
        });

        btncard.setBackground(new java.awt.Color(153, 153, 153));
        btncard.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btncard.setForeground(new java.awt.Color(102, 102, 102));
        btncard.setText("Card");
        btncard.setFocusPainted(false);
        btncard.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btncard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncardActionPerformed(evt);
            }
        });

        btnelog.setBackground(new java.awt.Color(153, 153, 153));
        btnelog.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnelog.setForeground(new java.awt.Color(102, 102, 102));
        btnelog.setText("Employee Log Out");
        btnelog.setFocusPainted(false);
        btnelog.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnelog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnelogActionPerformed(evt);
            }
        });

        front.setBackground(new java.awt.Color(153, 153, 153));

        id.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        id.setText("Id: ");

        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/planning-scheduling-300x233.png"))); // NOI18N

        text.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        text.setText("Scheduling Services And Printing Cards");

        javax.swing.GroupLayout frontLayout = new javax.swing.GroupLayout(front);
        front.setLayout(frontLayout);
        frontLayout.setHorizontalGroup(
            frontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frontLayout.createSequentialGroup()
                .addGroup(frontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frontLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(frontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(frontLayout.createSequentialGroup()
                            .addGroup(frontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(id, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGap(60, 60, 60)
                            .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(text)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        frontLayout.setVerticalGroup(
            frontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frontLayout.createSequentialGroup()
                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(frontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frontLayout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(318, 318, 318)
                        .addComponent(text)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 95, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(51, 255, 255));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 153));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Welcome ");

        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/close-file.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(back)
                .addGap(315, 315, 315)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 325, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btncservice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                        .addComponent(btnservice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnempldetails, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btncard, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnelog)
                    .addComponent(btncustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(front, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(front, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnservice, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(btncservice, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btncustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(btnempldetails, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(btncard, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(btnelog, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(899, 550));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnserviceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnserviceActionPerformed
        new prob(s).setVisible(true);
        this.dispose();
            
    }//GEN-LAST:event_btnserviceActionPerformed

    private void btncserviceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncserviceActionPerformed
       new service2(s).setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btncserviceActionPerformed

    private void btncustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncustomerMouseClicked
          
    }//GEN-LAST:event_btncustomerMouseClicked

    private void btncustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncustomerActionPerformed
       /*int x=jPanel2.getHeight();
       int y=jPanel2.getWidth();
       jPanel2.setBounds(60, 90, y, x);
       jPanel2.setVisible(true);
       front.setVisible(false);*/
       
       new Customer(s).setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btncustomerActionPerformed

    private void btnempldetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnempldetailsActionPerformed
            new empdetails(s).setVisible(true);
            this.dispose();
    }//GEN-LAST:event_btnempldetailsActionPerformed

    private void btncardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncardActionPerformed
        new card(s).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btncardActionPerformed

    private void btnelogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnelogActionPerformed
        new Emplog().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnelogActionPerformed

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked

    }//GEN-LAST:event_backMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

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
            java.util.logging.Logger.getLogger(dash1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dash1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dash1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dash1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dash1("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JButton btncard;
    private javax.swing.JButton btncservice;
    private javax.swing.JButton btncustomer;
    private javax.swing.JButton btnelog;
    private javax.swing.JButton btnempldetails;
    private javax.swing.JButton btnservice;
    private javax.swing.JPanel front;
    private javax.swing.JLabel id;
    private javax.swing.JLabel img;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel text;
    // End of variables declaration//GEN-END:variables
}
