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
            metodos.registrarCurso(curso.obtenerInformacionCurso());
            curso.limpiarCampos();
        }
        
        if(e.getActionCommand().equals("Modificar")){
            metodos.modificarCurso();
            curso.limpiarCampos();
        }
        
        if(e.getActionCommand().equals("Eliminar")){
            metodos.eliminarCurso(curso.obtenerSiglaCurso());
            curso.limpiarCampos();
        }
        
        if(e.getActionCommand().equals("Buscar")){       
            metodos.consultarCurso(curso.obtenerSiglaCurso());
        }
        
        if(e.getActionCommand().equals("Consultar")){
            metodos.obtenerListaCursos();
        }
        
    }//Fin Controlador_JFrame_Curso
    
}//Fin Controlador_JFrame_Curso
