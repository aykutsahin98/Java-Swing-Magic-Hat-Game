
public class sihirliSapka_Oyun extends javax.swing.JFrame {

    public sihirliSapka_Oyun() {
        initComponents();
       panel_oyun_alani.setVisible(false);
       buton_yenioyun.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_oyuncu_bilgileri = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        buton_basla = new javax.swing.JButton();
        textfield_isim = new javax.swing.JTextField();
        panel_oyun_alani = new javax.swing.JPanel();
        buton_s1 = new javax.swing.JButton();
        buton_s2 = new javax.swing.JButton();
        label_durum = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        buton_s3 = new javax.swing.JButton();
        buton_yeniden_dene = new javax.swing.JButton();
        label_oyuncuadi = new javax.swing.JLabel();
        label_skor_oyuncu = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        buton_yenioyun = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_oyuncu_bilgileri.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Oyuncu Bilgileri", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cambria", 1, 14), new java.awt.Color(204, 0, 0))); // NOI18N

        jLabel6.setText("Adınızı Girin");

        buton_basla.setText("BAŞLA");
        buton_basla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buton_baslaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_oyuncu_bilgileriLayout = new javax.swing.GroupLayout(panel_oyuncu_bilgileri);
        panel_oyuncu_bilgileri.setLayout(panel_oyuncu_bilgileriLayout);
        panel_oyuncu_bilgileriLayout.setHorizontalGroup(
            panel_oyuncu_bilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_oyuncu_bilgileriLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_oyuncu_bilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_oyuncu_bilgileriLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textfield_isim, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(buton_basla, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        panel_oyuncu_bilgileriLayout.setVerticalGroup(
            panel_oyuncu_bilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_oyuncu_bilgileriLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_oyuncu_bilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(textfield_isim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buton_basla))
        );

        panel_oyun_alani.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Kırmızı Top Hangi Şapkada? Tahmin Et!", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cambria", 1, 14), new java.awt.Color(153, 0, 153))); // NOI18N

        buton_s1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/kapali.png"))); // NOI18N
        buton_s1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buton_s1ActionPerformed(evt);
            }
        });

        buton_s2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/kapali.png"))); // NOI18N
        buton_s2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buton_s2ActionPerformed(evt);
            }
        });

        label_durum.setFont(new java.awt.Font("Cambria", 3, 18)); // NOI18N
        label_durum.setText("Bilgisayar Kazandı");

        jLabel3.setFont(new java.awt.Font("Cambria", 3, 18)); // NOI18N
        jLabel3.setText("DURUM: ");

        buton_s3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/kapali.png"))); // NOI18N
        buton_s3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buton_s3ActionPerformed(evt);
            }
        });

        buton_yeniden_dene.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        buton_yeniden_dene.setForeground(new java.awt.Color(255, 102, 0));
        buton_yeniden_dene.setText("YENİDEN DENE");
        buton_yeniden_dene.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buton_yeniden_deneActionPerformed(evt);
            }
        });

        label_oyuncuadi.setText("Oyuncu:");

        label_skor_oyuncu.setText("0");

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel1.setText("SKOR");

        javax.swing.GroupLayout panel_oyun_alaniLayout = new javax.swing.GroupLayout(panel_oyun_alani);
        panel_oyun_alani.setLayout(panel_oyun_alaniLayout);
        panel_oyun_alaniLayout.setHorizontalGroup(
            panel_oyun_alaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_oyun_alaniLayout.createSequentialGroup()
                .addGroup(panel_oyun_alaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_oyun_alaniLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label_durum)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panel_oyun_alaniLayout.createSequentialGroup()
                        .addComponent(buton_s1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buton_s2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buton_s3, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(panel_oyun_alaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buton_yeniden_dene, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panel_oyun_alaniLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(label_oyuncuadi, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_oyun_alaniLayout.createSequentialGroup()
                                .addGroup(panel_oyun_alaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_skor_oyuncu, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        panel_oyun_alaniLayout.setVerticalGroup(
            panel_oyun_alaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_oyun_alaniLayout.createSequentialGroup()
                .addGroup(panel_oyun_alaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_oyun_alaniLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel_oyun_alaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buton_s1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buton_s2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buton_s3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel_oyun_alaniLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label_oyuncuadi)
                        .addGap(12, 12, 12)
                        .addComponent(label_skor_oyuncu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buton_yeniden_dene, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panel_oyun_alaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(label_durum))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        buton_yenioyun.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        buton_yenioyun.setForeground(new java.awt.Color(0, 153, 0));
        buton_yenioyun.setText("YENİ OYUNCU");
        buton_yenioyun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buton_yenioyunActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_oyun_alani, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panel_oyuncu_bilgileri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buton_yenioyun, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panel_oyuncu_bilgileri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(buton_yenioyun, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(panel_oyun_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    int nerede=0;
    int  say=0;
    int puan=100;
    String ad="";
    private void buton_baslaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buton_baslaActionPerformed
     nerede=(int)(Math.random()*3+1);
     say=0;
     label_skor_oyuncu.setText(String.valueOf(puan));
     label_durum.setText("hadi dene bakalım ");
     ad=textfield_isim.getText();
     label_oyuncuadi.setText(ad);
     //1 ise buton1 de      // 2 ise buton2 de       // 3 ise buton 3 de 
     buton_s1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/kapali.png")));
     buton_s2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/kapali.png")));
     buton_s3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/kapali.png")));
     textfield_isim.setEnabled(false);
     buton_basla.setEnabled(false);
     panel_oyun_alani.setVisible(true);
     buton_yenioyun.setVisible(true);
     
    }//GEN-LAST:event_buton_baslaActionPerformed
public void kontrol()
{
   if(say==1) {puan+=150;
         label_durum.setText("tebrikler ilk seferde buldun +150 puan kazandın");
         }
          else if(say==2){
              puan+=50;
              label_durum.setText("tebrikler ikinci seferde buldun +50 puan kazandın");
          }
          else if(say==3){
              puan-=100;
              label_durum.setText("üzgünüm son seferde buldun -100 puan kaybettin");
          }
 label_skor_oyuncu.setText(String.valueOf(puan));
}
    private void buton_s1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buton_s1ActionPerformed
       say++;
       if(nerede==1)
     {
        buton_s1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dolu.png")));
       kontrol();
            
     }
     else 
     {
         buton_s1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bos.png")));
     }
     
    }//GEN-LAST:event_buton_s1ActionPerformed

    private void buton_s2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buton_s2ActionPerformed
       say++;
      if(nerede==2)
     {
        buton_s2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dolu.png")));
          kontrol();
     }
     else 
     {
         buton_s2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bos.png")));
     }
    
    }//GEN-LAST:event_buton_s2ActionPerformed

    private void buton_s3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buton_s3ActionPerformed
     say++;
     if(nerede==3)
     {
        buton_s3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dolu.png")));
         kontrol();
     }
     else 
     {buton_s3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bos.png")));
      }
    }//GEN-LAST:event_buton_s3ActionPerformed

    private void buton_yenioyunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buton_yenioyunActionPerformed
      textfield_isim.setEnabled(true);
     buton_basla.setEnabled(true);
     puan=100;
     say=0;
     panel_oyun_alani.setVisible(false);
    }//GEN-LAST:event_buton_yenioyunActionPerformed

    private void buton_yeniden_deneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buton_yeniden_deneActionPerformed
     nerede=(int)(Math.random()*3+1);
     say=0;
     label_skor_oyuncu.setText(String.valueOf(puan));
     label_durum.setText("hadi dene bakalım ");
     buton_s1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/kapali.png")));
     buton_s2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/kapali.png")));
     buton_s3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/kapali.png")));
   
    }//GEN-LAST:event_buton_yeniden_deneActionPerformed


    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sihirliSapka_Oyun().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buton_basla;
    private javax.swing.JButton buton_s1;
    private javax.swing.JButton buton_s2;
    private javax.swing.JButton buton_s3;
    private javax.swing.JButton buton_yeniden_dene;
    private javax.swing.JButton buton_yenioyun;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel label_durum;
    private javax.swing.JLabel label_oyuncuadi;
    private javax.swing.JLabel label_skor_oyuncu;
    private javax.swing.JPanel panel_oyun_alani;
    private javax.swing.JPanel panel_oyuncu_bilgileri;
    private javax.swing.JTextField textfield_isim;
    // End of variables declaration//GEN-END:variables
}
