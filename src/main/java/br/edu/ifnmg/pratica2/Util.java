/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.pratica2;

/**
 *
 * @author ketsu
 */
public class Util {
    public static int obterDigito(long numero, int pos){
        long aux0=(long)Math.pow(10,pos),aux1=(long)Math.pow(10,pos-1);
        numero=numero%aux0;
        numero-=numero%aux1;
        while(numero>=10){
            numero/=10;
        }
        return (int)numero;
    }
    
    public static boolean validarCpf(long cpf){
        int k=0,sum=0;
        int digit[] = new int[2];
        int verify[] = new int[2];
        verify[0]= obterDigito(cpf,1);
        verify[1]= obterDigito(cpf,2);
        
        while(k<9){
            sum+=obterDigito(cpf,11-k)*(++k);
        }
        digit[1]=obterDigito((long)(sum%11),1);
        k=1;
        sum=0;
        while(k<9){
            sum+=obterDigito(cpf,11-k)*(k++);        
        }
        sum+=digit[1]*k;
        digit[0]=obterDigito((long)(sum%11),1);
        
        return (digit[0]==verify[0] && digit[1]==verify[1]);
        
    }
    
    public static boolean validarCpf(String cpf){
        int k=0,index=0;
        long sum=0;
        char at;
        
        while(k<cpf.length()){
            at=cpf.charAt(cpf.length()-k-1);
            if( !Character.isDigit(at) ){
                k++;
                continue;
            }
            sum+=((Double)(Character.digit(at, 10)*Math.pow(10,index++))).longValue();
            k++;
        }
        return validarCpf(sum);
    }
}

