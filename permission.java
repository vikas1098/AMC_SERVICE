
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class permission extends javax.swing.JFrame {
 Connection con;
    Statement st;
    
   
    public permission() {
        initComponents();
         try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");       
          con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=service;user=sa;password=1234");
            //Class.forName("oracle.jdbc.driver.OracleDriver");
            //con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","jindalneha1999");
            st= con.createStatement();
            
            
            //JOptionPane.showMessageDialog(this,"connection created");
        }
         catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this,ex.getMessage());
        }
         
          try
        {
            ResultSet rs= st.executeQuery("select distinct Id from login ");
            int i=0;
            while(rs.next())
            {
                box.addItem(rs.getString("Id"));
             
            }
        }
        catch(Exception ex)
        {
             JOptionPane.showMessageDialog(this,ex.getMessage());
        } 
          
        /* try
        {
            ResultSet rs1= st.executeQuery("select username from log ");
            int i=0;
            while(rs1.next())
            {
                box1.addItem(rs1.getString("username"));
             
            }
        }
        catch(Exception ex)
        {
             JOptionPane.showMessageDialog(this,ex.getMessage());
        }*/
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        box = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        employee1 = new javax.swing.JCheckBox();
        service = new javax.swing.JCheckBox();
        car = new javax.swing.JCheckBox();
        customer1 = new javax.swing.JCheckBox();
        login1 = new javax.swing.JCheckBox();
        machine1 = new javax.swing.JCheckBox();
        btnsave = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        box1 = new javax.swing.JComboBox<>();
        btnsearch = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        box.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setText("ID :");

        employee1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        employee1.setText("Employee");

        service.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        service.setText("Services");

        car.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        car.setText("Card");

        customer1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        customer1.setText("Customer");

        login1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        login1.setText("Admin LogIn");

        machine1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        machine1.setText("Machine");

        btnsave.setBackground(new java.awt.Color(153, 153, 153));
        btnsave.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel2.setText("Name :");

        box1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        box1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box1ActionPerformed(evt);
            }
        });

        btnsearch.setBackground(new java.awt.Color(153, 153, 153));
        btnsearch.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnsearch.setText("Search");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });

        btnupdate.setBackground(new java.awt.Color(153, 153, 153));
        btnupdate.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aw.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(btnsearch)
                        .addGap(62, 62, 62)
                        .addComponent(btnupdate)
                        .addGap(52, 52, 52)
                        .addComponent(btnsave))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(116, 116, 116)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(box, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(134, 134, 134))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(box1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(134, 134, 134))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(machine1)
                                        .addGap(69, 69, 69))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(service)
                                        .addGap(65, 65, 65)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(employee1)
                                    .addComponent(car))
                                .addGap(54, 54, 54)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(login1)
                                    .addComponent(customer1))))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(box, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(box1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(service)
                    .addComponent(customer1)
                    .addComponent(employee1))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(login1)
                    .addComponent(car)
                    .addComponent(machine1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsave)
                    .addComponent(btnupdate)
                    .addComponent(btnsearch))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(500, 387));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        try
        {
        
        int ser=0,emp=0, cus=0, mac=0, card=0, log=0;
        String a=box.getSelectedItem()+"";
        if(service.isSelected())
        {
           ser=1; 
        }
        else
        {
            ser=0;
        }
      
        if(employee1.isSelected())
        {
           emp=1; 
        }
        else
        {
            emp=0;
        }
        
        if(customer1.isSelected())
        {
           cus=1; 
        }
        else
        {
            cus=0;
        }
        
        if(car.isSelected())
        {
           card=1; 
        }
        else
        {
            card=0;
        }
        
        if(machine1.isSelected())
        {
           mac=1; 
        }
        else
        {
            mac=0;
        }
        
        if(login1.isSelected())
        {
           log=1; 
        }
        else
        {
            log=0;
        }
        
        st.execute("insert into permission values('"+ser+"','"+emp+"','"+cus+"','"+mac+"','"+card+"','"+log+"','"+a+"')");
         
         JOptionPane.showMessageDialog(this,"data saved");
        }        
        
      catch(Exception ex)
              {
                  JOptionPane.showMessageDialog(this,ex);
              }
    }//GEN-LAST:event_btnsaveActionPerformed

    private void boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxActionPerformed
                        box1.removeAllItems();
        String a=box.getSelectedItem()+"";
        try
        {
            ResultSet rs2= st.executeQuery("select distinct username from login where Id='"+a+"'");
            int i=0;
            while(rs2.next())
            {
                box1.addItem(rs2.getString("username"));
             
            }
        }
        catch(Exception ex)
        {
             JOptionPane.showMessageDialog(this,ex.getMessage());
        }
    }//GEN-LAST:event_boxActionPerformed

    private void box1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box1ActionPerformed

        
    }//GEN-LAST:event_box1ActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        String value=box.getSelectedItem()+"";
        try
        {
            ResultSet rs=st.executeQuery("select *from permission where Id='"+value+"'");
            if(rs.next())
            {
                if(rs.getString(3).equals("1"))
                {
                    service.setSelected(true);
                }
                else
                {
                    service.setSelected(false);
                }
                
                if(rs.getString(4).equals("1"))
                {
                    employee1.setSelected(true);
                }
                else
                {
                    employee1.setSelected(false);
                }
                
                if(rs.getString(5).equals("1"))
                {
                    customer1.setSelected(true);
                }
                else
                {
                    customer1.setSelected(false);
                }
                
                if(rs.getString(6).equals("1"))
                {
                    machine1.setSelected(true);
                }
                else
                {
                    machine1.setSelected(false);
                }
                
                if(rs.getString(7).equals("1"))
                {
                    car.setSelected(true);
                }
                else
                {
                    car.setSelected(false);
                }
                
                if(rs.getString(8).equals("1"))
                {
                    login1.setSelected(true);
                }
                else
                {
                    login1.setSelected(false);
                }
            }
            else
            {}
        }
        catch(Exception ex)
        {}
    }//GEN-LAST:event_btnsearchActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        try
        {
            int ser=0,emp=0, cus=0, mac=0, card=0, log=0;
        String a=box.getSelectedItem()+"";
        if(service.isSelected())
        {
           ser=1; 
        }
        else
        {
            ser=0;
        }
      
        if(employee1.isSelected())
        {
           emp=1; 
        }
        else
        {
            emp=0;
        }
        
        if(customer1.isSelected())
        {
           cus=1; 
        }
        else
        {
            cus=0;
        }
        
        if(car.isSelected())
        {
           card=1; 
        }
        else
        {
            card=0;
        }
        
        if(machine1.isSelected())
        {
           mac=1; 
        }
        else
        {
            mac=0;
        }
        
        if(login1.isSelected())
        {
           log=1; 
        }
        else
        {
            log=0;
        }
         //JOptionPane.showMessageDialog(this," updade");
            st.execute("update permission set services="+ser+",employee="+emp+",customer='"+cus+"',machine='"+mac+"',card='"+card+"',login='"+log+"' where Id="+a+"");
            JOptionPane.showMessageDialog(this," saved");
        }
        catch(Exception ex)
        {
             JOptionPane.showMessageDialog(this,ex);
        }
    }//GEN-LAST:event_btnupdateActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        new dash().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

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
            java.util.logging.Logger.getLogger(permission.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(permission.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(permission.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(permission.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new permission().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JComboBox<String> box;
    private javax.swing.JComboBox<String> box1;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnsearch;
    private javax.swing.JButton btnupdate;
    private javax.swing.JCheckBox car;
    private javax.swing.JCheckBox customer1;
    private javax.swing.JCheckBox employee1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JCheckBox login1;
    private javax.swing.JCheckBox machine1;
    private javax.swing.JCheckBox service;
    // End of variables declaration//GEN-END:variables
}
