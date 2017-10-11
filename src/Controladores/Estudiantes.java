/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

/**
 *
 * @author ofortich
 */
import Modelos.Estudiante;

public class Estudiantes {
    
    public static Estudiante ptrEstudiante;
    
    public static void addEstudiante(String nombre){
        Estudiante newEstudiante = new Estudiante(nombre);
        
        if(ptrEstudiante == null){
            ptrEstudiante = newEstudiante;
        }else{
            Estudiante temp = ptrEstudiante;
            while(temp.getLink() != null){
                temp = temp.getLink();
            }
            temp.addLink(newEstudiante);
        }
    }
    
    public static Estudiante findEstudiante(String nombre){
        if (ptrEstudiante == null) return null;
        else{
            Estudiante temp = ptrEstudiante;
            while(temp != null){
                if(temp.getNombre().equals(nombre)){
                    return temp;
                }
                temp = temp.getLink();
            }
        }    
        return null;
    }
}
