package todolist;

import Database.ConnectionDB;
import com.sun.xml.internal.ws.api.ha.StickyFeature;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import jdk.nashorn.internal.parser.TokenType;

public class ListJFrame extends javax.swing.JFrame {

    ArrayList<ToDoList> list;

    public ListJFrame() {
        initComponents();

    }

    Connection getConnection() {
        return new ConnectionDB().getConnection();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        baslik_txt = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        aciklama_txta = new javax.swing.JTextArea();
        kaydet_txt = new javax.swing.JButton();
        yapilmamis_görevler_btn = new javax.swing.JButton();
        yapilmis_görevler_btn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        secili_olanli_sil_btn = new javax.swing.JButton();
        tumunu_sil_btn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        id_txt = new javax.swing.JTextField();
        gun_cbox = new javax.swing.JComboBox<>();
        ay_cbox = new javax.swing.JComboBox<>();
        yil_cbox = new javax.swing.JComboBox<>();
        durum_btn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 255));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(233, 192, 253));
        jPanel1.setForeground(new java.awt.Color(255, 102, 255));

        jPanel2.setBackground(new java.awt.Color(255, 204, 255));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Başlık", "Açıklama", "Tarih", "Durum"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table.setColumnSelectionAllowed(true);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);
        table.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Görev Listesi");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(161, 15, 15));
        jLabel2.setText("Yeni Liste Oluştur");

        baslik_txt.setToolTipText("");
        baslik_txt.setFocusTraversalPolicyProvider(true);

        aciklama_txta.setColumns(20);
        aciklama_txta.setRows(5);
        jScrollPane2.setViewportView(aciklama_txta);

        kaydet_txt.setText("Kaydet");
        kaydet_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kaydet_txtActionPerformed(evt);
            }
        });

        yapilmamis_görevler_btn.setText("Yapılmamış Görevleri Listele");
        yapilmamis_görevler_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yapilmamis_görevler_btnActionPerformed(evt);
            }
        });

        yapilmis_görevler_btn.setText("Yapılmış Görevleri Listele");
        yapilmis_görevler_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yapilmis_görevler_btnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 0));
        jLabel3.setText("Ara>>");

        secili_olanli_sil_btn.setText("Seçili Görevi Sil");
        secili_olanli_sil_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secili_olanli_sil_btnActionPerformed(evt);
            }
        });

        tumunu_sil_btn.setText("Tümünü Sil");
        tumunu_sil_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tumunu_sil_btnActionPerformed(evt);
            }
        });

        jLabel5.setText("ID:");

        gun_cbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        ay_cbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        yil_cbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2022", "2023", "2024", "2025" }));

        durum_btn.setText("Durumu Güncelle");
        durum_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                durum_btnActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 153, 0));
        jLabel6.setText("--------------------------------------------------");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3)
                                .addComponent(durum_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(kaydet_txt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(gun_cbox, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(66, 66, 66)
                                    .addComponent(ay_cbox, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(yil_cbox, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(baslik_txt)
                                .addComponent(jScrollPane2)
                                .addComponent(yapilmis_görevler_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(yapilmamis_görevler_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(secili_olanli_sil_btn)
                                    .addGap(29, 29, 29)
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(id_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(tumunu_sil_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(baslik_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(gun_cbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ay_cbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yil_cbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(kaydet_txt)
                        .addGap(18, 18, 18)
                        .addComponent(durum_btn)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel3)
                        .addGap(32, 32, 32)
                        .addComponent(yapilmamis_görevler_btn)
                        .addGap(18, 18, 18)
                        .addComponent(yapilmis_görevler_btn)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(36, 36, 36)
                        .addComponent(tumunu_sil_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(secili_olanli_sil_btn)
                            .addComponent(jLabel5)
                            .addComponent(id_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(12, Short.MAX_VALUE))))
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

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
Boolean durum = false;
    private void kaydet_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kaydet_txtActionPerformed
        Connection con = getConnection();

        String sql = "Insert Into ToDoList(baslik,aciklama,tarih,durum) values (?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, baslik_txt.getText());
            ps.setString(2, aciklama_txta.getText());
            ps.setString(3, (String) gun_cbox.getSelectedItem() + "." + (String) ay_cbox.getSelectedItem() + "." + (String) yil_cbox.getSelectedItem());
            ps.setString(4, (String) "Yapılmadı");

            int sonuc = ps.executeUpdate();
            if (sonuc >= 1) {
                JOptionPane.showMessageDialog(null, "Kayıt Başarılı!");

            }
            ps.close();
            con.close();
        } catch (Exception e) {
            System.out.println("Kayıt Başarısız... HATA:" + e);
        }
        Sil();
        Listele();


    }//GEN-LAST:event_kaydet_txtActionPerformed

    private void yapilmamis_görevler_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yapilmamis_görevler_btnActionPerformed
        Sil();
       Listele("select * from ToDoList Where durum=\"Yapılmadı\"");
    }//GEN-LAST:event_yapilmamis_görevler_btnActionPerformed

    private void yapilmis_görevler_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yapilmis_görevler_btnActionPerformed
        Sil();
        Listele("select * from ToDoList Where durum=\"Yapıldı\"");
    }//GEN-LAST:event_yapilmis_görevler_btnActionPerformed

    private void tumunu_sil_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tumunu_sil_btnActionPerformed
        Connection con = null;
        Statement stm = null;
        try {
            int sonuc;

            sonuc = JOptionPane.showConfirmDialog(null, "Bütün kayıtlar silinsin mi?", "Onay",
                    JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (sonuc == JOptionPane.YES_OPTION) {
                con = getConnection();
                stm = con.createStatement();

                String sql = "Delete from ToDoList";
                stm.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Bütün Kayıtlar Silindi.");

                DefaultTableModel tblModel = (DefaultTableModel) table.getModel();
                tblModel.setRowCount(0);
            } else {
                JOptionPane.showMessageDialog(null, "Kayıt Silmekten Vazgeçtiniz.");
            }

            

        } catch (Exception e) {
            System.out.println("Silme işlemi başarısız... Hata:" + e);
        }


    }//GEN-LAST:event_tumunu_sil_btnActionPerformed

    private void secili_olanli_sil_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secili_olanli_sil_btnActionPerformed
        Connection con = null;
        Statement stm = null;
        try {
            con = getConnection();
            stm = con.createStatement();
            int id = Integer.parseInt(id_txt.getText().trim());
            String sql = "Delete from ToDoList where id=" + id;

            int sonuc = stm.executeUpdate(sql);

            if (sonuc > 0) {
                JOptionPane.showMessageDialog(null, sonuc + "Kayıt silindi");
            } else {
                JOptionPane.showMessageDialog(null, "Silinecek kayıt yok");
            }
        } catch (Exception e) {
            System.out.println("Kayıt Başarısız...HATA:" + e);
        } finally {
            try {
                if (stm != null) {
                    stm.close();
                    if (con != null) {
                        con.close();
                    }
                }
            } catch (SQLException se) {
                System.out.println(se.getMessage());
            }
            Sil();
            Listele();
        }
    }//GEN-LAST:event_secili_olanli_sil_btnActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        DefaultTableModel dt = (DefaultTableModel) table.getModel();
        int index = table.getSelectedRow();
        id_txt.setText(dt.getValueAt(index, 0).toString());
    }//GEN-LAST:event_tableMouseClicked

    private void durum_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_durum_btnActionPerformed
        DefaultTableModel dt = (DefaultTableModel) table.getModel();
        int id = table.getSelectedRow();
        String a = String.valueOf(table.getColumnSelectionAllowed());
        if (!table.getColumnSelectionAllowed()) {
            Connection con = getConnection();
            String sql = "Update ToDoList set durum='Yapılmadı' where id=" + dt.getValueAt(id, 0);
            Statement stm;

            try {
                stm = con.createStatement();
                stm.execute(sql);
            } catch (SQLException ex) {
                Logger.getLogger(ListJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if (a == "true") {
            Connection con = getConnection();
            String sql = "Update ToDoList set durum='Yapıldı' where id=" + dt.getValueAt(id, 0);
            Statement stm;

            try {
                stm = con.createStatement();
                stm.execute(sql);
            } catch (SQLException ex) {
                Logger.getLogger(ListJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            System.out.println(" Değer null geldi");

        }
    
    }//GEN-LAST:event_durum_btnActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Listele();
        
    }//GEN-LAST:event_formWindowOpened

    void Sil() {
        DefaultTableModel tblModel = (DefaultTableModel) table.getModel();
        tblModel.getDataVector().clear();
    }

    public String Listele(String sql) {

        
        
        //String a = String.valueOf();

        Connection con = getConnection();

         sql = "";

        try {
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            DefaultTableModel tblModel = (DefaultTableModel) table.getModel();
            while (rs.next()) {
                String id = String.valueOf(rs.getInt("id"));
                String baslik = rs.getString("baslik");
                String aciklama = rs.getString("aciklama");
                String tarih = rs.getString("tarih");
               
               
                Boolean drm=rs.getBoolean("durum");
                String durm= String.valueOf(drm);
                 System.out.println(durm);
                 
                 
                

                //String durumS="";
                //String durumS= String.valueOf(durum);
                Object tmoData[] = {id, baslik, aciklama, tarih, drm};

                tblModel.addRow(tmoData);

                id_txt.setText("");
                baslik_txt.setText("");
                aciklama_txta.setText("");
                return sql;
//                int i =table.getSelectedRow();
//                tblModel.removeRow(i);
            }

            rs.close();
            con.close();
        } catch (Exception e) {
            System.out.println("Listeleme Başarısız... HATA:" + e);
        }
        //table.removeColumn();

    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea aciklama_txta;
    private javax.swing.JComboBox<String> ay_cbox;
    private javax.swing.JTextField baslik_txt;
    private javax.swing.JButton durum_btn;
    private javax.swing.JComboBox<String> gun_cbox;
    private javax.swing.JTextField id_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton kaydet_txt;
    private javax.swing.JButton secili_olanli_sil_btn;
    private javax.swing.JTable table;
    private javax.swing.JButton tumunu_sil_btn;
    private javax.swing.JButton yapilmamis_görevler_btn;
    private javax.swing.JButton yapilmis_görevler_btn;
    private javax.swing.JComboBox<String> yil_cbox;
    // End of variables declaration//GEN-END:variables
}
