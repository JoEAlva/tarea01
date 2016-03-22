/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
/**
 *
 * @author JorgeIgnacio
 */
public class MetodosCurso {

    //Se declara el array de Curso
    ArrayList <Curso> arrayCurso;
    
    public MetodosCurso() { //Builder
        
        arrayCurso = new ArrayList<Curso>();
        
    }
    
    /*
    Método que agregar un curso dentro del array
    @param String[] informacion dentro tiene los datos del curso
    */
    public void registrarCurso(String informacion[]){
        Curso temporal = new Curso(informacion[0], informacion[1], informacion[2]);
        arrayCurso.add(temporal);
    }//Fin registrarCurso
    
    public void consultarCurso(String siglaCurso){
        
        
    }//Fin consultarCurso
    
}//Fin MetodosCurso

