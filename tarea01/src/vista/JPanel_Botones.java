/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author JorgeIgnacio
 */
public class JPanel_Botones extends javax.swing.JPanel {

    /**
     * Creates new form JP_Botones
     */
    public JPanel_Botones() {
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

        jB_RegistroEst = new javax.swing.JButton();
        jB_ModificarEst = new javax.swing.JButton();
        jB_EliminarEst = new javax.swing.JButton();
        jB_ConsultarEst = new javax.swing.JButton();

        jB_RegistroEst.setText("Registro");

        jB_ModificarEst.setText("Modificar");

        jB_EliminarEst.setText("Eliminar");

        jB_ConsultarEst.setText("Consultar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jB_RegistroEst)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jB_ModificarEst)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jB_EliminarEst)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jB_ConsultarEst))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jB_RegistroEst)
                .addComponent(jB_ModificarEst)
                .addComponent(jB_EliminarEst)
                .addComponent(jB_ConsultarEst))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_ConsultarEst;
    private javax.swing.JButton jB_EliminarEst;
    private javax.swing.JButton jB_ModificarEst;
    private javax.swing.JButton jB_RegistroEst;
    // End of variables declaration//GEN-END:variables
}
