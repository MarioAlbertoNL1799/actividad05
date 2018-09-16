/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author manl_
 */
public class ModelRFC {
    private int dia;
    private int mes;
    private int anio;
    private String Nombre = "";
    private String ApePat = "";
    private String ApeMat = "";
    private String iniciales = "";
    private String Numeros = "";

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApePat() {
        return ApePat;
    }

    public void setApePat(String ApePat) {
        this.ApePat = ApePat;
    }

    public String getApeMat() {
        return ApeMat;
    }

    public void setApeMat(String ApeMat) {
        this.ApeMat = ApeMat;
    }
    public String getIniciales() {
        return iniciales;
    }

    public void setIniciales(String iniciales) {
        this.iniciales = iniciales;
    }

    public String getNumeros() {
        return Numeros;
    }

    public void setNumeros(String Numeros) {
        this.Numeros = Numeros;
    }
    
    public String Siglas(){
        int a= 1;
        String siglanom = Nombre.substring(0,1);
        String sigla_apep = ApePat.substring(0,1);
        String sigla_apemat = ApeMat.substring(0,1);
        char vocal = ApePat.charAt(a);
        boolean inicio;
        while(inicio = true){
            System.out.println("El caracter actual es: "+vocal);
            if(vocal == 'a' || vocal == 'e' || vocal == 'i' || vocal == 'o'||vocal == 'u'){
            System.out.println("La primera vocal de la palabra es: "+vocal);
            vocal = ApePat.charAt(a);
            break;
            }
            else {
                a++;
                vocal = ApePat.charAt(a);
                System.out.println("El caracter cambio a: "+vocal);
            }
        }
        iniciales = (sigla_apep+vocal+sigla_apemat+siglanom).toUpperCase();
        return iniciales;
    }
        
    public String numeros(){
        if (anio < 1900 || anio > 2018)
            return null;
        else{
        anio = anio % 100;
        String valor_mes="0";
        String res = null;
        String ndia = null;
        if (anio < 10)
            res = "0"+anio;
        else
            res = ""+anio;
        if (mes == 0)
           valor_mes = "01";
        else if(mes < 9)
            valor_mes = "0"+mes;
        else 
            valor_mes = ""+mes;
        if (dia <10)
            ndia = "0"+dia;
        else
            ndia = ""+dia;
        String valores = res+valor_mes+ndia;
        Numeros = valores;
        return Numeros;
    }}
}
