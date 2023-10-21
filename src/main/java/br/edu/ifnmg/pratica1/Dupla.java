/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package br.edu.ifnmg.pratica1;

import java.util.ArrayList;

/**
 *
 * @author ketsu
 */
public class Dupla<T,U> {
    
    private T var0;
    private U var1;
    
    public Dupla(T var0,U var1){
        this.var0=var0;
        this.var1=var1;
    }
    
    static public String trimNumber(Double dubs, int at){
        String text;
        int k=0, k0=0;
        dubs=Math.round(dubs*Math.pow(10, at))/Math.pow(10,at);
        text=dubs.toString();
        
        //System.out.println((text.indexOf(".")+at));
        //System.out.println(text.length());
        
        if(text.indexOf(".")+at>text.length()){
            
            k0=(text.indexOf(".")+at)-text.length()+1;
            while(k<k0){
                text+="0";
                k++;
            }
        }
        
        return text;
        
        
    }
    
    @Override
    public String toString() {
        String text0=this.var0.toString();
        String text1=this.var1.toString();
        
        if(var0.getClass()==Double.class){
            text0=trimNumber((Double)var0,3);
        }
        
        if(var1.getClass()==Double.class){
            text1=trimNumber((Double)var1,3);
        }
        
        return "(" + text0 + ", " + text1 + ")" ;
    }
    
    
    
}
