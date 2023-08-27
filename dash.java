
import javax.swing.JOptionPane;

 

public class dash extends javax.swing.JFrame {

   
    public dash() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnservice = new javax.swing.JButton();
        btnemployee = new javax.swing.JButton();
        btncustomer = new javax.swing.JButton();
        btnmachine = new javax.swing.JButton();
        btncard = new javax.swing.JButton();
        btnalog = new javax.swing.JButton();
        bar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        front = new javax.swing.JPanel();
        img = new javax.swing.JLabel();
        text = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnservice.setBackground(new java.awt.Color(153, 153, 153));
        btnservice.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnservice.setForeground(new java.awt.Color(102, 102, 102));
        btnservice.setText("Service Schedule");
        btnservice.setFocusPainted(false);
        btnservice.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnservice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnserviceActionPerformed(evt);
            }
        });

        btnemployee.setBackground(new java.awt.Color(153, 153, 153));
        btnemployee.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnemployee.setForeground(new java.awt.Color(102, 102, 102));
        btnemployee.setText("Employees");
        btnemployee.setFocusPainted(false);
        btnemployee.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnemployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnemployeeActionPerformed(evt);
            }
        });

        btncustomer.setBackground(new java.awt.Color(153, 153, 153));
        btncustomer.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btncustomer.setForeground(new java.awt.Color(102, 102, 102));
        btncustomer.setText("Pending Services");
        btncustomer.setFocusPainted(false);
        btncustomer.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
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

        btnmachine.setBackground(new java.awt.Color(153, 153, 153));
        btnmachine.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnmachine.setForeground(new java.awt.Color(102, 102, 102));
        btnmachine.setText("Machine Entry");
        btnmachine.setFocusPainted(false);
        btnmachine.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnmachine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmachineActionPerformed(evt);
            }
        });

        btncard.setBackground(new java.awt.Color(153, 153, 153));
        btncard.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btncard.setForeground(new java.awt.Color(102, 102, 102));
        btncard.setText("Cards Status");
        btncard.setFocusPainted(false);
        btncard.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btncard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncardActionPerformed(evt);
            }
        });

        btnalog.setBackground(new java.awt.Color(153, 153, 153));
        btnalog.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnalog.setForeground(new java.awt.Color(102, 102, 102));
        btnalog.setText("Admin Log Out");
        btnalog.setFocusPainted(false);
        btnalog.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnalog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnalogActionPerformed(evt);
            }
        });

        bar.setBackground(new java.awt.Color(0, 51, 204));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/close-file.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout barLayout = new javax.swing.GroupLayout(bar);
        bar.setLayout(barLayout);
        barLayout.setHorizontalGroup(
            barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        barLayout.setVerticalGroup(
            barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
        );

        front.setBackground(new java.awt.Color(153, 153, 153));

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
                    .addGroup(frontLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(frontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(text, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        frontLayout.setVerticalGroup(
            frontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frontLayout.createSequentialGroup()
                .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(text)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 110, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btncustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnemployee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnservice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnalog, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                    .addComponent(btncard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnmachine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(front, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(bar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(front, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnservice, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(btnemployee, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(btncustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnmachine, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(btncard, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(btnalog, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnserviceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnserviceActionPerformed
        new service("").setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnserviceActionPerformed

    private void btnemployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnemployeeActionPerformed
        new empstrength().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnemployeeActionPerformed

    private void btncustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncustomerActionPerformed
       new pendingservices().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btncustomerActionPerformed

    private void btnmachineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmachineActionPerformed
        new machine1("").setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnmachineActionPerformed

    private void btncardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncardActionPerformed
        new cardstatus().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btncardActionPerformed

    private void btnalogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnalogActionPerformed
        new Emplog().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnalogActionPerformed

    private void btncustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncustomerMouseClicked
        new Customer("").setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btncustomerMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

   
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bar;
    private javax.swing.JButton btnalog;
    private javax.swing.JButton btncard;
    private javax.swing.JButton btncustomer;
    private javax.swing.JButton btnemployee;
    private javax.swing.JButton btnmachine;
    private javax.swing.JButton btnservice;
    private javax.swing.JPanel front;
    private javax.swing.JLabel img;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel text;
    // End of variables declaration//GEN-END:variables
}
