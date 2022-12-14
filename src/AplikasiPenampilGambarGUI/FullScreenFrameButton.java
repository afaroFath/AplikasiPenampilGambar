package AplikasiPenampilGambarGUI;



import java.awt.CardLayout;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;


public class FullScreenFrameButton extends javax.swing.JFrame {

    /**
     * Creates new form FullScreenFrameButton
     */
    public FullScreenFrameButton() {
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

        ButtonPanel = new javax.swing.JPanel();
        JavaEE6BTN = new javax.swing.JButton();
        JavaScriptBTN = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        ImagePanel = new javax.swing.JPanel();
        JavaEE6LB = new javax.swing.JLabel();
        JavaScriptLB = new javax.swing.JLabel();
        BidayatulHidayahLB = new javax.swing.JLabel();
        InsectCrisisLB = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        ButtonPanel.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        JavaEE6BTN.setText("JAVAEE 6");
        JavaEE6BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JavaEE6BTNActionPerformed(evt);
            }
        });
        ButtonPanel.add(JavaEE6BTN);

        JavaScriptBTN.setText("Java Script");
        JavaScriptBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JavaScriptBTNActionPerformed(evt);
            }
        });
        ButtonPanel.add(JavaScriptBTN);

        jButton3.setText("Bidayatul Hidayah");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        ButtonPanel.add(jButton3);

        jButton4.setText("Insect Crisis");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        ButtonPanel.add(jButton4);

        jButton5.setText("Exit");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        ButtonPanel.add(jButton5);

        getContentPane().add(ButtonPanel, java.awt.BorderLayout.PAGE_START);

        ImagePanel.setLayout(new java.awt.CardLayout());

        JavaEE6LB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JavaEE6LB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/javaee.jpg"))); // NOI18N
        ImagePanel.add(JavaEE6LB, "0");

        JavaScriptLB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JavaScriptLB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/foto javascript.jpg"))); // NOI18N
        ImagePanel.add(JavaScriptLB, "1");

        BidayatulHidayahLB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BidayatulHidayahLB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/bidayatul hidayah.jpg"))); // NOI18N
        ImagePanel.add(BidayatulHidayahLB, "2");

        InsectCrisisLB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        InsectCrisisLB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/insectcrisis.jpg"))); // NOI18N
        ImagePanel.add(InsectCrisisLB, "3");

        getContentPane().add(ImagePanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JavaEE6BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JavaEE6BTNActionPerformed
        // TODO add your handling code here:
        CardLayout cl = (CardLayout) (ImagePanel.getLayout());
        cl.show(ImagePanel, "0");
    }//GEN-LAST:event_JavaEE6BTNActionPerformed

    private void JavaScriptBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JavaScriptBTNActionPerformed
        // TODO add your handling code here:
        CardLayout cl = (CardLayout) (ImagePanel.getLayout());
        cl.show(ImagePanel, "1");
    }//GEN-LAST:event_JavaScriptBTNActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        CardLayout cl = (CardLayout) (ImagePanel.getLayout());
        cl.show(ImagePanel, "2");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        CardLayout cl = (CardLayout) (ImagePanel.getLayout());
        cl.show(ImagePanel, "3");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            FullScreenFrameButton fullFrame = new FullScreenFrameButton();
            
            GraphicsDevice device =
                    GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
            device.setFullScreenWindow(fullFrame);
                
                
                new FullScreenFrameButton().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BidayatulHidayahLB;
    private javax.swing.JPanel ButtonPanel;
    private javax.swing.JPanel ImagePanel;
    private javax.swing.JLabel InsectCrisisLB;
    private javax.swing.JButton JavaEE6BTN;
    private javax.swing.JLabel JavaEE6LB;
    private javax.swing.JButton JavaScriptBTN;
    private javax.swing.JLabel JavaScriptLB;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    // End of variables declaration//GEN-END:variables
}
