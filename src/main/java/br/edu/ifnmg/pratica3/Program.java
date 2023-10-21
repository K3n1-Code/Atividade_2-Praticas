/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.pratica3;

/**
 *
 * @author ketsu
 * 
 * //Resposta da A: Cheguei até 62 movimentos
 */
public class Program {
    public static void main(String[] args) {
        Tabuleiro Jogo = new Tabuleiro(3,0); //Algumas posições só chegam até 62 movimentos ao invés dos 63 TvT
        Jogo.iniciarJogo();
        System.out.println(Jogo.jogador);
        
    }
}
