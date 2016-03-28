/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent; 
import vista.JFrame_Estudiante;
import vista.JFrame_Curso;
import vista.JFrame_ProcesoMatricula;

/**
 *
 * @author JorgeIgnacio
 */

public class Controlador_JFramePrincipal implements ActionListener{
    
    //Referencia de JFrame_VentanaPrincipal
    JFrame_Estudiante estudiante;
    JFrame_Curso curso;
    JFrame_ProcesoMatricula matricula;
    
    public Controlador_JFramePrincipal(){ //Builder
        estudiante = new JFrame_Estudiante();
        curso = new JFrame_Curso();
        matricula = new JFrame_ProcesoMatricula();
    }
    
    /*
    Método que se llama cuando el objeto asociado genera una acción
    */ 
    public void actionPerformed(ActionEvent e){
        
        if(e.getActionCommand().equals("Registro de Estudiantes")){
            estudiante.setVisible(true);
        }
        
        if(e.getActionCommand().equals("Registro de Cursos")){
            curso.setVisible(true);
        }
        
        if(e.getActionCommand().equals("MatriculaEstudiantes")){
            matricula.setVisible(true);
        }
        
    }
    
}//Fin_Controlador_JFramePrincipal
