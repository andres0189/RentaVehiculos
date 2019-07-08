/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentaautomoviles;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class frmRentar extends javax.swing.JDialog {

    /**
     * Creates new form frmRentar
     */
    //agregar vehiculos
    Carros carrosporrentar;

    
    boolean mostrar;

//modificar el constructor para recibir todos los carros
    public frmRentar(java.awt.Frame parent, boolean modal, Carros c, int tipo) {
        super(parent, modal);
        initComponents();
        carrosporrentar = c;
        
        if (tipo == 1) {
            lblmensaje.setText(("Vehiculos disponibles para rentar"));
           mostrar = true;
           btnCarro.setText("rentar");
        } else if (tipo == 2) {
            lblmensaje.setText("Vehiculos para devolver");
            mostrar = false;
            btnCarro.setText("devolver");
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblmensaje = new javax.swing.JLabel();
        btnCarro = new javax.swing.JButton();
        vehiculos = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblmensaje.setText("Vehiculos disponibles para rentar");

        btnCarro.setText("Rentar");
        btnCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarroActionPerformed(evt);
            }
        });

        vehiculos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        vehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vehiculosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(btnCarro))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(vehiculos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblmensaje))))
                .addContainerGap(213, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblmensaje)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vehiculos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btnCarro)
                .addContainerGap(159, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void vehiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vehiculosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vehiculosActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:

        mostrarCarrosDisponibles(carrosporrentar);
    }//GEN-LAST:event_formWindowOpened

    private void btnCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarroActionPerformed
        // TODO add your handling code here:
        String placa = JOptionPane.showInputDialog("Digite la placa del vehiculo");
        JOptionPane.showMessageDialog(rootPane, modificarDisponible(placa));
    }//GEN-LAST:event_btnCarroActionPerformed

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
            java.util.logging.Logger.getLogger(frmRentar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRentar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRentar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRentar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmRentar dialog = new frmRentar(new javax.swing.JFrame(), true, null, 0);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    public void mostrarCarrosDisponibles(Carros autos) {
        vehiculos.removeAllItems();
        for (int i = 0; i < 5; i++) {
            if (autos.disponible[i] == mostrar) {
                vehiculos.addItem(autos.modelos[i] + " placas: " + autos.placas[i] + " precio: " + autos.precios[i]);
                //System.out.println("El auto " + autos.modelos[i] + "placas: " +autos.placas[i]+"precio:"+autos.precios[i]+ "Se encuentra disponible");

            }
        }

    }

    public String modificarDisponible(String plaquita) {

        for (int i = 0; i < 5; i++) {
            if (plaquita.equalsIgnoreCase(carrosporrentar.placas[i])) {
                carrosporrentar.disponible[i] = !mostrar;
                mostrarCarrosDisponibles(carrosporrentar);
                if (mostrar == true) {

                    return "Vehiculo satisfactoriamente rentado";
                } else {
                    return "Vehiculo satisfactoriamente devuelto";
                }
            }
        }
        return "Placa errada";
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCarro;
    private javax.swing.JLabel lblmensaje;
    private javax.swing.JComboBox<String> vehiculos;
    // End of variables declaration//GEN-END:variables
}