/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patron_abstractfactory_representadorfechaynombre;

import java.util.Date;

/**
 *
 * @author Fernando
 */
public class FabricaBol implements Fabrica{

    

    @Override
    public Fecha mostrarFecha(String dia, String mes, String ano) {
        return new FechaBol(dia, mes, ano);
    }

    @Override
    public Nombre mostrarNombre(String AP, String AM, String Nombres) {
        return new NombreEnBolivia(AP, AM, Nombres);
    }
    

   
    
}
