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
public class Oficial extends Operario {
    
    public Oficial (String nom){
        super(nom);
    }
    
     @Override
     public String toString(){
        return super.toString()+ " -> Oficial";
    }
    
}
