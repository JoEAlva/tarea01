/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import modelo.Estudiante;
import vista.JFrame_Estudiante;
import modelo.MetodosEstudiante;
/**
 *
 * @author JorgeIgnacio
 */
public class Controlador_JFrame_Estudiante implements ActionListener{
    
    //Referencia
    JFrame_Estudiante frm_Estudiante;
    MetodosEstudiante metodos;
    
    
    public Controlador_JFrame_Estudiante(JFrame_Estudiante estudiante){ //Builder
        this.frm_Estudiante=estudiante;
        metodos = new MetodosEstudiante(frm_Estudiante);
    }
    /*
    Método que se llama cuando el objeto asociado genera una acción
    */
    public void actionPerformed(ActionEvent e){
        
        if(e.getActionCommand().equals("Registro")){
            System.out.println("Presionó -Registro-");
            metodos.registrarEstudiante(frm_Estudiante.obtenerDatos());
            frm_Estudiante.limpiarjTextField();
            
        }
        
        if(e.getActionCommand().equals("Modificar")){
            metodos.modificarEstudiante(frm_Estudiante.obtenerCarnet(), frm_Estudiante.obtenerNombre());
            frm_Estudiante.limpiarjTextField();
        }
        
        if(e.getActionCommand().equals("Eliminar")){
            metodos.eliminarEstudiante(frm_Estudiante.obtenerCarnet());
            frm_Estudiante.limpiarjTextField();

        }
        
        if(e.getActionCommand().equals("Consultar")){
            metodos.consultarEstudiante(frm_Estudiante.obtenerCarnet());
        }
        
        if(e.getActionCommand().equals("Buscar")){
            System.out.print("hola mundo");
        }
        
    }
    
}//Fin_Controlador_JFrame_Estudiante
