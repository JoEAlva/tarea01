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
public class MetodosEstudiante {
    
    //Se declara el array de Estudiante
    ArrayList <Estudiante> arrayEstudiante;
    
    public MetodosEstudiante() {
        
        arrayEstudiante = new ArrayList<Estudiante>();
        
    }
    
    public void registrarEstudiante(String[] informacion) {
        Estudiante temporal = new Estudiante(informacion[0], informacion[1]);
        arrayEstudiante.add(temporal);
    }
    
}//Fin_MetodosEstudiante
