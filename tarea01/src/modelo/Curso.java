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
public class Curso {
    
    private String nombreCurso;
    private String siglaCurso;
    private String cantidadCreditos;

    public Curso(String nombreCurso, String siglaCurso, String cantidadCreditos) {
        this.nombreCurso = nombreCurso;
        this.siglaCurso = siglaCurso;
        this.cantidadCreditos = cantidadCreditos;
    }
    
    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getSiglaCurso() {
        return siglaCurso;
    }

    public void setSiglaCurso(String siglaCurso) {
        this.siglaCurso = siglaCurso;
    }

    public String getCantidadCreditos() {
        return cantidadCreditos;
    }

    public void setCantidadCreditos(String cantidadCreditos) {
        this.cantidadCreditos = cantidadCreditos;
    }
       
}//Fin_Curso
