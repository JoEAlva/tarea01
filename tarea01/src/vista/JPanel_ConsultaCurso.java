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
public class JPanel_ConsultaCurso extends javax.swing.JPanel {

    /**
     * Creates new form JPanel_ConsultaCurso
     */
    public JPanel_ConsultaCurso() {
        initComponents();
        this.jTextArea_ConsultaCurso.setEditable(false);
    }
    
    /*
    Método que carga la información de los cursos al jTextArea
    */
    public void cargarInformacionCursos(String informacionCursos){
        this.jTextArea_ConsultaCurso.setText(informacionCursos);
    }//Fin cargarInformacionCursos

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_ConsultaCurso = new javax.swing.JTextArea();

        jTextArea_ConsultaCurso.setColumns(20);
        jTextArea_ConsultaCurso.setRows(5);
        jScrollPane1.setViewportView(jTextArea_ConsultaCurso);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea_ConsultaCurso;
    // End of variables declaration//GEN-END:variables
}
