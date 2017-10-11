/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author ofortich
 */
public class Estudiante {
    String nombre;
    Materia ptrMaterias;
    Estudiante link;

    public Estudiante(String nombre) {
        this.nombre = nombre;
        this.ptrMaterias = null;
        this.link = null;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public Estudiante getLink(){
        return this.link;
    }
    
    public void addLink(Estudiante sig){
        this.link = sig;
    }
    
    public void addMateria(String nombre, double nota){
        Materia newMateria = new Materia(nombre, nota);
        
        if(ptrMaterias == null){
            ptrMaterias = newMateria;
        }else{
            Materia temp = ptrMaterias;
            while(temp.getLink() != null){
                temp = temp.getLink();
            }
            temp.addLink(newMateria);
        }
    }
}
