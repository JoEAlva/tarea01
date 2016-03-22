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
public class Estudiante {
    
    private String carnet;
    private String nombre;
    
    public Estudiante(String carnet, String nombre) { //Builder
        this.carnet=carnet;
        this.nombre=nombre;
    }
    
    public String getCarnet(){ //Getter
        return carnet;
    }
    
    public void setCarnet(String carnet){ //Setter
        this.carnet=carnet;
    }
    
    public String getNombre(){ //Getter
        return nombre;
    }
    
    public void setNombre(String nombre){ //Setter
        this.nombre=nombre;
    }
    
    public String informacion()
    {
        return nombre+" "+carnet;
    }
    
}//Fin_Estudiante
