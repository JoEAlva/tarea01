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
public class Controlador_JFrame_Estudiante implements ActionListener{
    
    //Referencia
    JFrame_Estudiante estudiante;
    
    public Controlador_JFrame_Estudiante(JFrame_Estudiante estudiante){ //Builder
        this.estudiante=estudiante;
    }
    /*
    Método que se llama cuando el objeto asociado genera una acción
    */
    public void actionPerformed(ActionEvent e){
        
        if(e.getActionCommand().equals("Registro")){
            System.out.println("Presionó -Registro-");
        }
        
    }
    
}//Fin_Controlador_JFrame_Estudiante
