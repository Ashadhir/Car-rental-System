/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahamed Shadhir
 */
public class cardetails extends javax.swing.JFrame {

    /**
     * Creates new form cardetails
     */
    public cardetails() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        fxdamt = new javax.swing.JTextField();
        engine = new javax.swing.JTextField();
        reg = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        color = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        model = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        make = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));
        getContentPane().setLayout(null);

        jLabel8.setFont(new java.awt.Font("Andalus", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(16, 72, 77));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("REGISTRATION NO.             ");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(70, 240, 130, 20);

        jLabel9.setFont(new java.awt.Font("Andalus", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(16, 72, 77));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("fIXED AMOUNT                 ");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(70, 300, 110, 20);
        getContentPane().add(fxdamt);
        fxdamt.setBounds(200, 300, 190, 20);

        engine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                engineActionPerformed(evt);
            }
        });
        getContentPane().add(engine);
        engine.setBounds(200, 270, 190, 20);
        getContentPane().add(reg);
        reg.setBounds(200, 240, 190, 20);

        jLabel1.setFont(new java.awt.Font("Andalus", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(96, 118, 188));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ADD NEW CAR INFORMATION");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(140, 60, 230, 40);
        getContentPane().add(color);
        color.setBounds(200, 210, 190, 20);

        jLabel2.setFont(new java.awt.Font("Andalus", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(30, 49, 103));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CAR RENTAL SYSTEM");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(147, 9, 210, 40);
        getContentPane().add(model);
        model.setBounds(200, 180, 190, 20);

        jLabel3.setFont(new java.awt.Font("Andalus", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(16, 72, 77));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CAR MODEL                        ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(80, 180, 90, 20);
        getContentPane().add(make);
        make.setBounds(200, 150, 190, 20);

        jLabel4.setFont(new java.awt.Font("Andalus", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(16, 72, 77));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("CAR MAKE                          ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(80, 150, 90, 20);

        jButton1.setText("SAVE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(200, 340, 104, 30);

        jLabel5.setFont(new java.awt.Font("Andalus", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(16, 72, 77));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("CAR COLOR                        ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(80, 210, 110, 20);

        jButton2.setText("CANCEL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(320, 340, 98, 30);

        jLabel7.setFont(new java.awt.Font("Andalus", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(16, 72, 77));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("ENGINE NO.                       ");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(80, 270, 100, 20);

        setBounds(0, 0, 603, 486);
    }// </editor-fold>//GEN-END:initComponents

    private void engineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_engineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_engineActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Statement st = null;
        ResultSet rs = null;
        try{
            String url="jdbc:mysql://localhost:3306/car_rental_system";
            String usname="root";
            String pswd="root";
            //Connection conn = MySQLConn.ConnectDB();
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, usname, pswd);

            st = conn.createStatement();
            String makecar = make.getText();
            String modelcar = model.getText();
            String colorcar=color.getText();
            String regno=reg.getText();
            String engineno=engine.getText();
            String fixedamt=fxdamt.getText();

            /*for (int i = 1; i < 100; i++) {
                String r="CR01"+i;
            }*/

            String q = "INSERT INTO addcars(CARMAKE,CARMODEL,CARCOLOR,REGNO,ENGINENO,FIXEDAMT) VALUES ('"+makecar+"','"+modelcar+"','"+colorcar+"','"+regno+"','"+engineno+"','"+fixedamt+"')";

            st.executeUpdate(q);
            //PreparedStatement st = new PreparedStatement();

            JOptionPane.showMessageDialog(null,"Registration Successed");

        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,e.toString());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(addcars.class.getName()).log(Level.SEVERE, null, ex);
        } // TODO add your handling code here:

        home h=new home();
        h.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        home h=new home();
        h.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(cardetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cardetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cardetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cardetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cardetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField color;
    private javax.swing.JTextField engine;
    private javax.swing.JTextField fxdamt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField make;
    private javax.swing.JTextField model;
    private javax.swing.JTextField reg;
    // End of variables declaration//GEN-END:variables
}
