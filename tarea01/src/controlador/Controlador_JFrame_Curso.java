/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.JFrame_ConsultaCurso;
import vista.JFrame_Curso;
import modelo.MetodosCurso;

/**
 *
 * @author JorgeIgnacio
 */
public class Controlador_JFrame_Curso implements ActionListener{

    //Referencia 
    JFrame_ConsultaCurso consultaCurso;
    JFrame_Curso curso;
    MetodosCurso metodos;
    
    public Controlador_JFrame_Curso(JFrame_Curso curso) {
        consultaCurso = new JFrame_ConsultaCurso();
        this.curso=curso;
        metodos = new MetodosCurso(curso);
        
    }
       
    public void actionPerformed(ActionEvent e){
        
        if(e.getActionCommand().equals("Registro")){
            
            if(!curso.obtenerSiglaCurso().equals("")){
                
                if(!metodos.siExisteCurso(curso.obtenerSiglaCurso())){
                    
                    if(!curso.obtenerSiglaCurso().equals("") && !curso.obtenerNombreCurso().equals("") && !curso.obtenerCreditoCurso().equals("")){
                        
                        metodos.registrarCurso(curso.obtenerInformacionCurso());
                        
                        curso.limpiarCampos();
                        
                    }else{
                        
                        metodos.mensajeFaltaUnCampo();
                        
                    }
                }else{
                    
                    metodos.mensajeAtencion();
                    curso.limpiarCampos();
                }
            }else{
                
                metodos.mensajeAtencion();
                
            }
        }//Fin Registro
        
        if(e.getActionCommand().equals("Modificar")){
            
            if(metodos.siExisteCurso(curso.obtenerSiglaCurso())){
                
                metodos.modificarCurso();
                curso.limpiarCampos();    
                
            }else{
                
                metodos.mensajeNoExisteEstudiante();
                curso.limpiarCampos();
                
            }
            
        }//Fin Modificar
        
        if(e.getActionCommand().equals("Eliminar")){
            if(metodos.siExisteCurso(curso.obtenerSiglaCurso())){
                
                metodos.eliminarCurso(curso.obtenerSiglaCurso());
                curso.limpiarCampos();  
                
            }else{
                
                metodos.mensajeNoExisteEstudiante();
                curso.limpiarCampos();
                
            }
            
        }//Fin Eliminar
        
        if(e.getActionCommand().equals("Buscar")){
            
            if(!curso.obtenerSiglaCurso().equals("")){
                
                metodos.consultarCurso(curso.obtenerSiglaCurso());
                
            }else{
                
                metodos.mensajeFaltaUnCampo();
                
            }
            
        }//Fin Buscar
        
        if(e.getActionCommand().equals("Consultar")){
            consultaCurso.setVisible(true);            
            consultaCurso.cargarInformacionCursos(metodos.obtenerListaCursos());
        }
        
    }//Fin Controlador_JFrame_Curso
    
}//Fin Controlador_JFrame_Curso
