/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patron_abstractfactory_representadorfechaynombre;

import java.text.DateFormat;
import java.util.Date;

/**
 *
 * @author Fernando
 */
public class FechaEEUU extends Fecha{
    
   
    
    public FechaEEUU(String dia, String mes, String ano) {
        super(dia, mes, ano);
    }

    @Override
    public String mostrar() {         
        
        return  mes+ "-" +  dia+ "-" + ano;
    }
    
}
