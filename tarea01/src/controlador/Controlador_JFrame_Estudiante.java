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
import vista.JFrame_ConsultaEstudiante;
import modelo.MetodosEstudiante;
/**
 *
 * @author JorgeIgnacio
 */
public class Controlador_JFrame_Estudiante implements ActionListener{
    
    //Referencia
    JFrame_Estudiante frm_Estudiante;
    JFrame_ConsultaEstudiante frm_ConsultaEstudiante;
    
    MetodosEstudiante metodos;
    
    
    public Controlador_JFrame_Estudiante(JFrame_Estudiante estudiante){ //Builder
        this.frm_Estudiante=estudiante;
        frm_ConsultaEstudiante = new JFrame_ConsultaEstudiante();
        metodos = new MetodosEstudiante(frm_Estudiante);
    }
    /*
    Método que se llama cuando el objeto asociado genera una acción
    */
    public void actionPerformed(ActionEvent e){
        
        if(e.getActionCommand().equals("Registro")){
            
            if(!frm_Estudiante.obtenerCarnet().equals("")){
                
                if(!metodos.siExiste(frm_Estudiante.obtenerCarnet())){
                    
                    if(!frm_Estudiante.obtenerCarnet().equals("") && !frm_Estudiante.obtenerNombre().equals("")){
                        
                        metodos.registrarEstudiante(frm_Estudiante.obtenerDatos());
                        frm_Estudiante.limpiarjTextField();
                        metodos.mensajeProcesoExitoso();
                        
                    }else{
                        
                        metodos.mensajeFaltaUnCampo();
                        
                    }
                                   
                }else{
                    
                    metodos.mensajeError();
                    frm_Estudiante.limpiarjTextField();
                
                }
            }else{
                
                metodos.mensajeAtencion();
                
            }
                       
        }//Fin_if
        
        if(e.getActionCommand().equals("Modificar")){
            
            if(metodos.siExiste(frm_Estudiante.obtenerCarnet())){
                
                metodos.modificarEstudiante(frm_Estudiante.obtenerCarnet(), frm_Estudiante.obtenerNombre());
                frm_Estudiante.limpiarjTextField();
                
            }else{
                
                metodos.mensajeNoExisteEstudiante();
                frm_Estudiante.limpiarjTextField();
                
            }
            
        }//Fin_if
        
        if(e.getActionCommand().equals("Eliminar")){
            
            if(metodos.siExiste(frm_Estudiante.obtenerCarnet())){
                
                metodos.eliminarEstudiante(frm_Estudiante.obtenerCarnet());
                frm_Estudiante.limpiarjTextField();
                
            }else{
                
                metodos.mensajeNoExisteEstudiante();
                frm_Estudiante.limpiarjTextField();
                
            }
           
        }//Fin_if
        
        if(e.getActionCommand().equals("Buscar")){
            
            if(!frm_Estudiante.obtenerCarnet().equals("")){
                
                metodos.consultarEstudiante(frm_Estudiante.obtenerCarnet()); 
            
            }else{
                
                metodos.mensajeFaltaUnCampo();
                
            }
            
        }
        
        if(e.getActionCommand().equals("Consultar")){
           frm_ConsultaEstudiante.setVisible(true);
           frm_ConsultaEstudiante.agregarEstudiantesjTextArea(metodos.obtenerListaEstudiantes());
        }
        
    }
    
}//Fin_Controlador_JFrame_Estudiante
