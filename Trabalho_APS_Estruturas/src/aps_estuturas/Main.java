package aps_estuturas;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        TadFila fila = new TadFila(60);
        int numeros;
        int[] num = new int[20];
        Random gerador = new Random();

        for(int i = 0; i<num.length; i++){
            numeros = gerador.nextInt(60) + 1;
            for(int j=0; j<num.length; j++){
                if(numeros == num[j] && j != i){
                    numeros = gerador.nextInt(60) + 1;
                }else{
                    num[i] = numeros;
                }
            }
        }
        for(int i = 0; i < num.length; i++){
            fila.Enqueue(num[i]);
        }
        fila.imprimeFila();
    }
    
}
