/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesarEmplea;

/**
 *
 * @author jdavi
 */
public class Empleado {
    
    private String Nombre;
    
    public Empleado(){}
    
    public Empleado(String nom){
        this.Nombre=nom;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    public String toString(){
        return "Nombre: " + this.Nombre;
    }
    
}
