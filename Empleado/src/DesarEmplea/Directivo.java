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
public class Directivo extends Empleado {
    
    public Directivo(String Nombre){
        super(Nombre);
    }
    
     @Override
     public String toString(){
        return super.toString()+" -> Directivo";
    }
    
}
