/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package formulir;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import perbankan.*;

/**
 *
 * @author bagas
 */
public class TellerForm extends javax.swing.JFrame {

    private DefaultTableModel model;

    private Bank bank;
    private LoginForm loginForm;
    private int selectedRow;
    private int jumlahNasabah;

    /**
     * Creates new form TesTugasForm
     * @param loginForm
     * @param bank
     */
    public TellerForm(LoginForm loginForm, Bank bank) {

        initComponents();
        this.loginForm = loginForm;
        this.bank = bank;
        this.jumlahNasabah = bank.getJumlahNasabah();
        model = (DefaultTableModel) jTable1.getModel();
        
        if (jumlahNasabah != 0) {
            for (int i = 0; i < jumlahNasabah; i++) {
                model.addRow(new Object[]{
                    bank.getNasabah(i).getNamaAwal(),
                    bank.getNasabah(i).getNamaAkhir(),
                    "Rp" + bank.getNasabah(i).getTabungan().getSaldo()});
            }
            model.fireTableDataChanged();
        }

        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        inputNamaDepan = new javax.swing.JTextField();
        inputNamaBelakang = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnMenuSaldo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama Depan", "Nama Belakang", "Saldo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
        }

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.setEnabled(false);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.setEnabled(false);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        inputNamaDepan.setName(""); // NOI18N
        inputNamaDepan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNamaDepanActionPerformed(evt);
            }
        });

        inputNamaBelakang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNamaBelakangActionPerformed(evt);
            }
        });

        jLabel2.setText("Nama Depan");

        jLabel3.setText("Nama Belakang");

        btnMenuSaldo.setText("Menu Saldo");
        btnMenuSaldo.setEnabled(false);
        btnMenuSaldo.setPreferredSize(new java.awt.Dimension(75, 23));
        btnMenuSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuSaldoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("MesloLGM Nerd Font", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BANK");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(inputNamaBelakang)
                            .addComponent(inputNamaDepan, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMenuSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnClear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)))))
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputNamaDepan, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputNamaBelakang, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMenuSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputNamaDepanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNamaDepanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNamaDepanActionPerformed

    private void inputNamaBelakangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNamaBelakangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNamaBelakangActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        String namaDepan = inputNamaDepan.getText();
        String namaBelakang = inputNamaBelakang.getText();

        if (namaDepan.isEmpty() || namaBelakang.isEmpty()) {
            JOptionPane.showMessageDialog(
                    this,
                    "Nama Depan dan Nama Belakang harus diisi.",
                    "Kesalahan", JOptionPane.ERROR_MESSAGE);
        } else {
            bank.tambahNasabah(namaDepan, namaBelakang);
            bank.getNasabah(jumlahNasabah).setTabungan(new Tabungan(0));

            model.addRow(new Object[]{
                namaDepan,
                namaBelakang,
                "Rp" + bank.getNasabah(jumlahNasabah).getTabungan().getSaldo()});

            inputNamaDepan.setText("");
            inputNamaBelakang.setText("");

            model.fireTableDataChanged();
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

        this.selectedRow = jTable1.getSelectedRow();

        if (selectedRow != -1) {
            bank.getNasabah(selectedRow).setNamaAwal(inputNamaDepan.getText());
            bank.getNasabah(selectedRow).setNamaAkhir(inputNamaBelakang.getText());

            model.setValueAt(inputNamaDepan.getText(), selectedRow, 0);
            model.setValueAt(inputNamaBelakang.getText(), selectedRow, 1);

            model.fireTableDataChanged();
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        this.selectedRow = jTable1.getSelectedRow();

        if (selectedRow != -1) {
            bank.hapusNasabah(selectedRow);

            model.removeRow(selectedRow);

            inputNamaDepan.setText("");
            inputNamaBelakang.setText("");

            if (model.getRowCount() == 0) {
                btnUpdate.setEnabled(false);
                btnDelete.setEnabled(false);
                btnMenuSaldo.setEnabled(false);
            } else {
                btnUpdate.setEnabled(true);
                btnDelete.setEnabled(true);
                btnMenuSaldo.setEnabled(true);
            }

            model.fireTableDataChanged();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed

        inputNamaDepan.setText("");
        inputNamaBelakang.setText("");

        btnUpdate.setEnabled(false);
        btnDelete.setEnabled(false);
        btnMenuSaldo.setEnabled(false);
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnMenuSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuSaldoActionPerformed

        SaldoForm dialog = new SaldoForm(
                this,
                bank,
                selectedRow,
                bank.getNasabah(selectedRow).getNamaAwal(),
                bank.getNasabah(selectedRow).getNamaAkhir(),
                bank.getNasabah(selectedRow).getTabungan().getSaldo()
        );

        dialog.setVisible(true);
    }//GEN-LAST:event_btnMenuSaldoActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        loginForm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {

        this.selectedRow = jTable1.getSelectedRow();

        if (selectedRow != -1) {
            String namaDepan = (String) jTable1.getValueAt(selectedRow, 0);
            String namaBelakang = (String) jTable1.getValueAt(selectedRow, 1);
            inputNamaDepan.setText(namaDepan);
            inputNamaBelakang.setText(namaBelakang);

            btnUpdate.setEnabled(true);
            btnDelete.setEnabled(true);
            btnMenuSaldo.setEnabled(true);
        } else {
            btnUpdate.setEnabled(false);
            btnDelete.setEnabled(false);
            btnMenuSaldo.setEnabled(false);
        }
    }

    public void updateSaldoInTable(int row, int newSaldo) {
        jTable1.setValueAt("Rp" + newSaldo, row, 2);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnMenuSaldo;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JTextField inputNamaBelakang;
    private javax.swing.JTextField inputNamaDepan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
