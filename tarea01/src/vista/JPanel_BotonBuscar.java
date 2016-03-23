/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Controlador_JFrame_Curso;
import controlador.Controlador_JFrame_Estudiante;
/**
 *
 * @author JorgeIgnacio
 */
public class JPanel_BotonBuscar extends javax.swing.JPanel {

    Controlador_JFrame_Estudiante controlador;
    Controlador_JFrame_Curso controladorCurso;
    /**
     * Creates new form JPanel_ConsultarListaEstudiantes
     */
    public JPanel_BotonBuscar() {
        initComponents();
    }
    
    /*
    Método que agrega eventos a los botones
    */
    public void agregarEventosEstudiante(Controlador_JFrame_Estudiante controlador){
        this.controlador=controlador;
        this.jButton_Buscar.addActionListener(controlador);
    }
    
    public void agregarEventosCurso(Controlador_JFrame_Curso controladorCurso){
        this.controladorCurso=controladorCurso;
        this.jButton_Buscar.addActionListener(controladorCurso);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton_Buscar = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(45, 45));

        jButton_Buscar.setText("Buscar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton_Buscar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_Buscar)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Buscar;
    // End of variables declaration//GEN-END:variables
}
