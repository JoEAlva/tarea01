/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import modelo.MetodosMatricula;
/**
 *
 * @author JorgeIgnacio
 */
public class Controlador_JFrame_MatriculaProceso implements ActionListener{

    MetodosMatricula metodosMatricula;
    
    public Controlador_JFrame_MatriculaProceso() {
        metodosMatricula = new MetodosMatricula();
    }
   
    public void actionPerformed(ActionEvent e){
        
        if(e.getActionCommand().equals("Buscar")){
            
            
        }
        
        if(e.getActionCommand().equals("Matricular")){
            System.out.println("Se pulsó -Matricular-");
        }
        
    }
    
}//Fin Controlador_JFrame_MatriculaProceso
