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
public class Materia {
    private String nombre;
    private final double nota;
    private Materia link;

    public Materia(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
        this.link = null;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public double getNota(){
        return this.nota;
    }
    
    public Materia getLink(){
        return this.link;
    }
    
    public void addLink(Materia sig){
        this.link = sig;
    }
}
