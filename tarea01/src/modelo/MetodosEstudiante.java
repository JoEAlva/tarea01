/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import vista.JFrame_Estudiante;
/**
 *
 * @author JorgeIgnacio
 */
public class MetodosEstudiante {
    
    //Se declara el array de Estudiante
    ArrayList <Estudiante> arrayEstudiante;
    JFrame_Estudiante frm_Estudiante;
    
    public MetodosEstudiante(JFrame_Estudiante frm_Estudiante) {
        
        arrayEstudiante = new ArrayList<Estudiante>();
        this.frm_Estudiante=frm_Estudiante;
        
    }
    
    /*
    Método que agregar un estudiante dentro del array
    @param String[] informacion dentro tiene los datos del estudiante
    */
    public void registrarEstudiante(String[] informacion) {
        
        Estudiante temporal = new Estudiante(informacion[0], informacion[1]);
        arrayEstudiante.add(temporal);       
        
    }
    
    /*
    Método que modifica el nombre de un estudiante
    @param nombre nuevo nombre que va a recibir el estudiante
    */
    public void modificarEstudiante(String nombre){
        
        int i=0;
        i= indiceObjeto(frm_Estudiante.obtenerCarnet());
        if(siExiste(frm_Estudiante.obtenerCarnet())){
            
        }
        
    }//Fin_modificarEstudiante
    
    /*
    Método que verifica si se encuentra registrado un
    estudiante en el array por medio del carnet
    @param carnet identificación del estudiante    
    */
    public boolean siExiste(String carnet){
        
        boolean existe = false;
        for(int i=0; i<arrayEstudiante.size(); i++){
            if(arrayEstudiante.get(i).getCarnet().equals(carnet)){
                existe=true;
            }
        }
        return existe;
        
    }//Fin_siExiste
    
    /*
    Método que obtiene el indice donde se
    encuentra el estudiante almacenado en el array
    @param carnet identificación del estudiante    
    */
    public int indiceObjeto(String carnet){
        int j=0;
        for(int i=0; i<arrayEstudiante.size(); i++){
            if(arrayEstudiante.get(i).getCarnet().equals(carnet)){
                j=i;
            }
        }
        return j;
    }//Fin_indiceObjeto
    
    public void eliminar(String carnet){
        
    }
    
}//Fin_MetodosEstudiante
