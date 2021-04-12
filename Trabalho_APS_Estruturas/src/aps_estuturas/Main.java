package aps_estuturas;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        TadFila fila = new TadFila(60);
        int x = 60; 

        Random gerador = new Random();

        for(int i = 0; i < 20; i++){
            fila.Enqueue(gerador.nextInt(x));
        }

        fila.imprimeFila();
    }
    
}
