/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.pratica3;

import java.util.Arrays;

/**
 *
 * @author ketsu
 */
public class Tabuleiro {
    public Casa casas[][] = new Casa[8][8];
    Cavalo jogador;
    
    public Tabuleiro(int startRow, int startColumn){
        jogador = new Cavalo(startRow,startColumn,this);
        int x=0,y;
        
        while(x<8){
            y=0;
            while(y<8){
                casas[x][y]=new Casa(x,y);
                //System.out.println(casas[x][y]);
                y++;
            }      
            x++;
        }
        
        casas[startRow][startColumn].ocupada=true;
    }
    
    private boolean canMove(Tabuleiro table){
        int k=0;
        int a,b;
        //System.out.println(table.jogador);
        while(k<8){
            a=table.jogador.currentRow + Move.horizontal[k];
            b=table.jogador.currentColumn + Move.vertical[k];
            if( a<= 7 && a>=0 ){
                if(b<=7 && b>=0){
                    if(table.casas[a][b].ocupada==false){return true;}
                }
            }
            k++;
        }
        return false;
    }
    
    public int largest_in_array(int array[]){ //faz uma dessa mas pra posição
        int largest=array[0],k=1;
        while(k<array.length){
            if(array[k]>largest){
                largest=array[k];
            }
            k++;
        }
        return largest;
    }
    
    public int largest_in_array_pos(int array[]){ //faz uma dessa mas pra posição
        int largest=0,k=0;
        while(k<array.length){
            if(array[k]>array[largest]){
                largest=k;
            }
            k++;
        }
        return largest;
    }
    
    public int smallest_in_array_pos(int array[]){ //faz uma dessa mas pra posição
        int smallest=0,k=0;
        while(array[smallest]==0){
            smallest++;
            if(smallest>=7) break;
        }
        while(k<array.length){
            if(array[k]<array[smallest] && array[k]!=0){
                smallest=k;
            }
            k++;
        }
        return smallest;
    }
  
    public void iniciarJogo(){
        int k, casa_score[] = new int[8],x,y;
        Casa disp_move[] = new Casa[8];
        
        while(canMove(this)){
            k=0;
            System.out.println("-  -");
            while(k<8){
                x=jogador.currentRow+Move.horizontal[k];
                y=jogador.currentColumn+Move.vertical[k];
                if((x<0 ||x>=8) || (y<0 || y>=8)){
                    disp_move[k]=null;
                }
                else {
                    disp_move[k]=casas[x][y];
                }
                casa_score[k]=Casa.getAcessos(disp_move[k],this);
                k++;
            }
            
            //System.out.println(Arrays.toString(casa_score));
            //System.out.println("Pos: "+smallest_in_array_pos(casa_score));
            jogador.mover(smallest_in_array_pos(casa_score), this);
            //System.out.println(jogador);
            
        }
    
    }
}
    