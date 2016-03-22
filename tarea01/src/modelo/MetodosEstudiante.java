/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.OK_OPTION;
import vista.JFrame_Estudiante;
/**
 *
 * @author JorgeIgnacio
 */
public class MetodosEstudiante {
    
    //Se declara el array de Estudiante
    ArrayList <Estudiante> arrayEstudiante;
    JFrame_Estudiante frm_Estudiante;
    
    public MetodosEstudiante(JFrame_Estudiante frm_Estudiante) { //Builder
        
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
    public void modificarEstudiante(String carnet, String nombre){
        
        if(siExiste(frm_Estudiante.obtenerCarnet())){
            for(int i=0; i<arrayEstudiante.size(); i++){
                int j=0;
                j=indiceObjeto(frm_Estudiante.obtenerCarnet());
                arrayEstudiante.get(j).setNombre(nombre);
            }
            
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
    
    /*
    Método que elimina un estudiante del registro
    @param carnet identificación del estudiante    
    */
    public void eliminarEstudiante(String carnet){
        int i=0;
        i=indiceObjeto(frm_Estudiante.obtenerCarnet());
        if(siExiste(frm_Estudiante.obtenerCarnet())){
            arrayEstudiante.remove(i);
        }
    }//Fin_eliminarEstudiante
    
    /*
    Método que devulve la información de un estudiante
    en el registro
    */
    public void consultarEstudiante(){
        int i=0;
        i=indiceObjeto(frm_Estudiante.obtenerCarnet());
        if(siExiste(frm_Estudiante.obtenerCarnet())){
            frm_Estudiante.cargarNombre(arrayEstudiante.get(i).getNombre());
        }
    }//Fin_consultarEsstudiante
    
    public String obtenerListaEstudiantes(){
        String cadena="";
        for(int i=0; i<arrayEstudiante.size(); i++){
            cadena+=arrayEstudiante.get(i).getCarnet()+" "+arrayEstudiante.get(i).getNombre()+"\n";
        }
        return cadena;
    }//Fin_obtenerListaEstudiantes
    
    /*
    Método que muestra un mensaje al usuario
    */
    public void mensajeProcesoExitoso(){
        JOptionPane.showMessageDialog(null, "Estudiante agregado al registro.", "Registro",JOptionPane.INFORMATION_MESSAGE);
    }//Fin_mensajeProcesoExitoso
    
    /*
    Método que muestra un mensaje al usuario
    */
    public void mensajeError(){
        JOptionPane.showMessageDialog(null, "El estudiante ya se encuentra matriculado.", "Error", JOptionPane.ERROR_MESSAGE);
    }//Fin_mensajeError
    
    /*
    Método que muestra un mensaje al usuario
    */
    public void mensajeAtencion(){
        JOptionPane.showMessageDialog(null, "Debe ingresar primero un carnet antes de registrar.", "Atención", JOptionPane.WARNING_MESSAGE);
    }//Fin_mensajeAtencion
    
    /*
    Método que muestra un mensaje al usuario
    */
    public void mensajeFaltaUnCampo(){
        JOptionPane.showMessageDialog(null, "Falta de llenar algún campo. Inténtelo de nuevo.", "Atención", JOptionPane.WARNING_MESSAGE);
    }//Fin_mensajeAtencion
    
    /*
    Método que muestra un mensaje al usuario
    */
    public void mensajeNoExisteEstudiante(){
        JOptionPane.showMessageDialog(null, "El estudiante no se encuentra registrado.", "Error", JOptionPane.ERROR_MESSAGE);
    }//Fin_mensajeError
    
}//Fin_MetodosEstudiante
