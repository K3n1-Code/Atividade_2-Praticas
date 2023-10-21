/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.pratica1;
import java.util.List;

/**
 *
 * @author keni
 * 
 */
public class Container {
    static private Dupla method(List<Double> ins,List<Double> outs, int e, Double lr){
        Double w0=0.0,w1=0.0,p,diff;
        
        for(int i=0;i<e;i++){
            p=w1*ins.get(i % ins.size())+w0;
            diff = outs.get(i % outs.size()) - p;
            w0 += diff * lr;
            w1 += diff * lr * ins.get(i % ins.size());
            
            if(i%10==0){
            System.out.println(((Integer)i) + ", "+ w1 + ", "+w0);
            }
        }
        
        return new Dupla(w1,w0);
    }
    
    static public Dupla metodo(List<Double> ins,List<Double> outs){
        return method(ins,outs,2000,0.025);
    }
    
    static public Dupla metodo(List<Double> ins,List<Double> outs, int e){
        return method(ins,outs,e,0.025);
    }
    
    static public Dupla metodo(List<Double> ins,List<Double> outs, int e, Double lr){
        return method(ins,outs,e,lr);
    }
    
    
    
}
