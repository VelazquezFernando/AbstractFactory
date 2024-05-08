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
public class NombreEnEEUU extends Nombre{

    @Override
    public String mostrar() {
//       System.out.println("dentro NombreEnEEUU");
//        System.out.println(Nombres+" "+AP + " " +AM);
    return AP+ " " +Nombres;
        
    }
    
    public NombreEnEEUU(String AP, String AM, String Nombres) {
        super(AP, AM, Nombres);
    }
    
}
