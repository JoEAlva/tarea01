/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent; 
import vista.JFrame_Estudiante;

/**
 *
 * @author JorgeIgnacio
 */

public class Controlador_JFramePrincipal implements ActionListener{
    
    //Referencia de JFrame_VentanaPrincipal
    JFrame_Estudiante estudiante;
    
    public Controlador_JFramePrincipal(){ //Builder
        estudiante = new JFrame_Estudiante();
    }
    
    /*
    Método que se llama cuando el objeto asociado genera una acción
    */ 
    public void actionPerformed(ActionEvent e){
        
        if(e.getActionCommand().equals("Registro de Estudiantes")){
            estudiante.setVisible(true);
        }
        
    }
    
}//Fin_Controlador_JFramePrincipal
