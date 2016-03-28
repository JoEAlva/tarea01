/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author JorgeIgnacio
 */
public class Matricula {
    
    String curso;
    String siglaCurso;
    int cantCred;
    String carnet;
    String nomEst;
    
    public Matricula(String curso, String siglaCurso, int cantCred, String carnet, String nomEst){
        this.curso=curso;
        this.siglaCurso=siglaCurso;
        this.cantCred=cantCred;
        this.carnet=carnet;
        this.nomEst=nomEst;
    }
    
    
    
}//Fin Matricula

