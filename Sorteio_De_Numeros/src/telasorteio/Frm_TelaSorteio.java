/*
 * Classe de interface para inicio de aprendizado em Swing, implementando
* um programa de sorteio de números aleatorios
 */
package telasorteio;
import java.util.Random;

/**
 * Student information systems Brazil, MG
 *
 * @author Eduardo Almeida <edualmeida.a7@gmail.com>
 * @version 1.0
 * @since Octuber 01, 2019
 */
public class Frm_TelaSorteio extends javax.swing.JFrame {

        
    public Frm_TelaSorteio() {
        initComponents();
        lblTextoNumero.setVisible(false);
        lblNumSorteado.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_titulo = new javax.swing.JLabel();
        lbl_nminimo = new javax.swing.JLabel();
        lbl_nmaximo = new javax.swing.JLabel();
        txtNumMin = new javax.swing.JSpinner();
        txtNumMax = new javax.swing.JSpinner();
        btnSortear = new javax.swing.JButton();
        lblTextoNumero = new javax.swing.JLabel();
        lblNumSorteado = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sorteio Aleatorio");
        setBackground(new java.awt.Color(0, 153, 0));
        setResizable(false);

        lbl_titulo.setFont(new java.awt.Font("Yu Gothic UI", 1, 30)); // NOI18N
        lbl_titulo.setForeground(new java.awt.Color(0, 153, 0));
        lbl_titulo.setText("Sorteio de números");

        lbl_nminimo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_nminimo.setText("Número Mínimo");

        lbl_nmaximo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_nmaximo.setText("Número Máximo");

        txtNumMin.setModel(new javax.swing.SpinnerNumberModel());

        txtNumMax.setModel(new javax.swing.SpinnerNumberModel());

        btnSortear.setText("SORTEAR");
        btnSortear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortearActionPerformed(evt);
            }
        });

        lblTextoNumero.setFont(new java.awt.Font("Jedi Hollow", 1, 18)); // NOI18N
        lblTextoNumero.setText("Número:");

        lblNumSorteado.setFont(new java.awt.Font("Jedi Hollow", 1, 18)); // NOI18N
        lblNumSorteado.setText("0");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Trevo 2.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lbl_nminimo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_nmaximo))
                        .addComponent(lbl_titulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(txtNumMin, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lblTextoNumero)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(txtNumMax, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(115, 115, 115)
                                .addComponent(lblNumSorteado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(btnSortear)))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_titulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_nminimo, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_nmaximo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNumMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addComponent(btnSortear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTextoNumero)
                            .addComponent(lblNumSorteado))))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings("empty-statement")
    private void btnSortearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortearActionPerformed

        int nMaximo = Integer.parseInt(txtNumMax.getValue().toString()),
                nMinimo = Integer.parseInt(txtNumMin.getValue().toString());

        //METODO 1
        Random random = new Random();
        lblNumSorteado.setText(Integer.toString(random.nextInt((nMaximo - nMinimo) + 1) + nMinimo));

        lblTextoNumero.setVisible(true);
        lblNumSorteado.setVisible(true);
    }//GEN-LAST:event_btnSortearActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
                try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frm_TelaSorteio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_TelaSorteio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_TelaSorteio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_TelaSorteio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_TelaSorteio().setVisible(true);
            }
        });
    }

    private javax.swing.JButton btnSortear;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblNumSorteado;
    private javax.swing.JLabel lblTextoNumero;
    private javax.swing.JLabel lbl_nmaximo;
    private javax.swing.JLabel lbl_nminimo;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JSpinner txtNumMax;
    private javax.swing.JSpinner txtNumMin;
}
