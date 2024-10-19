package posttest;

public class KonversiSuhu extends Frame implements KonversiBilangan {

    public int satuanAwal;
    public int satuanAkhir;

    public KonversiSuhu() {
        super("Konversi Suhu");
        initComponents();
        btnFrameTiga.setEnabled(false);
        setTitleName();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        inputSuhu = new javax.swing.JTextField();
        btnCelcius = new javax.swing.JButton();
        btnFahrenheit = new javax.swing.JButton();
        btnReamur = new javax.swing.JButton();
        btnKelvin = new javax.swing.JButton();
        txtSuhu = new javax.swing.JTextField();
        btnCelcius2 = new javax.swing.JButton();
        btnFahrenheit2 = new javax.swing.JButton();
        btnReamur2 = new javax.swing.JButton();
        btnKelvin2 = new javax.swing.JButton();
        btnKonversi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Suhu Awal");

        jLabel2.setText("Suhu Konversi");

        btnCelcius.setText("C");
        btnCelcius.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCelciusActionPerformed(evt);
            }
        });

        btnFahrenheit.setText("F");
        btnFahrenheit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFahrenheitActionPerformed(evt);
            }
        });

        btnReamur.setText("R");
        btnReamur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReamurActionPerformed(evt);
            }
        });

        btnKelvin.setText("K");
        btnKelvin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKelvinActionPerformed(evt);
            }
        });

        btnCelcius2.setText("C");
        btnCelcius2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCelcius2ActionPerformed(evt);
            }
        });

        btnFahrenheit2.setText("F");
        btnFahrenheit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFahrenheit2ActionPerformed(evt);
            }
        });

        btnReamur2.setText("R");
        btnReamur2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReamur2ActionPerformed(evt);
            }
        });

        btnKelvin2.setText("K");
        btnKelvin2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKelvin2ActionPerformed(evt);
            }
        });

        btnKonversi.setText("Konversi");
        btnKonversi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKonversiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnKonversi)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCelcius2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnFahrenheit2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnReamur2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnKelvin2))
                            .addComponent(txtSuhu, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCelcius)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnFahrenheit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnReamur)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnKelvin))
                            .addComponent(inputSuhu, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(51, 51, 51))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(inputSuhu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCelcius)
                    .addComponent(btnFahrenheit)
                    .addComponent(btnReamur)
                    .addComponent(btnKelvin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSuhu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCelcius2)
                    .addComponent(btnFahrenheit2)
                    .addComponent(btnReamur2)
                    .addComponent(btnKelvin2))
                .addGap(18, 18, 18)
                .addComponent(btnKonversi)
                .addContainerGap(141, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCelciusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCelciusActionPerformed
        satuanAwal = 1;
//        btnCelcius.setEnabled(false);
//        btnCelcius2.setEnabled(false);
    }//GEN-LAST:event_btnCelciusActionPerformed

    private void btnFahrenheitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFahrenheitActionPerformed
        satuanAwal = 2;
//        btnFahrenheit.setEnabled(false);
//        btnFahrenheit2.setEnabled(false);
    }//GEN-LAST:event_btnFahrenheitActionPerformed

    private void btnReamurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReamurActionPerformed
        satuanAwal = 3;
//        btnReamur.setEnabled(false);
//        btnReamur2.setEnabled(false);
    }//GEN-LAST:event_btnReamurActionPerformed

    private void btnKelvinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKelvinActionPerformed
        satuanAwal = 4;
//        btnKelvin.setEnabled(false);
//        btnKelvin2.setEnabled(false);
    }//GEN-LAST:event_btnKelvinActionPerformed

    private void btnCelcius2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCelcius2ActionPerformed
        satuanAkhir = 1;
//        btnCelcius.setEnabled(false);
//        btnCelcius2.setEnabled(false);
    }//GEN-LAST:event_btnCelcius2ActionPerformed

    private void btnFahrenheit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFahrenheit2ActionPerformed
        satuanAkhir = 2;
//        btnFahrenheit.setEnabled(false);
//        btnFahrenheit2.setEnabled(false);
    }//GEN-LAST:event_btnFahrenheit2ActionPerformed

    private void btnReamur2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReamur2ActionPerformed
        satuanAkhir = 3;
//        btnReamur.setEnabled(false);
//        btnReamur2.setEnabled(false);
    }//GEN-LAST:event_btnReamur2ActionPerformed

    private void btnKelvin2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKelvin2ActionPerformed
        satuanAkhir = 4;
//        btnKelvin.setEnabled(false);
//        btnKelvin2.setEnabled(false);
    }//GEN-LAST:event_btnKelvin2ActionPerformed

    private void btnKonversiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKonversiActionPerformed
        txtSuhu.setText("" + konversi(satuanAwal, satuanAkhir));
    }//GEN-LAST:event_btnKonversiActionPerformed

    @Override
    public void setTitleName() {
        txtTitle.setText("Konversi Suhu");
    }

    @Override
    public double konversi(int satuanAwal, int satuanAkhir) {
        double suhuAwal = Double.parseDouble(inputSuhu.getText());
        double suhuAkhir = 0.0;

        switch (satuanAwal) {
            case 1: // Celsius
                switch (satuanAkhir) {
                    case 1: // Celsius to Celsius
                        suhuAkhir = suhuAwal;
                        break;
                    case 2: // Celsius to Fahrenheit
                        suhuAkhir = (suhuAwal * 9 / 5) + 32;
                        break;
                    case 3: // Celsius to Reamur
                        suhuAkhir = suhuAwal * 4 / 5;
                        break;
                    case 4: // Celsius to Kelvin
                        suhuAkhir = suhuAwal + 273.15;
                        break;
                }
                break;
            case 2: // Fahrenheit
                switch (satuanAkhir) {
                    case 1: // Fahrenheit to Celsius
                        suhuAkhir = (suhuAwal - 32) * 5 / 9;
                        break;
                    case 2: // Fahrenheit to Fahrenheit
                        suhuAkhir = suhuAwal;
                        break;
                    case 3: // Fahrenheit to Reamur
                        suhuAkhir = (suhuAwal - 32) * 4 / 9;
                        break;
                    case 4: // Fahrenheit to Kelvin
                        suhuAkhir = (suhuAwal - 32) * 5 / 9 + 273.15;
                        break;
                }
                break;
            case 3: // Reamur
                switch (satuanAkhir) {
                    case 1: // Reamur to Celsius
                        suhuAkhir = suhuAwal * 5 / 4;
                        break;
                    case 2: // Reamur to Fahrenheit
                        suhuAkhir = (suhuAwal * 9 / 4) + 32;
                        break;
                    case 3: // Reamur to Reamur
                        suhuAkhir = suhuAwal;
                        break;
                    case 4: // Reamur to Kelvin
                        suhuAkhir = suhuAwal * 5 / 4 + 273.15;
                        break;
                }
                break;
            case 4: // Kelvin
                switch (satuanAkhir) {
                    case 1: // Kelvin to Celsius
                        suhuAkhir = suhuAwal - 273.15;
                        break;
                    case 2: // Kelvin to Fahrenheit
                        suhuAkhir = (suhuAwal - 273.15) * 9 / 5 + 32;
                        break;
                    case 3: // Kelvin to Reamur
                        suhuAkhir = (suhuAwal - 273.15) * 4 / 5;
                        break;
                    case 4: // Kelvin to Kelvin
                        suhuAkhir = suhuAwal;
                        break;
                }
                break;
            default:
                throw new AssertionError();
        }
        return suhuAkhir;
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KonversiSuhu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCelcius;
    private javax.swing.JButton btnCelcius2;
    private javax.swing.JButton btnFahrenheit;
    private javax.swing.JButton btnFahrenheit2;
    private javax.swing.JButton btnKelvin;
    private javax.swing.JButton btnKelvin2;
    private javax.swing.JButton btnKonversi;
    private javax.swing.JButton btnReamur;
    private javax.swing.JButton btnReamur2;
    private javax.swing.JTextField inputSuhu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtSuhu;
    // End of variables declaration//GEN-END:variables
}
