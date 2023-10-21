/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.pratica3;

/**
 *
 * @author keni
 */
public class Cavalo {
    Casa estiveEm[] = new Casa[64];
    Tabuleiro table;
    int movements=0;
    int currentRow;
    int currentColumn;
        
    public Cavalo(int row, int column, Tabuleiro table){
        this.currentRow=row;
        this.currentColumn=column;
        this.table=table;
       
        
    }
    
    public boolean mover(int moveNumber, Tabuleiro table){
        int a=currentRow + Move.horizontal[moveNumber];
        int b=currentColumn + Move.vertical[moveNumber];
        
        if( a> 7 || a<0 ){return false;}
        if(b>7 || b<0){return false;}
        
       //System.out.println("Destino: "+ table.casas[a][b] +", ocupada: +"+ table.casas[a][b].ocupada);
        
        if(table.casas[a][b].ocupada==true){return false;}
        
        
        table.casas[a][b].ocupada=true;
        
        estiveEm[movements]=(Casa)table.casas[currentRow][currentColumn].clone();
        movements+=1;
        
        currentRow=a;
        currentColumn=b;

        return true;
        
    }

    @Override
    public String toString() {
        String aux="";
        int k=0;
        while(k<64){
            if(estiveEm[k]!=null){
                aux+=estiveEm[k].toString();
                aux+="\n";
            }
            k++;
        }
        
        aux+=new Casa(currentRow,currentColumn).toString();
        aux+="\n";
        return "Posição atual:" + new Casa(currentRow,currentColumn).toString() + "Movimentos: "+ movements+ "\n" + aux;
    }
    
    
    
}
