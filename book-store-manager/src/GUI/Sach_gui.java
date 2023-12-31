/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package GUI;

import DAO.SQLServerDataProvider;
import DAO.Sach_dao;
import DAO.TacGia_dao;
import DAO.TheLoai_dao;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import POJO.Sach_pojo;
import GUI.main_gui;
import POJO.MyCombobox;
import POJO.TacGia_pojo;
import POJO.TheLoai_pojo;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author ThinhDN
 */
public class Sach_gui extends javax.swing.JInternalFrame {

    /**
     * Creates new form Sach
     */
    DefaultComboBoxModel tl;
    DefaultComboBoxModel tg;
    DefaultTableModel dtmS = new DefaultTableModel();

    public Sach_gui() {
        this.setTitle("Sách");
        initComponents();
        this.setSize(1920, 1030);
        String[] tieuDeS = {"Mã sách", "Tên sách", "Đơn giá", "Số lượng còn", "Mã TG", "Mã TL"};
        dtmS.setColumnIdentifiers(tieuDeS);
        loadTacGia();
        loadTheLoai();
        hienthiS();
        btnLuu.setEnabled(false);
        txtTacgia.setEnabled(false);
        txtTheLoai.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtMaS = new javax.swing.JTextField();
        txtTenS = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtGia = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtSL = new javax.swing.JSpinner();
        cboTacGia = new javax.swing.JComboBox<>();
        cboTheLoai = new javax.swing.JComboBox<>();
        txtTheLoai = new javax.swing.JTextField();
        txtTacgia = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnLuu = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnTG = new javax.swing.JButton();
        btnTL = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbS = new javax.swing.JTable();

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 0));
        jLabel2.setText("NHẬP KHO");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "THÔNG TIN SÁCH", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 20))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setText("Mã sách");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("Tên sách");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setText("Thể loại");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setText("Tác giả");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel7.setText("Giá");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel8.setText("Số lượng còn");

        txtSL.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        cboTacGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTacGiaActionPerformed(evt);
            }
        });

        cboTheLoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTheLoaiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSL, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(266, 266, 266)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtMaS))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(cboTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(txtTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)))
                        .addGap(8, 8, 8)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTenS, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cboTacGia, 0, 249, Short.MAX_VALUE)
                            .addComponent(txtGia))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTacgia, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMaS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtTenS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(cboTacGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cboTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTacgia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(txtSL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        btnLuu.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnLuu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/luu.png"))); // NOI18N
        btnLuu.setText("Lưu");
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });

        btnThem.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/them.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/xoa.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnTG.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnTG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/tacgia.jpg"))); // NOI18N
        btnTG.setText("Tác giả");
        btnTG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTGActionPerformed(evt);
            }
        });

        btnTL.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnTL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/theloai.jpg"))); // NOI18N
        btnTL.setText("Thể loại");
        btnTL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTLActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(btnThem)
                .addGap(18, 18, 18)
                .addComponent(btnLuu)
                .addGap(18, 18, 18)
                .addComponent(btnXoa)
                .addGap(323, 323, 323)
                .addComponent(btnTG)
                .addGap(18, 18, 18)
                .addComponent(btnTL)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnLuu)
                    .addComponent(btnXoa)
                    .addComponent(btnTG)
                    .addComponent(btnTL))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1527, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 234, Short.MAX_VALUE)
        );

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/nhapkho.png"))); // NOI18N

        tbS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbSMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbS);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(880, 880, 880)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(312, 312, 312)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(367, 367, 367))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1882, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                        .addGap(2, 2, 2)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(234, 234, 234))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTGActionPerformed
        // TODO add your handling code here:
        TacGia_gui f = new TacGia_gui();
        f.setVisible(true);
    }//GEN-LAST:event_btnTGActionPerformed

    private void btnTLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTLActionPerformed
        // TODO add your handling code here:
        TheLoai_gui f = new TheLoai_gui();
        f.setVisible(true);
    }//GEN-LAST:event_btnTLActionPerformed

    private void tbSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbSMouseClicked
        // TODO add your handling code here:
        int row = tbS.getSelectedRow();
        txtMaS.setText((String) String.valueOf(tbS.getValueAt(row, 0)));
        txtTenS.setText((String) String.valueOf(tbS.getValueAt(row, 1)));
        txtGia.setText((String) String.valueOf(tbS.getValueAt(row, 2)));
        //txtSL.setValue((String) String.valueOf(tbS.getValueAt(row, 3)));
        txtTacgia.setText((String) String.valueOf(tbS.getValueAt(row, 4)));
        txtTheLoai.setText((String) String.valueOf(tbS.getValueAt(row, 5)));
    }//GEN-LAST:event_tbSMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        txtMaS.setText("");
        txtTenS.setText("");
        txtGia.setText("");
        txtMaS.requestFocus();
        btnLuu.setEnabled(true);
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        // TODO add your handling code here:
        try {
            String maS = txtMaS.getText();
            String tenS = txtTenS.getText();
            String TheLoai = txtTheLoai.getText();
            String TacGia = txtTacgia.getText();
            String SoLuong = txtSL.getValue().toString();
            String DonGia = txtGia.getText();
            Sach_pojo s = new Sach_pojo();
            s.setMaS(maS);
            s.setTenS(tenS);
            s.setMaTL(TheLoai);
            s.setMaTG(TacGia);
            s.setSlCon(SoLuong);
            s.setDonGia(DonGia);
            if (txtMaS.getText().isEmpty() || txtTenS.getText().isEmpty() || txtGia.getText().isEmpty()) {
                txtMaS.requestFocus();
                JOptionPane.showMessageDialog(this, "Không Được Để Trống Thông Tin", "Thông Báo", JOptionPane.INFORMATION_MESSAGE);
            } else if (isChar(txtTenS.getText())) {
                JOptionPane.showMessageDialog(this, " Tên Sách Không được nhập số ", "Thông Báo", JOptionPane.INFORMATION_MESSAGE);
            } else if (isNumeric(txtSL.getValue().toString())) {
                JOptionPane.showMessageDialog(this, " Số lượng Không được nhập chữ ", "Thông Báo", JOptionPane.INFORMATION_MESSAGE);
            } else if (isNumeric(txtGia.getText())) {
                JOptionPane.showMessageDialog(this, " Giá Không được nhập chữ ", "Thông Báo", JOptionPane.INFORMATION_MESSAGE);
            } else if (Sach_dao.ktraMaS(maS) == true) {
                try {
                    Sach_dao.capNhatSach(s);
                    JOptionPane.showMessageDialog(this, "Cập Nhật Thành Công", "Thông Báo", JOptionPane.INFORMATION_MESSAGE);
                    hienthiS();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Cập Nhật Không Thành Công", "Thông Báo", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                try {
                    Sach_dao.themSach(s);
                    hienthiS();
                    JOptionPane.showMessageDialog(this, "Thêm Nhân Viên Thành Công", "Thông Báo", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Thêm Nhân Viên Không Thành Công", "Thông Báo", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Liên Hệ Nhóm 1 Để Biết Thông Tin Chi Tiết", "Thông Báo", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnLuuActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        try {
            int row = tbS.getSelectedRow();
            if (row == -1) {
                JOptionPane.showMessageDialog(this, "Chọn Dòng Cần Xóa ");
                return;
            } else {
                int n = JOptionPane.showConfirmDialog(this,"Chắc Xóa Chưa" , "Thông Báo", JOptionPane.YES_NO_OPTION);
                if (n == JOptionPane.NO_OPTION) {
                    return;
                } else {
                    String ma = (String) tbS.getValueAt(row, 0);
                    Sach_dao.xoaSach(ma);
                    hienthiS();
                    JOptionPane.showMessageDialog(this, "Xoá Thành Công", "Thông Báo", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            hienthiS();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Liên Hệ Nhóm 1 Để Biết Thông Tin Chi Tiết", "Thông Báo", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void cboTheLoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTheLoaiActionPerformed
        // TODO add your handling code here:
        MyCombobox chon = (MyCombobox) tl.getSelectedItem();
        String maTL = chon.MaString();
        txtTheLoai.setText(maTL);
    }//GEN-LAST:event_cboTheLoaiActionPerformed

    private void cboTacGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTacGiaActionPerformed
        // TODO add your handling code here:
        MyCombobox chon = (MyCombobox) tg.getSelectedItem();
        String maTG = chon.MaString();
        txtTacgia.setText(maTG);
    }//GEN-LAST:event_cboTacGiaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnTG;
    private javax.swing.JButton btnTL;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cboTacGia;
    private javax.swing.JComboBox<String> cboTheLoai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable tbS;
    private javax.swing.JTextField txtGia;
    private javax.swing.JTextField txtMaS;
    private javax.swing.JSpinner txtSL;
    private javax.swing.JTextField txtTacgia;
    private javax.swing.JTextField txtTenS;
    private javax.swing.JTextField txtTheLoai;
    // End of variables declaration//GEN-END:variables

    private void loadTheLoai() {
        tl = (DefaultComboBoxModel) cboTheLoai.getModel();
        ArrayList<TheLoai_pojo> dsKH = TheLoai_dao.layDanhSachTheLoai();
        for (TheLoai_pojo pb : dsKH) {
            MyCombobox v = new MyCombobox(pb.getMaTL(), pb.getTenTL());
            tl.addElement(v);
        }
    }

    private void loadTacGia() {
        tg = (DefaultComboBoxModel) cboTacGia.getModel();
        ArrayList<TacGia_pojo> ds = TacGia_dao.layDanhSachTacGia();
        tg.removeAllElements();
        for (TacGia_pojo pb : ds) {
            MyCombobox v = new MyCombobox(pb.getMaTG(), pb.getTenTG());
            tg.addElement(v);
        }
    }

    private void hienthiS() {
        ArrayList<Sach_pojo> dsS = Sach_dao.layDanhSachSach();
        dtmS.setRowCount(0);
        for (Sach_pojo pb : dsS) {
            Vector<Object> v = new Vector<Object>();
            v.add(pb.getMaS());
            v.add(pb.getTenS());
            v.add(pb.getDonGia());
            v.add(pb.getSlCon());
            v.add(pb.getMaTG());
            v.add(pb.getMaTL());
            dtmS.addRow(v);
        }
        tbS.setModel(dtmS);
    }

    public static boolean isNumeric(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public static boolean isChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                return false;
            } else {
                return true;
            }
        }
        return true;
    }
}
