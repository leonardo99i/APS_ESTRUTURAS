package aps_estuturas;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        TadFila fila = new TadFila(60);
         

        Random gerador = new Random();
        int numero = gerador.nextInt(60);

        for(int i = 0; i < 21; i++){
            if(gerador.nextInt() == 0){
                fila.Enqueue(gerador.nextInt(numero));
            }else{
                fila.Enqueue(gerador.nextInt(numero));
            }
        }

        fila.imprimeFila();
    }
    
}
