package posttest;

public class Frame extends javax.swing.JFrame {
    
    public String jFrameSekarang;

    public Frame(String jFrameSekarang) {
        initComponents();
        this.jFrameSekarang = jFrameSekarang;
        setFrameNumber("None");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnFrameSatu = new javax.swing.JButton();
        btnFrameDua = new javax.swing.JButton();
        btnFrameTiga = new javax.swing.JButton();
        btnFrameEmpat = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtFrameSebelum = new javax.swing.JTextField();
        txtFrameSekarang = new javax.swing.JTextField();
        txtTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        btnFrameSatu.setText("Kalkulator Lingkaran");
        btnFrameSatu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFrameSatuActionPerformed(evt);
            }
        });

        btnFrameDua.setText("Kalkulator Persegi");
        btnFrameDua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFrameDuaActionPerformed(evt);
            }
        });

        btnFrameTiga.setText("Konversi Suhu");
        btnFrameTiga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFrameTigaActionPerformed(evt);
            }
        });

        btnFrameEmpat.setText("Konversi Mata Uang");
        btnFrameEmpat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFrameEmpatActionPerformed(evt);
            }
        });

        jLabel1.setText("jFrame Sebelumnya");

        jLabel2.setText("jFrame Sekarang");

        txtFrameSebelum.setEditable(false);
        txtFrameSebelum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFrameSebelumActionPerformed(evt);
            }
        });

        txtFrameSekarang.setEditable(false);

        txtTitle.setText("Frame");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnFrameSatu, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(btnFrameDua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnFrameEmpat, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(btnFrameTiga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(35, 35, 35)
                                .addComponent(txtFrameSekarang))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtFrameSebelum, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(txtTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtFrameSebelum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFrameSekarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 200, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnFrameSatu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnFrameDua))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnFrameTiga)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnFrameEmpat)))
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void btnFrameSatuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFrameSatuActionPerformed
        changeFrame(new KalkulatorLingkaran());
    }//GEN-LAST:event_btnFrameSatuActionPerformed

    public void btnFrameDuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFrameDuaActionPerformed
        changeFrame(new KalkulatorPersegi());
    }//GEN-LAST:event_btnFrameDuaActionPerformed

    public void btnFrameTigaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFrameTigaActionPerformed
        changeFrame(new KonversiSuhu());
    }//GEN-LAST:event_btnFrameTigaActionPerformed

    public void btnFrameEmpatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFrameEmpatActionPerformed
        changeFrame(new KonversiMataUang());
    }//GEN-LAST:event_btnFrameEmpatActionPerformed

    private void txtFrameSebelumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFrameSebelumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFrameSebelumActionPerformed

    public void setFrameNumber(String jFrameSebelum) {
        txtFrameSebelum.setText(jFrameSebelum);
        txtFrameSekarang.setText(jFrameSekarang);
    }
    
    public void setTitleName() {
        txtTitle.setText(this.getClass().getSimpleName());
    }

    public void changeFrame(Frame newFrame) {
        this.dispose();
        newFrame.setFrameNumber(jFrameSekarang);
        newFrame.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnFrameDua;
    public javax.swing.JButton btnFrameEmpat;
    public javax.swing.JButton btnFrameSatu;
    public javax.swing.JButton btnFrameTiga;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtFrameSebelum;
    private javax.swing.JTextField txtFrameSekarang;
    public javax.swing.JLabel txtTitle;
    // End of variables declaration//GEN-END:variables
}
