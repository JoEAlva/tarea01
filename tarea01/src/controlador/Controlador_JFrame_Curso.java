/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.JFrame_Curso;
import modelo.MetodosCurso;

/**
 *
 * @author JorgeIgnacio
 */
public class Controlador_JFrame_Curso implements ActionListener{

    //Referencia 
    JFrame_Curso curso;
    MetodosCurso metodos;
    
    public Controlador_JFrame_Curso(JFrame_Curso curso) {
        this.curso=curso;
        metodos = new MetodosCurso(curso);
    }
       
    public void actionPerformed(ActionEvent e){
        
        if(e.getActionCommand().equals("Registro")){
            System.out.println("Hola Mundo");
        }
        
        if(e.getActionCommand().equals("Modificar")){
            
        }
        
        if(e.getActionCommand().equals("Eliminas")){
            
        }
        
        if(e.getActionCommand().equals("Buscar")){
            
        }
        
        if(e.getActionCommand().equals("Consultar")){
            
        }
        
    }//Fin Controlador_JFrame_Curso
    
}//Fin Controlador_JFrame_Curso
