/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.pratica3;

/**
 *
 * @author keni
 */
public final class Move {
    public static final int[] horizontal = {2,1,-1,-2,-2,-1,1,2};
    public static int[] vertical = {-1,-2,-2,-1,1,2,2,1};

    
    public static String toString(Integer m) {
        return "("+horizontal[m]+","+ vertical[m]+")";
    }
    
    
    
    
}
