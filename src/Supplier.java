
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import javax.swing.UIManager;
public class Supplier extends javax.swing.JFrame {
    private void autocode(){
        try{
            Connection c=konkesiAPP.koneksi.configDB();
            Statement s=c.createStatement();
            String sql="select * from Supplier order by id_supplier desc";
            ResultSet r=s.executeQuery(sql);
            if (r.next()){
                String idsupplier=r.getString("id_supplier").substring(2);
                String IS =""+(Integer.parseInt(idsupplier)+1);
                String Nol="";
                if (IS.length()==1){
                    Nol="00"; 
                }else if (IS.length()==2){
                   Nol="0";
                }else if (IS.length()==3){
                    Nol="";}
                    txtid.setText("SP" +Nol +IS);
            }else {
                txtid.setText("SP001");
            }
            c.close();
            s.close();
        }catch (Exception e){
            System.out.println("autocode error");
}
    }
    
    public void ShowData(){
        DefaultTableModel model = new DefaultTableModel();
        
        jTable1.setModel(model);
        model.addColumn("id Supplier");
        model.addColumn("Nama Supplier");
        model.addColumn("No HP");
        model.addColumn("Alamat");
        
        try{
        Statement s = konkesiAPP.koneksi.configDB().createStatement();
        ResultSet rs = s.executeQuery("SELECT * FROM supplier");
        
        while(rs.next())
            {
                model.addRow(new Object[] {
                    rs.getString("id_supplier"),
                    rs.getString("nama_supplier"),
                    rs.getString("no_hp"),
                    rs.getString("alamat"),
                    
                });
                jTable1.setModel(model);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal"+e.getMessage());
    }   
        
    }

    /**
     * Creates new form Supplier
     */
    public Supplier() {
        try{
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels())
            {
                if ("Windows".equals(info.getName()))
                {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex){
            ex.getMessage();
             
        }
        initComponents();
        autocode();
        ShowData();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtusernamee1 = new javax.swing.JLabel();
        txtalamat = new javax.swing.JTextField();
        txtnohp = new javax.swing.JTextField();
        txtid = new javax.swing.JTextField();
        txtnamasupplier = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1930, 1020));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/tambah icon.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 363, 50, 60));

        jButton1.setBackground(new java.awt.Color(0, 215, 255));
        jButton1.setForeground(new java.awt.Color(0, 215, 255));
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 355, 86, 67));

        txtusernamee1.setText("jLabel2");
        getContentPane().add(txtusernamee1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1670, 120, 110, 30));

        txtalamat.setBackground(new java.awt.Color(237, 231, 228));
        txtalamat.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtalamat.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 0, 0)));
        txtalamat.setMinimumSize(new java.awt.Dimension(4, 33));
        txtalamat.setPreferredSize(new java.awt.Dimension(4, 33));
        getContentPane().add(txtalamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 260, 310, 60));

        txtnohp.setBackground(new java.awt.Color(237, 231, 228));
        txtnohp.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtnohp.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 0, 0)));
        txtnohp.setMinimumSize(new java.awt.Dimension(4, 33));
        txtnohp.setPreferredSize(new java.awt.Dimension(4, 33));
        getContentPane().add(txtnohp, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 180, 310, 60));

        txtid.setBackground(new java.awt.Color(237, 231, 228));
        txtid.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtid.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 0, 0)));
        txtid.setMinimumSize(new java.awt.Dimension(4, 33));
        txtid.setPreferredSize(new java.awt.Dimension(4, 33));
        getContentPane().add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 180, 310, 60));

        txtnamasupplier.setBackground(new java.awt.Color(237, 231, 228));
        txtnamasupplier.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtnamasupplier.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 0, 0)));
        txtnamasupplier.setMinimumSize(new java.awt.Dimension(4, 33));
        txtnamasupplier.setPreferredSize(new java.awt.Dimension(4, 33));
        getContentPane().add(txtnamasupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 260, 310, 60));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/edit icon.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(568, 360, 50, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/icon hapus.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1795, 364, 50, 60));

        jButton3.setBackground(new java.awt.Color(255, 30, 30));
        jButton3.setForeground(new java.awt.Color(255, 30, 30));
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1777, 356, 86, 67));

        jButton4.setBackground(new java.awt.Color(0, 215, 255));
        jButton4.setForeground(new java.awt.Color(0, 215, 255));
        jButton4.setBorder(null);
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, 86, 67));

        jButton5.setBackground(new java.awt.Color(255, 228, 0));
        jButton5.setForeground(new java.awt.Color(255, 228, 0));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(547, 356, 86, 68));

        jTable1.setBackground(new java.awt.Color(173, 172, 172));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "id supplier", "Nama Supplier", "No Hp", "Alamat"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 530, 1360, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/supplier (6).png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        try{
            String sql = "UPDATE supplier SET no_hp ="+txtnohp.getText()+"where id_supplier ="+txtid.getText()+"";
            java.sql.Connection conn = (Connection)konkesiAPP.koneksi.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            this.setVisible(false);
            new Supplier().setVisible(true);
            JOptionPane.showMessageDialog(null, "Data Berhasil di Edit");
            ShowData();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try{
            String sql = "DELETE from supplier WHERE id_supplier="+txtid.getText()+"";
            java.sql.Connection conn = (Connection)konkesiAPP.koneksi.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this, "Hapus Data");
        }catch (Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
        ShowData();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try{
            String sql = "INSERT INTO supplier VALUES('"+txtid.getText()+"','"+txtnamasupplier.getText()+"','"+txtnohp.getText()+"','"+txtalamat.getText()+"')";//id_supplier, nama_supplier, no_hp, alamat) VALUES" + "('"+ is +"','"+ ns +"','"+ nh +"','"+ alamat +"',)";
            java.sql.Connection conn = (Connection)konkesiAPP.koneksi.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            this.setVisible(false);
            new Supplier().setVisible(true);
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
            ShowData();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "ERROR \n" +e.getMessage());
        }
          this.dispose();
          
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4MouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        try{
            String sql = "INSERT INTO supplier VALUES ('"+txtid.getText()+"','"+txtnamasupplier.getText()+"','"+txtnohp.getText()+"','"+txtalamat.getText()+"')";//id_supplier, nama_supplier, no_hp, alamat) VALUES" + "('"+ is +"','"+ ns +"','"+ nh +"','"+ alamat +"',)";
        java.sql.Connection conn = (Connection)konkesiAPP.koneksi.configDB();
        java.sql.PreparedStatement pst = conn.prepareStatement(sql);
        pst.execute();
        this.setVisible(false);
        new Supplier().setVisible(true);
        JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
        ShowData();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "ERROR \n" +e.getMessage());
        }
        this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

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
            java.util.logging.Logger.getLogger(Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Supplier().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtalamat;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnamasupplier;
    private javax.swing.JTextField txtnohp;
    private javax.swing.JLabel txtusernamee1;
    // End of variables declaration//GEN-END:variables
}
