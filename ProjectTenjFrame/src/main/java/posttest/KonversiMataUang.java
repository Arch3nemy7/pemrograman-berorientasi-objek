package posttest;

public class KonversiMataUang extends Frame implements KonversiBilangan {

    public int satuanAwal;
    public int satuanAkhir;

    public KonversiMataUang() {
        super("Konversi Mata Uang");
        initComponents();
        btnFrameEmpat.setEnabled(false);
        setTitleName();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUang = new javax.swing.JTextField();
        btnRupiah2 = new javax.swing.JButton();
        btnDollar2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnEuro2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnYuan2 = new javax.swing.JButton();
        inputUang = new javax.swing.JTextField();
        btnKonversi = new javax.swing.JButton();
        btnRupiah = new javax.swing.JButton();
        btnDollar = new javax.swing.JButton();
        btnEuro = new javax.swing.JButton();
        btnYuan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(480, 380));

        btnRupiah2.setText("Rp");
        btnRupiah2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRupiah2ActionPerformed(evt);
            }
        });

        btnDollar2.setText("$");
        btnDollar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDollar2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Uang Awal");

        btnEuro2.setText("€");
        btnEuro2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEuro2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Uang Konversi");

        btnYuan2.setText("¥");
        btnYuan2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYuan2ActionPerformed(evt);
            }
        });

        btnKonversi.setText("Konversi");
        btnKonversi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKonversiActionPerformed(evt);
            }
        });

        btnRupiah.setText("Rp");
        btnRupiah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRupiahActionPerformed(evt);
            }
        });

        btnDollar.setText("$");
        btnDollar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDollarActionPerformed(evt);
            }
        });

        btnEuro.setText("€");
        btnEuro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEuroActionPerformed(evt);
            }
        });

        btnYuan.setText("¥");
        btnYuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYuanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnKonversi)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnRupiah2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDollar2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEuro2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnYuan2))
                            .addComponent(txtUang, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnRupiah)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDollar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEuro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnYuan))
                            .addComponent(inputUang, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(inputUang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRupiah)
                    .addComponent(btnDollar)
                    .addComponent(btnEuro)
                    .addComponent(btnYuan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRupiah2)
                    .addComponent(btnDollar2)
                    .addComponent(btnEuro2)
                    .addComponent(btnYuan2))
                .addGap(18, 18, 18)
                .addComponent(btnKonversi)
                .addContainerGap(148, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRupiah2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRupiah2ActionPerformed
        satuanAkhir = 1;
        //        btnCelcius.setEnabled(false);
        //        btnCelcius2.setEnabled(false);
    }//GEN-LAST:event_btnRupiah2ActionPerformed

    private void btnDollar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDollar2ActionPerformed
        satuanAkhir = 2;
        //        btnFahrenheit.setEnabled(false);
        //        btnFahrenheit2.setEnabled(false);
    }//GEN-LAST:event_btnDollar2ActionPerformed

    private void btnEuro2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEuro2ActionPerformed
        satuanAkhir = 3;
        //        btnReamur.setEnabled(false);
        //        btnReamur2.setEnabled(false);
    }//GEN-LAST:event_btnEuro2ActionPerformed

    private void btnYuan2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYuan2ActionPerformed
        satuanAkhir = 4;
        //        btnKelvin.setEnabled(false);
        //        btnKelvin2.setEnabled(false);
    }//GEN-LAST:event_btnYuan2ActionPerformed

    private void btnKonversiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKonversiActionPerformed
        txtUang.setText("" + konversi(satuanAwal, satuanAkhir));
    }//GEN-LAST:event_btnKonversiActionPerformed

    private void btnRupiahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRupiahActionPerformed
        satuanAwal = 1;
        //        btnCelcius.setEnabled(false);
        //        btnCelcius2.setEnabled(false);
    }//GEN-LAST:event_btnRupiahActionPerformed

    private void btnDollarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDollarActionPerformed
        satuanAwal = 2;
        //        btnFahrenheit.setEnabled(false);
        //        btnFahrenheit2.setEnabled(false);
    }//GEN-LAST:event_btnDollarActionPerformed

    private void btnEuroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEuroActionPerformed
        satuanAwal = 3;
        //        btnReamur.setEnabled(false);
        //        btnReamur2.setEnabled(false);
    }//GEN-LAST:event_btnEuroActionPerformed

    private void btnYuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYuanActionPerformed
        satuanAwal = 4;
        //        btnKelvin.setEnabled(false);
        //        btnKelvin2.setEnabled(false);
    }//GEN-LAST:event_btnYuanActionPerformed

    @Override
    public void setTitleName() {
        txtTitle.setText("Konversi Mata Uang");
    }

    @Override
    public double konversi(int satuanAwal, int satuanAkhir) {
        double uangAwal = Double.parseDouble(inputUang.getText());
        double uangAkhir = 0.0;

        switch (satuanAwal) {
            case 1: // Rupiah
                switch (satuanAkhir) {
                    case 1: // Rupiah to Rupiah
                        uangAkhir = uangAwal;
                        break;
                    case 2: // Rupiah to Dollar
                        uangAkhir = uangAwal / 15000;
                        break;
                    case 3: // Rupiah to Euro
                        uangAkhir = uangAwal / 16500;
                        break;
                    case 4: // Rupiah to Yuan
                        uangAkhir = uangAwal / 2000;
                        break;
                }
                break;
            case 2: // Dollar
                switch (satuanAkhir) {
                    case 1: // Dollar to Rupiah
                        uangAkhir = uangAwal * 15000;
                        break;
                    case 2: // Dollar to Dollar
                        uangAkhir = uangAwal;
                        break;
                    case 3: // Dollar to Euro
                        uangAkhir = uangAwal * 0.94;
                        break;
                    case 4: // Dollar to Yuan
                        uangAkhir = uangAwal * 7.27;
                        break;
                }
                break;
            case 3: // Euro
                switch (satuanAkhir) {
                    case 1: // Euro to Rupiah
                        uangAkhir = uangAwal * 16500;
                        break;
                    case 2: // Euro to Dollar
                        uangAkhir = uangAwal / 0.94;
                        break;
                    case 3: // Euro to Euro
                        uangAkhir = uangAwal;
                        break;
                    case 4: // Euro to Yuan
                        uangAkhir = uangAwal * 7.67;
                        break;
                }
                break;
            case 4: // Yuan
                switch (satuanAkhir) {
                    case 1: // Yuan to Rupiah
                        uangAkhir = uangAwal * 2000;
                        break;
                    case 2: // Yuan to Dollar
                        uangAkhir = uangAwal / 7.27;
                        break;
                    case 3: // Yuan to Euro
                        uangAkhir = uangAwal / 7.67;
                        break;
                    case 4: // Yuan to Yuan
                        uangAkhir = uangAwal;
                        break;
                }
                break;
            default:
                throw new AssertionError();
        }

        return uangAkhir;
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KonversiMataUang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDollar;
    private javax.swing.JButton btnDollar2;
    private javax.swing.JButton btnEuro;
    private javax.swing.JButton btnEuro2;
    private javax.swing.JButton btnKonversi;
    private javax.swing.JButton btnRupiah;
    private javax.swing.JButton btnRupiah2;
    private javax.swing.JButton btnYuan;
    private javax.swing.JButton btnYuan2;
    private javax.swing.JTextField inputUang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtUang;
    // End of variables declaration//GEN-END:variables
}
