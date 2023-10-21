/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.edu.ifnmg.pratica1;

import java.util.ArrayList;
/**
 *
 * @author ketsu
 */
public class Program {
    
    
    
    static ArrayList<Double> list0=new ArrayList<Double>(){{
        add(2.900000095);
        add(6.699999809);
        add(4.900000095);
        add(7.900000095);
        add(9.800000191);
        add(6.900000095);
        add(6.099999905);
        add(6.199999809);
        add(6.0);
        add(5.099999905);
        add(4.699999809);
        add(4.400000095);
        add(5.800000191);
        
    }};
    static ArrayList<Double> list1=new ArrayList<Double>(){{
        add(4.0);
        add(7.400000095);
        add(5.0);
        add(7.199999809);
        add(7.900000095);
        add(6.099999905);
        add(6.0);
        add(5.800000191);
        add(5.199999809);
        add(4.199999809);
        add(4.0);
        add(4.400000095);
        add(5.199999809);
        
    }};
    public static void main(String[] args) {
        System.out.println(Container.metodo(list0, list1));
    }
}
