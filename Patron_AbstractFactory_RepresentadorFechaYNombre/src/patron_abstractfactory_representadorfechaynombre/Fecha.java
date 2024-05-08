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
public class Fecha {
    String  fecha;
    String dia;
    String mes;
    String ano;
    
    public Fecha(){
        this.fecha="";
    }
    public Fecha(String f) {
        this.fecha = f;
    }
    public Fecha(String dia, String mes, String ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    public String mostrar(){
        //System.out.println(fecha);
        return "este mostrar no se utiliza";
    }
}
