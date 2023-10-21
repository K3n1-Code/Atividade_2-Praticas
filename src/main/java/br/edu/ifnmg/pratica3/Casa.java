/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.pratica3;

/**
 *
 * @author ketsu
 */
public class Casa {
    boolean ocupada=false;
    final int row;
    final int column;
    
    
    Casa(){
        row=0;
        column=0;
    }
    
    Casa(int row, int column){
        this.row=row;
        this.column=column;
    }
    
    public static int getAcessos(Casa casa,Tabuleiro table){
        if(casa==null || casa.ocupada==true){return 0;}
        
        int sum=0,k=0,x,y;
        
        
        while(k<8){
            x=casa.row+Move.horizontal[k];
            y=casa.column+Move.vertical[k];
            if(x>=0 && x<8){
                if(y>=0 && y<8){
                    if(table.casas[x][y].ocupada==false){
                    sum++;
                    }
                
                }
            }
            k++;
        
        }
        return sum;
    }
    
    @Override
    public Casa clone(){
    return new Casa(row,column);
    }

    @Override
    public String toString() {
        return "["+(row+1)+", "+(column+1)+"]";
    }
    
    
}
