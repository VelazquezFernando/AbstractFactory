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
public class Nombre {
    String AP;
    String AM;
    String Nombres;

    public Nombre() {
        this.AP = "";
        this.AM = "";
        this.Nombres = ""; 
    }

    public Nombre(String AP, String AM, String Nombres) {
        this.AP = AP;
        this.AM = AM;
        this.Nombres = Nombres;
    }
    public String mostrar(){
        //System.out.println(AP + " " +AM+" "+Nombres);
        return "no se utiliza";//AP + " " +AM+" "+Nombres;
    }
}
