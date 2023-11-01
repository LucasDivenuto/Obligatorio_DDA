/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentacion;
import Logica.Crupier;
import Logica.Jugador;
import Servicios.Fachada;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

/**
 *
 * @author sofia
 */
public class A_Inicio extends javax.swing.JFrame {

    
    /**
     * Creates new form A_Inicio
     */
    public A_Inicio() {
        initComponents();
        groupButton();
    }
    
    private void groupButton(){
    ButtonGroup btnGroup=new ButtonGroup();
        btnGroup.add(radioBtnCrupier);
        btnGroup.add(radioBtnJugador);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        t_cedulaUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        t_passwordUsuario = new javax.swing.JPasswordField();
        btnLogIn = new javax.swing.JButton();
        radioBtnCrupier = new javax.swing.JRadioButton();
        radioBtnJugador = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Cédula:");

        jLabel2.setText("Contraseña:");

        btnLogIn.setBackground(new java.awt.Color(204, 255, 204));
        btnLogIn.setText("Ingresar");
        btnLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogInActionPerformed(evt);
            }
        });

        radioBtnCrupier.setText("Crupier");
        radioBtnCrupier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnCrupierActionPerformed(evt);
            }
        });

        radioBtnJugador.setText("Jugador");
        radioBtnJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnJugadorActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("BIENVENIDO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(t_cedulaUsuario)
                            .addComponent(t_passwordUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(radioBtnCrupier)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(radioBtnJugador)))
                .addContainerGap(103, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnLogIn)
                .addGap(139, 139, 139))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel3)
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_cedulaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(t_passwordUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioBtnCrupier)
                    .addComponent(radioBtnJugador))
                .addGap(18, 18, 18)
                .addComponent(btnLogIn)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radioBtnCrupierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnCrupierActionPerformed
       
    }//GEN-LAST:event_radioBtnCrupierActionPerformed

    private void radioBtnJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnJugadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioBtnJugadorActionPerformed

    private void btnLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogInActionPerformed
        String cedula= t_cedulaUsuario.getText();
        String password= new String(t_passwordUsuario.getPassword());
        if(radioBtnJugador.isSelected()){
           this.logInJugador(cedula,password);
       } else if (radioBtnCrupier.isSelected()){
           this.logInCrupier(cedula, password);
       } else {
           JOptionPane.showMessageDialog(this, "Por favor selecciona un tipo de usuario");
       }
    }//GEN-LAST:event_btnLogInActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(A_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(A_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(A_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(A_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new A_Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogIn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton radioBtnCrupier;
    private javax.swing.JRadioButton radioBtnJugador;
    private javax.swing.JTextField t_cedulaUsuario;
    private javax.swing.JPasswordField t_passwordUsuario;
    // End of variables declaration//GEN-END:variables

    private void logInJugador(String cedula, String password) {
        Jugador jugador=Fachada.getInstancia().loginJugador(cedula, password);
            if(jugador==null){
                JOptionPane.showMessageDialog(this, "Usuario y/o contraseña incorrectos");
            } else {
                System.out.println("Usuario jugador loggeado" + jugador.getCedula());
                //new VistaAgenda(sesion).setVisible(true);
            }
    }

    private void logInCrupier(String cedula, String password) {
        Crupier crupier=Fachada.getInstancia().loginCrupier(cedula, password);
            if(crupier==null){
                JOptionPane.showMessageDialog(this, "Usuario y/o contraseña incorrectos");
            } else {
                System.out.println("Usuario crupier loggeado" + crupier.getCedula());
            }
    }


}