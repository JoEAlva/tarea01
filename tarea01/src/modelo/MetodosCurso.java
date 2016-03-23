/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import vista.JFrame_Curso;
/**
 *
 * @author JorgeIgnacio
 */
public class MetodosCurso {

    //Se declara el array de Curso
    ArrayList <Curso> arrayCurso;
    JFrame_Curso curso;
    
    public MetodosCurso(JFrame_Curso curso) { //Builder
        
        arrayCurso = new ArrayList<Curso>();
        this.curso=curso;
        
    }
    
    /*
    Método que agregar un curso dentro del array
    @param String[] informacion dentro tiene los datos del curso
    */
    public void registrarCurso(String informacion[]){
        Curso temporal = new Curso(informacion[0], informacion[1], informacion[2]);
        arrayCurso.add(temporal);
    }//Fin registrarCurso
    
    /*
    Método que busca un curso por medio del indentificador del curso
    @param siglaCurso identificador de un curso
    */
    public void consultarCurso(String siglaCurso){
        
        for(int i=0; i<arrayCurso.size(); i++){
            if(arrayCurso.get(i).getSiglaCurso().equals(siglaCurso)){
                curso.cargarInformacionCurso(arrayCurso.get(i).getNombreCurso(), arrayCurso.get(i).getCantidadCreditos());
            }
        }
        
    }//Fin consultarCurso
    
    /*
    Método que elimina un curso del registro
    @param siglaCurso identificador de un curso
    */
    public void eliminarCurso(String siglaCurso){
        
        for(int i=0; i<arrayCurso.size(); i++){
            if(arrayCurso.get(i).getSiglaCurso().equals(siglaCurso)){
                arrayCurso.remove(i);
            }
        }
        
    }//Fin eliminarCurso
    
    /*
    Método que modifica un curso en el registro
    ingresando nuevos valores
    
    */
    public void modificarCurso(){
        
        int i=indiceCurso(curso.obtenerSiglaCurso());
        
        if(siExisteCurso(curso.obtenerSiglaCurso())){
            arrayCurso.get(i).setNombreCurso(curso.obtenerNombreCurso());
            arrayCurso.get(i).setCantidadCreditos(curso.obtenerCreditoCurso());
        }
        
    }//Fin modificarCurso
    
    public String obtenerListaCursos(){
        String cadena="";
        for(int i=0; i<arrayCurso.size(); i++){
            cadena+=arrayCurso.get(i).getSiglaCurso()+" "+
                    arrayCurso.get(i).getNombreCurso()+" "+
                    arrayCurso.get(i).getCantidadCreditos()+"\n";
        }
        return cadena;
    }
    
    /*
    Método que verifca si existe un curso por medio de la sigle del curso
    @param siglaCurso identificación del curso
    */
    public boolean siExisteCurso(String siglaCurso){
        
        boolean existe=false;
        
        for(int i=0; i<arrayCurso.size(); i++){   
            if(arrayCurso.get(i).getSiglaCurso().equals(siglaCurso)){
                existe=true;
            }
        }
        
        return existe;
        
    }//Fin siExisteCurso
    
    public int indiceCurso(String siglaCurso){
        
        int indice=0;
        
        for(int i=0; i<arrayCurso.size(); i++){
            if(arrayCurso.get(i).getSiglaCurso().equals(siglaCurso)){
                indice=i;
            }
        }
        
        return indice;
        
    }//Fin indiceCurso
    
}//Fin MetodosCurso

