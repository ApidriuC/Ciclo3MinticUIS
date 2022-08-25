package Main;

import java.awt.Image;
import java.awt.Toolkit;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    //Icono del Menú
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("assets/iconApp.png"));

        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelBackground = new javax.swing.JPanel();
        PanelHeader = new javax.swing.JPanel();
        HeaderDescription = new javax.swing.JLabel();
        HeaderTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("La Rockola");
        setBackground(new java.awt.Color(204, 255, 255));
        setIconImage(getIconImage());
        setResizable(false);
        setSize(new java.awt.Dimension(1200, 600));

        PanelBackground.setBackground(new java.awt.Color(102, 153, 255));
        PanelBackground.setForeground(new java.awt.Color(255, 255, 255));

        PanelHeader.setBackground(new java.awt.Color(102, 102, 255));
        PanelHeader.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HeaderDescription.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        HeaderDescription.setText("Aquí podrás encontrar las mejores canciones para que escuches cuando quieras a la hora que quieras...");
        PanelHeader.add(HeaderDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));
        HeaderDescription.getAccessibleContext().setAccessibleName("descripcionHeader");

        HeaderTitle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        HeaderTitle.setText("Bienvenido a la Rockola!");
        PanelHeader.add(HeaderTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
        HeaderTitle.getAccessibleContext().setAccessibleName("headerTitle");

        javax.swing.GroupLayout PanelBackgroundLayout = new javax.swing.GroupLayout(PanelBackground);
        PanelBackground.setLayout(PanelBackgroundLayout);
        PanelBackgroundLayout.setHorizontalGroup(
            PanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 1200, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        PanelBackgroundLayout.setVerticalGroup(
            PanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBackgroundLayout.createSequentialGroup()
                .addComponent(PanelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 530, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        PanelBackground.getAccessibleContext().setAccessibleName("PanelBackground");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HeaderDescription;
    private javax.swing.JLabel HeaderTitle;
    private javax.swing.JPanel PanelBackground;
    private javax.swing.JPanel PanelHeader;
    // End of variables declaration//GEN-END:variables
}
