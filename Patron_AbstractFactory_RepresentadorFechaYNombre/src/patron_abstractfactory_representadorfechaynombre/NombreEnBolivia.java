/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patron_abstractfactory_representadorfechaynombre;

/**
 *
 * @author Fernando
 */
public class NombreEnBolivia extends Nombre{

  
    @Override
    public String mostrar() {
//        System.out.println("dentro NombreEnBolivia");
//        System.out.println(AP + " " +AM+" "+Nombres);
        return AP + " " +AM+" "+Nombres;
        
    }

    public NombreEnBolivia(String AP, String AM, String Nombres) {
        super(AP, AM, Nombres);
    }
    
    
  
    
    
}
