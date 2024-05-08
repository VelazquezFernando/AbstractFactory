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
public interface Fabrica {
    Nombre mostrarNombre(String AP, String AM, String Nombres);
    Fecha mostrarFecha(String dia, String mes, String ano);
}
